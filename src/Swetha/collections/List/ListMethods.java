package Swetha.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        //After 1st index, all the elements will be shifted
        list.add(1,"D");

        //Returns the element at specific index
        String value=list.get(3);
        System.out.println(value); // It will print C as it's present at 3rd index

        //Update/replaces element at given index
        list.set(1,"X");

        //Removes by index or by object
        list.remove(1);

        list.remove("C");

        //Checks if value exists-> returns boolean
        boolean hasC=list.contains("C");
        boolean hasP=list.contains("P");

        System.out.println("Has C? "+hasC+" : Has P? " +hasP);

        //Returns number of elements
        int count= list.size();

        System.out.println("Number of elements: "+count);

        //Checks if list is empty
        boolean isEmpty=list.isEmpty();
        System.out.println("Is empty? "+isEmpty);

        //Returns first index of element , otherwise -1
        list.add("A");
        int index=list.indexOf("A");

        System.out.println("Index of A: "+index);

        //Returns first index of element , otherwise -1
        list.add("A");
        int indexLastIndex=list.lastIndexOf("A");

        System.out.println("Last Index of A: "+indexLastIndex);

        //Removes all elements
        //list.clear();

        //Convert a list into an array
        String[] arr= list.toArray(new String[0] );

        //Returns a portion of list
        List<String> sub=list.subList(1,3);

        System.out.println(sub);

    }
}
