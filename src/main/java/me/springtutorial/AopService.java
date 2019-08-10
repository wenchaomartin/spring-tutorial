package me.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by songwenchao on 2019-07-30
 */
@Service
public class AopService {

  @Autowired
  BookRepository bookRepository;

  public void amethod() {
    System.out.println("hello world");
    bmethod();
  }


  @Transactional
  public void  bmethod() {
    Book book1 = new Book("1234", 123.23);
    Book book2 = new Book("martin", 253.00);

    bookRepository.save(book1);
    bookRepository.save(book2);
    throw new RuntimeException("000");

  }
}
