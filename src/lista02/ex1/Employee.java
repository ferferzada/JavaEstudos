package lista02.ex1;

public class Employee {
    private double salary;
    public double lastSalary;
    public Employee(double salary){
        this.salary = salary;
    }


    public double getSalary(){
        return this.salary;
    }

    public void applyRaise(double pcRaise){
        double firstSalary = this.getSalary();
        double LastSalary = firstSalary * (1+ (pcRaise /100));
        this.lastSalary = firstSalary;
        this.salary = LastSalary;
        System.out.println("The employee have applyRaise, end salary = "+this.getSalary());
    }

    public void salaryDifference(){
        System.out.println("THE DIFFERENCE IS" + (this.getSalary() - this.lastSalary));
    }
}
