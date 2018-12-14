package br.com.dma.math.domain;

import br.com.dma.math.aop.LogExecutionInfo;
import br.com.dma.math.domain.api.MathService;
import br.com.dma.math.domain.api.OperationRequest;
import br.com.dma.math.domain.api.OperationResponse;
import br.com.dma.math.infra.api.AsyncMessageProducer;
import br.com.dma.math.infra.api.PersistenceRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class MathServiceImpl implements MathService {

  @Autowired
  private AsyncMessageProducer asyncMessageProducer;

  @Autowired
  private PersistenceRepository persistenceRepository;

  @LogExecutionInfo
  @Override
  public OperationResponse executeMathOperation(OperationRequest operationRequest) {

    BigDecimal result = MathExecutor
        .execute(operationRequest.getOperation(), operationRequest.getParameters());
    OperationResponse operationResponse = new OperationResponse(result);

    asyncMessageProducer.sendMessageToSearchAddress("01001001");

    persistenceRepository.persistMathOperationLog(operationRequest, result);

    return operationResponse;
  }
}
