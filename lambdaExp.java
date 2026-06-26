@FunctionalInterface
interface A{
    void add(int i,int j);
}
@FunctionalInterface
interface B{
    void show(int i);
}
public class lambdaExp {
    public static void main(String[] args) {
        A obj1 = (i,j)->System.out.println(i+j);
        obj1.add(3,5);       // lambda expression
        B obj2= (i)->System.out.println("In B we saw :"+i);
        obj2.show(9);       // lambda expression
    }
}