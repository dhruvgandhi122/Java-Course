package Thread;
class Counter{
    int count;
    //synchronised keyword makes the code threadsafe it states that the only one of the thread will
    //execute a method at a time.So there will be no race condition.
    public synchronized void increment(){
        count++;

    }
}
public class Synchronised {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 =() ->{
            for (int i=1;i<=100;i++){
                 c.increment();
            }

        };
        Runnable obj2 =() ->{
            for (int i=1;i<=100;i++){
                 c.increment();
            }

        };
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();   //here join() states that the system will wait for thread to complete its task
        t2.join();   //then it will execute print .In the next statement t1 & t2 is executed first
        System.out.println(c.count); //then the system will print c.count
        
    }
    
}
