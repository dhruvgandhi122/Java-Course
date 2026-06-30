package CollectionImp;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
        //In hash set all the values can be printed in any order.But in tree set all the values are printed in Sorted order.In Linked HashSet
        //elements are not sorted but it is printed according to insertion order.we can only apply comparator to treeset ,not to hash and linkedhash set.
        Set<Integer> hs= new HashSet<>();
        hs.add(23);
        hs.add(33);
        hs.add(13);
        hs.add(54);
        hs.add(89);
        hs.add(78);
        System.out.println(hs.hashCode());

        System.out.println("Printing using Enhanced for loop:");
        for(int n:hs){
            System.out.println(n);
        }
        
        System.out.println("Printing using forEach():");
        hs.forEach(n->System.out.println(n));
    }
    
}
