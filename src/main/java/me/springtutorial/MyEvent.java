package me.springtutorial;

import org.springframework.context.ApplicationEvent;

/**
 * Create by songwenchao on 2019-07-21
 */
public class MyEvent extends ApplicationEvent {
  public MyEvent(Object source) {
    super(source);
    System.out.println(source+" custom event");
  }
}
