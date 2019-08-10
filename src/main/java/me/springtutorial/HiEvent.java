package me.springtutorial;

import org.springframework.context.ApplicationEvent;

/**
 * Create by songwenchao on 2019-07-21
 */
public class HiEvent extends ApplicationEvent {
  public HiEvent(Object source) {
    super(source);
  }
}
