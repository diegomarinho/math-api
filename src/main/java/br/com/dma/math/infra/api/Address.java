package br.com.dma.math.infra.api;

import java.util.Map;

public interface Address {

  Map<String, Object> searchAddressByZipCode(String zipCode);

}
