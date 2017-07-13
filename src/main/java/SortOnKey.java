import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by marsalisqualls on 7/13/17.
 */
public class SortOnKey {

    public static void main(String[] args) {
        Map<Integer,String> hm = new LinkedHashMap<Integer,String>();
        hm.put(3,"three");
        hm.put(1,"one");
        hm.put(4,"four");
        hm.put(2,"two");
        printMap(hm);
        Map<Integer, String> treeMap = new LinkedHashMap<>(hm);
        printMap(treeMap);
    }//main

    public static void printMap(Map<Integer,String> map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        while ( it.hasNext() ) {
            Map.Entry entry = (Map.Entry) it.next();
            String key = Integer.toString((Integer) entry.getKey());
            String value = (String) entry.getValue();
            System.out.println(key + " => " + value);
        }//while
        System.out.println("========================");
    }//printMap

}//class
