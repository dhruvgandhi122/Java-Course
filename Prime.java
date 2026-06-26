import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a =sc.nextInt();
        int prime=1;
        
        for(int i=2;i<a;i++){
            if(a%i==0){
                prime=0;
                break;
            }
        }
        
        if (prime==0){
                System.out.println(a+" is not a prime number");
            }else{
                System.out.println(a+" is a prime number");
            }
        sc.close();
    }    
}