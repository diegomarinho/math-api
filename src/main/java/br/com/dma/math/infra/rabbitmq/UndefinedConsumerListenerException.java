package br.com.dma.math.infra.rabbitmq;

class UndefinedConsumerListenerException extends RuntimeException {

  UndefinedConsumerListenerException(String consumerQueue) {
    super(String.format("consumerQueue=%s", consumerQueue));
  }
}
