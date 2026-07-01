package CollectionImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age,String name ) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [ name: "+ name+" Age :"+ age +" ]";
    }
}


public class ComparatorImp {
    public static void main(String[] args) {
        
        /* This is a way to write comparator but we can also write 
        it using lambda expression

        Comparator<Student> comp =new Comparator<Student>(){
            public int compare(int i,int j){
                if(i.age > j.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        */
        Comparator <Student> comp =(i,j)->(i.age>j.age)?1:-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(15,"Ram"));
        studs.add(new Student(22,"Shyam"));
        studs.add(new Student(22,"Dinesh"));
        studs.add(new Student(16,"Suresh"));
        studs.add(new Student(19,"Sameer"));
        studs.add(new Student(12,"Harsh"));
        studs.forEach(st->System.out.println(st));
        System.out.println();
        System.out.println("Printing the sorted list sorted using comparator: ");
        Collections.sort(studs,comp);
        for(Student n:studs){
            System.out.println(n);
        }

        System.out.println();
        System.out.println("Making other ArrayList: ");
        List<Integer> nums=Arrays.asList(12, 65,11,248,22,3374,59,57,45);
        for(int n:nums){
            System.out.println(n);
        }
        System.out.println();

        
        System.out.println ("Making a comparator and sorting the list nums");
        Comparator <Integer> cc =(i,j)->(i%10 > j%10)?1:-1;
        Collections.sort(nums,cc);
        for(int n:nums){
            System.out.println(n);
        }
        }
    
}
