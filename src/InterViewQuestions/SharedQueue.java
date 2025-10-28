package InterViewQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedQueue {

    private final Queue<Integer> queue=new LinkedList<>();
    private final int LIMIT=5;

    private final ReentrantLock lock= new ReentrantLock();
    private final Condition notFull=lock.newCondition();
    private final Condition notEmpty=lock.newCondition();

    public void produce(int value) throws InterruptedException {
        lock.lock();
        try{
            while(queue.size()==LIMIT) //4 //4
            {
                notFull.await(); //release lock, waits
            }
            queue.add(value); //size -6
            notEmpty.signalAll(); //wake consumers
        }
        finally {
            lock.unlock();
        }
    }

    public int consume() throws InterruptedException {
        lock.lock();
        try{
            while(queue.isEmpty())
            {
                notEmpty.await(); // release lock, waits
            }
            int val=queue.poll();
            notFull.signalAll(); // wake producers
            return val;
        }
        finally {
            lock.unlock();
        }
    }
}
