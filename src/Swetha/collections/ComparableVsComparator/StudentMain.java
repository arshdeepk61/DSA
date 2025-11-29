package Swetha.collections.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(3,"Karan"));
        students.add(new Student(1,"Amit"));
        students.add(new Student(2,"John"));

       // Collections.sort(students);

        Collections.sort(students,new NameComparator());
        System.out.println("Sort by name: "+students);

        Collections.sort(students,new IdDescComparator());
        System.out.println("Sort by Id(in Desc order): "+students);

        System.out.println(students);
    }
}
