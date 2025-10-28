package operators;

import java.util.Scanner;

public class CalculatePercentage {

    //Execution starts from here
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double sum=0;
        double avg;
        double percent;

        System.out.println("How many subjects do you have? ");
        int numOfSubjects=scanner.nextInt();
        double[] marks=new double[numOfSubjects];

        System.out.println("Enter the marks of 5 subjects- ");
        for(int i=0;i<numOfSubjects;i++)
        {
            System.out.println("Enter the marks for subject "+(i+1)+" : ");
            marks[i]=scanner.nextDouble();
            if(marks[i]<0 || marks[i]>100){
                System.out.println("Invalid marks.");
                return;
            }
            sum=sum+marks[i];
        }

        avg=sum/(numOfSubjects*100);

        percent=avg*100;

        System.out.println("Percentage you got is: "+percent+"-->"+ Math.ceil(percent) +" %");
    }
}
