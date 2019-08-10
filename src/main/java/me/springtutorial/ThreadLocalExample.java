package me.springtutorial;

public class ThreadLocalExample {

    private  static ThreadLocal<Integer> threadLocal =
        new ThreadLocal<Integer>();

    public static class MyRunnable implements Runnable {


        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();
            int result = (int) (Math.random() * 100D);
            System.out.println(threadName +" "+ result);
            threadLocal.set( (result));
    
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println(threadName +" "+threadLocal.get());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate

      while(true){
        Thread.sleep(1000000000000L);
      }
    }

}