package br.com.dma.math.infra.api;

import br.com.dma.math.domain.api.OperationRequest;
import java.math.BigDecimal;

public interface PersistenceRepository {

  void persistMathOperationLog(OperationRequest operationRequest, BigDecimal result);

}
