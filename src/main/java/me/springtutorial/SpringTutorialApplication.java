package me.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableTransactionManagement(proxyTargetClass=true)
public class SpringTutorialApplication {

  public static void main(String[] args) {

//  ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringTutorialApplication.class,args);
//
//  applicationContext.publishEvent(new MyEvent("hello world"));
//  applicationContext.publishEvent(new HiEvent("hi"));

    SpringApplication.run(SpringTutorialApplication.class,args);

  }


}
