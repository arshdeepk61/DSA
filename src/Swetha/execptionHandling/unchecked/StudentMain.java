package Swetha.execptionHandling.unchecked;

public class StudentMain {
    public static void main(String[] args) {
        Student student=null;
        if(student!=null){
            System.out.println(student.getName());
        }
        else {
            System.out.println("Student is null.");
        }

    }
}
