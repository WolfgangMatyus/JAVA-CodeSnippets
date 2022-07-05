package CodeSnippets.Sort;

import org.w3c.dom.Node;
import java.util.*;
import static java.lang.Math.random;

public class Sort {
    public static void main(String[] args) {
        System.out.println("create an array and fill it with 10 random numbers");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            double element = Math.random()*100;
            array[i] = (int)element;
        }

        System.out.println("print elements in array:");
        for(int element: array)
            print(element);

        System.out.println("\nsort the array:");
        Arrays.sort(array);

        System.out.println("print elements in array:");
        for(int element: array)
            print(element);

        System.out.println("\nconvert array elements to list elements");
        List list = new LinkedList();
        for(int element : array)
            list.add(element);

        System.out.println("sort the list reverse:");
        Collections.reverse(list);

        System.out.println("List elements are Objects, use Objets to iterate in forEach");
        for(Object element  : list)
            print(element);

        System.out.println("\nsort the list back again:");
        Collections.sort(list);
        for(Object element  : list)
            print(element);

        System.out.println("\nconvert list elements to set elements");
        Set set = new HashSet();
        for(Object element : list)
            set.add(element);

        System.out.println("print set random arrangement from conversion:");
        System.out.println(set);

        System.out.println("convert set back to array:");
        int n = 0; Object[] obArray = new Object[set.size()];
        for(Object element : set){
            obArray[n] = element;
            n++;
        }
        for(Object element : obArray)
            print(element);

        System.out.println("\nsort Objekt array:");
        Arrays.sort(obArray);
        for(Object element : obArray)
            print(element);

        System.out.println("\nreverse sort Objekt array:");
        Collections.reverse(Arrays.asList(obArray));
        for(Object element : obArray)
            print(element);
    }

    public static <T> void print(T element){
        System.out.print(element + ", ");
    }

}
