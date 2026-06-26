class A extends Thread {
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Hello");
             try {
            Thread.sleep(1);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=50;i++){
            System.out.println("Yellow");
             try {
            Thread.sleep(1);
            } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            }
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        A t1=new A();
        B t2 = new B();
        t1.setPriority(7);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
    
}
