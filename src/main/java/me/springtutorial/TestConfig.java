package me.springtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-24
 */
@Component
@ComponentScan("me.springtutorial")
@Configuration
public class TestConfig {
//  @Bean
//  public CircularBeanA circularBeanA(){
//    return new CircularBeanA();
//
//  }
//
//  @Bean
//  public CircularBeanB circularBeanB(){
//    return new CircularBeanB();
//
//  }
}
