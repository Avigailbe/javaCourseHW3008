package home_work3008;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    //receives a list of objects and sorts them in ascending order
    //additional param to compare between objects and return a sorted list
    public static <T> List<T> sort (List<T> objects, MySorter mySorter){
        T holder;
        List<T> sortedList = new ArrayList<>(objects);
        for (int i = 0; i < sortedList.size(); i++) {
            for (int j = 1+i; j < sortedList.size(); j++){
                //if the current element is > than the one after they will switch places
                //with the help of a holder to ensure they don't overwrite
                if (mySorter.sort(sortedList.get(i),sortedList.get(j))){
                    holder = sortedList.get(j);
                    sortedList.set(j,sortedList.get(i));
                    sortedList.set(i,holder);
                }
            }
        }
        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,4,2,6,2);
        List<Integer> sortedIntList;

        System.out.println("Int list before being sorted:");
        for (Integer notSorted:intList) {
            System.out.println(notSorted);
        }
        sortedIntList= home_work3008.ListUtils.sort(intList,(t1, t2) -> (Integer)t2 < (Integer)t1);
        System.out.println("Int list after being sorted:");
        for (Integer sorted:sortedIntList) {
            System.out.println(sorted);
        }

        List<String> petList = List.of("Dog","Cat","Horse","Tiger","Fish","Parrot");
        List<String> sortedStrList;

        System.out.println("Str list before being sorted:");
        for (String notSorted:petList) {
            System.out.println(notSorted);
        }
        sortedStrList= home_work3008.ListUtils.sort(petList,(t1, t2) -> t1.toString().compareToIgnoreCase(t2.toString())>0);
        System.out.println("Str list after being sorted:");
        for (String sorted:sortedStrList) {
            System.out.println(sorted);
        }
    }
}
