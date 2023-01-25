import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> ls = new ArrayList();
        ls.add("Apple");
        ls.add("Pear");
        ls.add("Orange");
        ls.add("Grape");
        List<String> filtered = ListExamples.filter(ls, new StringChecker() {
            public boolean checkString(String s){
                return s.contains("r");
            }
        });
        ls.remove("Apple");
        assertArrayEquals(ls.toArray(), filtered.toArray());
    }

    @Test
    public void testMerge(){
        List<String> ls1 = new ArrayList();
        ls1.add("a");
        ls1.add("c");
        ls1.add("e");

        List<String> ls2 = new ArrayList<>();
        ls2.add("b");
        ls2.add("d");
        ls2.add("f");
        ls2.add("g");
        ls2.add("z");

        String[] expected = {"a","b","c","d","e","f","g","z"};
        assertArrayEquals(expected, ListExamples.merge(ls1, ls2).toArray());
    }
}
