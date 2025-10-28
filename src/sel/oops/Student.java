package sel.oops;

public class Student {

    //ENCAPSULATION- Binding data and methods together
    // Restrticting access to the internal state of the object


    //Benefit-Improves security , avoids accidental changes and hides complexity
    private String name;
    private int admissionNumber;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
