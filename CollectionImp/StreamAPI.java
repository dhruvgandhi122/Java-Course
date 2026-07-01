package CollectionImp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(22,45,65,14,3,6,65,2235,56,1,51,2,38,231);
        //Here we created a steam named S1. A stream can be used only once.
       
        /*
        Stream <Integer> S1=nums.stream();
        Stream<Integer> S2= S1.filter(n-> n%2==0);
        Stream<Integer> S3= S2.map(n->n*2);
        int result = S3.reduce(0,(c,e)->c+e); */   // This means sum of all elements.we can write this is any an simpler manner given as below:

        int result =nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,e)->c+e);

        System.out.println("Printing the sum of the elements of filtered and mapped ArrayList nums :");
        System.out.println(result);
        System.out.println();
        
        Comparator<Integer> comp= (i,j)->(i%10 > j%10)?1:-1;
        System.out.println("Sorting by applying Stream:");
        Stream<Integer> S1= nums.stream()
                                .filter(n->n%2==0)
                                .map(n->n*4)
                                .sorted(comp);
        S1.forEach(n->System.out.println(n));
    }    
}
