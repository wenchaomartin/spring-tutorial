package me.springtutorial;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create by songwenchao on 2019-07-22
 */
public class AQSTEST {
  private static final CountDownLatch countDownlatch = new CountDownLatch(3);
  public static void main(String[] args) throws InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.execute(()->{

      countDownlatch.countDown();
      System.out.println(Thread.currentThread().getName()+" executing");
    });
    executorService.execute(()->{

      countDownlatch.countDown();
      System.out.println(Thread.currentThread().getName()+" executing");
    });    executorService.execute(()->{

      countDownlatch.countDown();
      System.out.println(Thread.currentThread().getName()+" executing");
    });    executorService.execute(()->{

      countDownlatch.countDown();
      System.out.println(Thread.currentThread().getName()+" executing");
    });
    countDownlatch.await();
    System.out.println("----------------------");
    executorService.shutdown();
  }
}
