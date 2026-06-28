package Thread;
class A implements Runnable{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Hello. How are you?");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("What is Your Name?");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
public class RunnableThread {
    public static void main (String[] args) throws InterruptedException{
        Runnable obj1= new A();
        Runnable obj2= new B();
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);    
    
        t1.start();
        t2.start();


    }
}
 /*NOW I AM DOING THE SAME USING LAMBDA EXPRESSION AND ANONYMOUS INNER CLASS WITHOUT 
 CREATING CLASS FOR A and B.
 File named- LambdaRunnableThread */