package InterViewQuestions;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(()->0);
    private static int count=0;
    public static void main(String[] args) {
        try{
            Runnable task =()->{
                int value=threadLocal.get();
                threadLocal.set(1);
                //now we drop the refernce
                threadLocal=null;
                //[null] ->"n1"
                System.out.println(Thread.currentThread().getName()+"->"+threadLocal.get());
            };
            new Thread(task,"T1").start();
            new Thread(task,"T2").start();
        }
        finally {
            threadLocal.remove();
        }


        //Reentrantlock

        ReentrantLock lock=new ReentrantLock();
        lock.lock();
        try{
         //section
        }
        finally {
            lock.unlock();
        }


    }
}
