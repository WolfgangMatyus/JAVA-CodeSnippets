package CodeSnippets.Sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        // Sets haben einzigartige Elemente:
        // Liste: 2,10,5,2,2,5,3,2,3
        // Set: 2,3,5,10

        //Set set = new HashSet();

        Set<Double> doubleSet = new HashSet<>();

        System.out.println("Add Elements of doubleSet:");
        doubleSet.add(4.5);
        doubleSet.add(3.2);
        doubleSet.add(1.0);
        doubleSet.add(1.0);
        doubleSet.add(3.2);
        doubleSet.add(23.6);

        System.out.println(doubleSet);

        System.out.println("Add Elements of doubleSet1 and print out if add is successful:");
        Set<Double> doubleSet1 = new HashSet<>();

        System.out.println(doubleSet1.add(4.5));    //true
        System.out.println(doubleSet1.add(3.2));    //true
        System.out.println(doubleSet1.add(1.0));    //true
        System.out.println(doubleSet1.add(1.0));    //false weil doppelt
        System.out.println(doubleSet1.add(3.2));    //false weil doppelt
        System.out.println(doubleSet1.add(23.6));   //true

        System.out.println("Print all Elements of doubleSet1 with for Each:");
        for(Double d : doubleSet1)
            System.out.println(d);

        System.out.println("Remove all Elements of doubleSet:");
        doubleSet.removeAll(doubleSet);
        System.out.println(doubleSet);
    }

}
