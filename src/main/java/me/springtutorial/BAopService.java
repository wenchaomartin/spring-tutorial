package me.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by songwenchao on 2019-07-30
 */
@Service
public class BAopService {

  @Autowired
  BookRepository bookRepository;
  @Autowired
  AopService aopService;

  public void amethod() {
    System.out.println("hello world");
    aopService.bmethod();
  }


}
