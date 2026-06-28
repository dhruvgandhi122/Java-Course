package Enum;
enum Status{
    Running,Paused,Pending,Suspended,Completed;
}
public class EnumImplementation {
    public static void main (String[] args){
        Status s1 = Status.Running;
        switch(s1){
            case Running:System.out.println("The status is Running");break;
            case Paused:System.out.println("The status is Paused");break;
            case Pending:System.out.println("The status is Pending");break; 
            case Suspended:System.out.println("The status is Suspended");break;
            case Completed:System.out.println("The status is Completed");break;
        }
        Status ss[] = Status.values();
        for(Status s : ss){
            System.out.println(s);
        }
         int s2 = Status.Pending.ordinal();
         System.out.println(s2);
    }
}