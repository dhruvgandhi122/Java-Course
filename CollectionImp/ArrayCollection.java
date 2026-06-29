package CollectionImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        //Creating an ArrayList
        List <Integer> nums = new ArrayList<>();
        nums.add(56);
        nums.add(15);
        nums.add(45);
        nums.add(49);    
        //Creating Array List using Another Syntax
        List<Integer>arr = Arrays.asList(12,78,41,65);
        
         System.out.println("Printing using Enhanced for loop:");
        for(int n: nums){
            System.out.println(n);
        }
        
        System.out.println("Now printing using a iterator:");
        Iterator <Integer> values = arr.iterator();
        while (values.hasNext()){
            System.out.println(values.next());
        }
        
        System.out.println("Now Printing using forEach() method:");
        nums.forEach(n->System.out.println(n));
        
        System.out.println();
        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(49));
     
    }
    
}
