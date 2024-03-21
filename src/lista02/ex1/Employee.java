package lista02.ex1;

public class Employee {

    private double salary;

    public double lastSalary;

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }

    public void applyRaise(double pcRaise){
        double firstSalary = this.getSalary();
        double LastSalary = firstSalary * (1+ (pcRaise /100));
        this.lastSalary = firstSalary;
        this.setSalary(LastSalary);
        System.out.println("The employee have applyRaise, end salary = "+this.getSalary());
    }

    public void diferencaDeSalario(){
        System.out.println("A DIFERENÇA É " + (this.getSalary() - this.lastSalary));
    }
}
