package me.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-24
 */
@Component
public class CircularBeanB {
  private CircularBeanA circularBeanA;

  public CircularBeanB(CircularBeanA circularBeanA) {
    this.circularBeanA = circularBeanA;
  }

  public CircularBeanB() {
  }

  public CircularBeanA getCircularBeanA() {
    return circularBeanA;
  }

@Autowired
  public void setCircularBeanA(CircularBeanA circularBeanA) {
    this.circularBeanA = circularBeanA;
  }
}
