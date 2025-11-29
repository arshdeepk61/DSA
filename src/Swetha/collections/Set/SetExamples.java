package Swetha.collections.Set;

import Swetha.collections.ComparableVsComparator.NameComparator;
import Swetha.collections.ComparableVsComparator.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        Set<Student> students=new TreeSet<>();
        students.add(new Student(3,"Karan"));
        students.add(new Student(1,"Amit"));
        students.add(new Student(2,"John"));

/*        //Using for-each loop
        for(Integer num:numbers){
            System.out.println(num);
        }*/

        //Using iterators
        Iterator<Student> it=students.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
