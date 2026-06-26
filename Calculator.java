import java.util.Scanner;
import java.util.*;

public class calculator{
    int add(int a,int b){
        return a+b;
    }
    int sub(int a ,int b){
        return a-b;
    }
    int mul (int a,int b){
        return a*b;
    }
    double div(int a,int b){
        return (double)a/b;
    }

    public static void main (String[] args){
        calculator cal = new calculator();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a =sc.nextInt();
        System.out.println("Enter the second number:");
        int b =sc.nextInt();
        System.out.println("Addition: "+cal.add(a,b));
        System.out.println("Subtraction: "+cal.sub(a,b));
        System.out.println("Multiplication: "+cal.mul(a,b));
        System.out.println("Division: "+cal.div(a,b));
        sc.close();
    }
}
