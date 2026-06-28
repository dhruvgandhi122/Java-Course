package Exception;
class myChoiceException extends Exception{
    public myChoiceException(String abc){
        super(abc);
    }
}




public class ExceptionImp {
    public static void main(String[] args) {
        int i=1;
        int j=0;
        try{
            j = 18/i;
            if(j==18){
                throw new myChoiceException("This is the exclusive exception throwed by the programmer.");
            }
        }
        catch(myChoiceException e){ 
            System.out.println("I don't want the value of j to be 18.Provide different value for i."+e);

        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide a number by zero.Please change the value of i"+e);
        }
        try{
            int nums[]= new int[4];
            System.out.println(nums[3]);
            System.out.println(nums[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limits.Do not exceed the array limits"+e);
        }
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("You cannot print the length of Null String"+e);
        }
    }
}
