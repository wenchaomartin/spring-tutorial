package me.springtutorial;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-21
 */
@Component
public class MyListener3 {
  @EventListener(HiEvent.class)
  public void helloWorld(){
    System.out.println("hi world");
  }
}
