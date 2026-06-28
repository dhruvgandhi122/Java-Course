package Thread;
public class LambdaRunnableThread {
    public static void main(String[] args) {
        Runnable obj1= ()->{
            for(int i=0;i<=50;i++){
                System.out.println("What is your favourite colour?");
                try{Thread.sleep(1);}catch(InterruptedException e){};
            }
        };
        
        Runnable obj2= ()->{
            for(int i=0;i<=50;i++){
                System.out.println("Bluuuueeeeeee");
               try {Thread.sleep(1);} catch (Exception e) {};
                
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }

}
