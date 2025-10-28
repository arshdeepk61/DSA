package Swetha.oops;

//Encapsulation- wrapping variables & methods together,
// and restricting direct access using getters/setters

//Data is hidden(private)
//Access only through public getter/setter
public class Student {
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

}
