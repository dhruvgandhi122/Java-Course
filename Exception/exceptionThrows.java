package Exception;
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("A");
        Class.forName("ABC");
    }
}
public class exceptionThrows {
   
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
