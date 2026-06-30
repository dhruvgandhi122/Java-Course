import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows of the triangle:");
        int n=sc.nextInt();
        System.out.println("Printing Right Angled Triangle :");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Printing Inverted Right Angled Triangle :");
        for(int i=n;i>0;i--){
            for(int j=0;i>j;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("Printing a shape:");
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
