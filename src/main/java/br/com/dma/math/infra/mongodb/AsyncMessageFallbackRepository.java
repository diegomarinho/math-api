package br.com.dma.math.infra.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsyncMessageFallbackRepository extends MongoRepository<AsyncMessageFallbackEntity, String> {

}
