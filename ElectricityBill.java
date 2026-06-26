import java.util.Scanner;

public class ElectricityBill {                                            //Date-25/6/26
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of units consumed.");
        int units=sc.nextInt();
        int bill=0;
        
        if(units>=0 &&units<=100){
            bill=units *5;
        }else if (units>100 && units<=200){
            units = units -100;
            bill=(units*7)+(100*5);
        }else if(units>200 && units <=300){
            units = units-200;
            bill = (units*10)+(100*7)+(100*5);
        }
        else if(units>300){
            units=units-300;
            bill= (units*12)+(100*10)+(100*7)+(100*5);
        }else{
            System.out.println("Please provide the correct units.");
        }
        System.out.println("The total Electricity bill is : "+bill);


    }
    
}
