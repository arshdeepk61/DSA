package Swetha.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        Iterator<Integer> it=numbers.iterator();
        while (it.hasNext())
        {
            Integer val=it.next();
            if(numbers.contains(val))
            {
                it.remove();
            }
        }

        System.out.println(numbers);
    }
}
