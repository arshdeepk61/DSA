package Swetha.Assignments;

public class Triangle extends Parent {

    private double side1;
    private double side2;
    private double side3;

    //Default constructor
    public Triangle()
    {
        super();
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }

 /*   //Parameterized constructor
    public Triangle(double side1,double side2,double side3)
    {
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
    }*/

    public double getPerimeter()
    {
        System.out.println("Value from parent class : "+getA());
        return side1+side2+side3;
    }

    public double getArea()
    {
        double s= getPerimeter()/2;
        return Math.sqrt(s* (s-side1)*(s-side2)*(s-side3));
    }
}
