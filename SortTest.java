package home_work3008;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class SortTest extends TestCase {

    public void testSort() {
        List<Integer> intList = List.of(1,2,4,2,6,2);
        List<Integer> sortedIntList = List.of(1,2,2,2,4,6);

        Assert.assertEquals(sortedIntList, home_work3008.ListUtils.sort(intList,(t1, t2) -> (Integer)t2 < (Integer)t1));

        List<String> petList = List.of("Dog","Cat","Horse","Tiger","Fish","Parrot");
        List<String> sortedStrList= List.of("Cat", "Dog", "Fish", "Horse", "Parrot", "Tiger");

        Assert.assertEquals(sortedStrList, home_work3008.ListUtils.sort(petList,(t1, t2) -> t1.toString().compareToIgnoreCase(t2.toString())>0));
    }
}