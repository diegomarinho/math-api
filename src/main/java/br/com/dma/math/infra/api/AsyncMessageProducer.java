package br.com.dma.math.infra.api;

public interface AsyncMessageProducer {

  void sendMessageToSearchAddress(String zipCode);

  void sendMessageToPersistenceFallback(Object entity);
}
