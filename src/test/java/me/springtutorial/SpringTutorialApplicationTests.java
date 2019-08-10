package me.springtutorial;

import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.MutablePropertySources;

import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringTutorialApplicationTests {

  @Test
  public void testPerson() throws InterruptedException {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
    Person person = (Person)applicationContext.getBean("person");
    String [] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    System.out.println("beanDefinitionName ---- ");
    for(String beanDefinitionName : beanDefinitionNames){
      System.out.println(beanDefinitionName);
    }
    Thread.sleep(10000);
  }



  @Test
  public void testCircucalBean() {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
    CircularBeanB circularBeanB = (CircularBeanB)applicationContext.getBean(CircularBeanB.class);
    System.out.println(circularBeanB.getCircularBeanA());
    CircularBeanA circularBeanA = (CircularBeanA)applicationContext.getBean(CircularBeanA.class);
    System.out.println(circularBeanA.getCircularBeanB());
  }

  @Test
  public void testDynamicWireBean(){
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
    beanDefinition.setBeanClass(MyBean.class);

    MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
    mutablePropertyValues.add("date",new Date());
    beanDefinition.setPropertyValues(mutablePropertyValues);
    beanFactory.registerBeanDefinition("myBean",beanDefinition);
    MyBean myBean = (MyBean) beanFactory.getBean("myBean");
    myBean.dosomething();
  }

  private static class MyBean {

    private Date date;

    public void dosomething(){
      System.out.println(date + " from my date");
    }

    public void setDate(Date date) {
      this.date = date;
    }
  }

}
