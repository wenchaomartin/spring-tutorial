package me.springtutorial;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-21
 */
@Component
public class MyListener2 implements ApplicationListener<MyEvent> {
  @Override
  public void onApplicationEvent(MyEvent event) {
    System.out.println("listen to the "+event);
  }
}
