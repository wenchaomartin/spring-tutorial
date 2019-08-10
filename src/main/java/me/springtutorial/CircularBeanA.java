package me.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Create by songwenchao on 2019-07-24
 */
@Component
public class CircularBeanA {
 private CircularBeanB circularBeanB;


  public CircularBeanA(CircularBeanB circularBeanB) {
    this.circularBeanB = circularBeanB;
  }

  public CircularBeanA() {
  }

  public CircularBeanB getCircularBeanB() {
    return circularBeanB;
  }

  @Autowired
  public void setCircularBeanB(CircularBeanB circularBeanB) {
    this.circularBeanB = circularBeanB;
  }
}
