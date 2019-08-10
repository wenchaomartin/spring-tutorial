package me.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by songwenchao on 2019-07-20
 */
@Configuration
public class RabbitConfig {
  @Bean
  public Rabbit rabbit(){
    return new Rabbit();
  }
}
