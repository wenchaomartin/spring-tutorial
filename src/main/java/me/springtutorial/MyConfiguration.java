package me.springtutorial;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Create by songwenchao on 2019-07-09
 */

@Configuration
@Import({Cat.class,RabbitConfig.class,CustomSelector.class,CustomBeanDefinitionRegistrar.class})
public class MyConfiguration {
  @Bean(initMethod="init",destroyMethod="customDestroy")
  public Person person(){
    Person person = new Person();
    person.setName("martin");
    person.setAddress("shahai");
    person.setPhone("124");
    return person;
  }

  @Bean
  public BeanPostProcessor myBeanPostProcessor(){
    return new MyBeanPostProcessor();
  }

  @Bean
  public Dog dog(){
    return new Dog();
  }
}
