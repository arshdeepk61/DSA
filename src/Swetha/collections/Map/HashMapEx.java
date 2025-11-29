package Swetha.collections.Map;

import Swetha.collections.ComparableVsComparator.Student;

import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> studentMap=new TreeMap<>();
        studentMap.put(30,"def");
        studentMap.put(10,"abc");
        studentMap.put(20,"def");
       /* studentMap.put(null,new Student(5,"fggh"));*/
      //  System.out.println(studentMap);

        System.out.println(studentMap.get(10));
        studentMap.remove(10);
        System.out.println(studentMap);
        System.out.println(studentMap.containsValue("def"));

       /* //How to iterate over a map?
        for(Map.Entry<Integer,Student> studentEntry:studentMap.entrySet())
        {
            System.out.println(studentEntry.getKey()+"--->"+studentEntry.getValue());
        }

        //Iterate over keys
        for(Integer rollNo:studentMap.keySet())
        {
            System.out.println(rollNo);
        }

        //Iterate over values
        for(Student student:studentMap.values())
        {
            System.out.println(student.getName());
        }*/

    }
}
