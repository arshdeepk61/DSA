package Swetha.collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        //Creates fixed size list
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.add(4);

        System.out.println(list);

    }
}
