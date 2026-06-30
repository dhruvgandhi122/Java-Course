package CollectionImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args){
        Set<Integer> nums = new TreeSet<>();
        nums.add(25);
        nums.add(98);
        nums.add(65);
        nums.add(46);
        nums.add(19); 
        
        //Here in TreeSet all the elements are printed in the sorted order(by default)
        nums.forEach(n->System.out.println(n));
        System.out.println();
        
        //Here we created a list of the set and applied collection.sort because it is only applicable for list
        System.out.println("Here we created a list of the set and applied collection.sort and used a comparator comp. ");
        List<Integer> list = new ArrayList<>(nums);
        Comparator <Integer> comp =(i,j)->((i%10)> (j%10))?1:-1;
        Collections.sort(list,comp);
        list.forEach(c->System.out.println(c));
        System.out.println();

        //we can also make the use of comparator without making the use of list
        System.out.println("Here we make the use of comparator without making the use of list by declaring it while creating the TreeSet:");
        Set<Integer> ts= new TreeSet<>(comp);
        ts.add(85);
        ts.add(25);
        ts.add(98);
        ts.add(65);
        ts.add(46);
        ts.add(19);
        ts.forEach(c->System.out.println(c));

    }
    
}
