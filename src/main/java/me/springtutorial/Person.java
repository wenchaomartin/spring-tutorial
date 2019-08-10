package me.springtutorial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Create by songwenchao on 2019-07-09
 */
public class Person implements BeanFactoryAware, BeanNameAware,InitializingBean,DisposableBean {

  private String name;

  private String address;

  private String phone;

  private BeanFactory beanFactory;

  private String beanName;

  public Person(){

  }

  public Person(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("set name");
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    System.out.println("set address");
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    System.out.println("set phone");
    this.phone = phone;
  }

  public BeanFactory getBeanFactory() {
    return beanFactory;
  }

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("set beanFactory");
    this.beanFactory = beanFactory;
  }

  @Override
  public void setBeanName(String s) {
    System.out.println("set bean name");
    this.beanName = s ;
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("call destroy bean");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Initializing bean ");
  }


  public void init(){
    System.out.println("customconstruct");
  }


  public void customDestroy(){
    System.out.println("customDestroy");
  }
}
