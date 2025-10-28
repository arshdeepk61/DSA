package InterViewQuestions;

import java.util.TreeMap;

public class TreeMapExample {
    //Uses a natural ordering of keys(Comparable)
    //you can provide a comparator at construction
    // methods all run in O(log n) -> because of the tree structure
    //Tree map implements Navigable Map-> firstKey()/lastKey()
    //Doesn't allow null keys (throw nullpointer)
    //But value can be null
    //Not thread safe-> For concurrent sorted maps -> use concurrentSkiplISTMAP


    public static void main(String[] args) {

        TreeMap<Integer,String> map=new TreeMap<>();

        map.put(3,"Three");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(5,"Five");

        System.out.println(map);

        //Navigable methods
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.higherEntry(3));
        System.out.println(map.floorKey(3));
    }


}
