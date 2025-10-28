package Swetha.Employee;

class Employee{
    int eid,ebasic;
    String ename;
    double eda,epf,egross,etax,enet,eded;

    void calcDed(){
        eda=ebasic * 80/100.0;
        egross=ebasic+eda;
        epf=egross*12/100.0;
        etax=egross*10/100.0;
        eded=epf+etax;
    }
    void calNetSal(){
        enet=egross-eded;
    }
    void displayEmpDetails(){
        System.out.println(eid+"\nename="+ename+"\nnet="+enet+"\negross"+egross+"\nepf="+epf+" "+etax+" "+eded);
    }
    public static void main(String []a) {
        Employee e1=new Employee(); //object creation
        e1.eid=100;
        e1.ename="ABC";
        e1.ebasic=6000;
        e1.calcDed();
        e1.calNetSal();
        e1.displayEmpDetails();

        Employee e2=new Employee();
        e2.eid=20;
        e2.ename="ABC";
        e2.ebasic=6000;
        e2.calcDed();
        e2.calNetSal();
        e2.displayEmpDetails();
    } }
