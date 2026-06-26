class Account{                                                      //Date-25/6/26
    int balance=10000;
    public void withdraw(int moneyWithdrawed){
        if(balance>moneyWithdrawed){
            if(moneyWithdrawed%100==0 && moneyWithdrawed<=20000){
                balance= balance- moneyWithdrawed;
                System.out.println("Money withdrawn from the bank account is: "+moneyWithdrawed+" .The current remaining balance is: "+balance);
            }else if (moneyWithdrawed>20000){
                System.out.println("You cannot execute a transaction above 20000 at a time.");
            }else{
                    System.out.println("The money to be withdrawn from the bank account should be a multiple of 100.");
            }

        }else{
            System.out.println("Amount to be withdrawn cannot exceed the balance amount.");
        }
    }
}
public class BankAcc {
    public static void main(String[] args) {
        Account A1=new Account();
        A1.withdraw(1111);
        A1.withdraw(20111);
        A1.withdraw(7000);
    }
    
}
