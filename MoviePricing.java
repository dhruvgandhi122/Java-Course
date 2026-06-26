import java.util.Scanner;

public class MoviePricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age=sc.nextInt();
        sc.nextLine();
        double ticketprice = 200;
        System.out.println("Weekend(yes/no)");
        String weekend=sc.nextLine();
        if(age<12 || age>=60){
            ticketprice = ticketprice*0.5;
        }

        if (weekend.equals("yes")){
            ticketprice = ticketprice + 50;

        }
        System.out.println("The ticket price of the movie is : "+ ticketprice);
    }
    
}
