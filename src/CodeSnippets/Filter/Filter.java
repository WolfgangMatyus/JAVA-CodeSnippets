package CodeSnippets.Filter;

import java.util.LinkedList;
import java.util.List;

public class Filter {

    //public static <T> List<T> filter(List<T> list, Matcher<? super T> m){
    //        List<T> filtered = new LinkedList<>();
    //            for(T t : list){
    //                    if(m.matches(t))
    //                        filtered.add(t);
    //                    }
    //                    return filtered;
    //                    }

    public static <T> List<T> filter(List<T> list, Matcher<? super T > m){
        List<T> filtered = new LinkedList<>();
        for(T t : list){
            if(m.matches(t))
                filtered.add(t);
        }
        return filtered;
    }
}

