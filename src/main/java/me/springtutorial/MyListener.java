package me.springtutorial;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-21
 */
@Component
public class MyListener implements ApplicationListener<ApplicationEvent> {
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    System.out.println("listen "+event.getTimestamp() + " "+ event.getSource()+" "+event);
  }
}
