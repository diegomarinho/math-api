package br.com.dma.math.chaosmonkey;

import org.springframework.stereotype.Component;

@Component
class FakeComponent {

  @ChaosMonkey
  String executeAnyOperation() {
    return "OK";
  }

}
