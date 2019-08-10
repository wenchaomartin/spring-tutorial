package me.springtutorial;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Create by songwenchao on 2019-07-22
 */
public class ReentranLockTest  {
  private static final  ReentrantLock lock = new ReentrantLock();
  public static void main(String[] args)  {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    executorService.execute(ReentranLockTest::action);
    executorService.execute(ReentranLockTest::action);
    executorService.execute(ReentranLockTest::action);
  }

  public static void action() {
    lock.lock();
    try{
      System.out.println(Thread.currentThread().getName()+"-- execute");
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

}
