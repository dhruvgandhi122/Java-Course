import java.util.Scanner;
public class Ternary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        String Number =(n%2==0)?"Even":"Odd";
        System.out.println(Number);

    }
}