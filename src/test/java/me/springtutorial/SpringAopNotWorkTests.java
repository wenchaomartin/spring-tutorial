package me.springtutorial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringTutorialApplication.class)
public class SpringAopNotWorkTests {

  @Autowired
  AopService aopService;


  @Autowired
  BAopService baopService;

  @Test
  public void b() throws InterruptedException {
    aopService.bmethod();
  }

  @Test
  public void a() throws InterruptedException {
    aopService.amethod();
  }


}
