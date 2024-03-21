package lista02.ex1;

public class Main {

   public static void main(String[] args){
       double salary = 1477.85;
       Employee employee = new Employee(salary);

       double pcRaise = 10;
       employee.applyRaise(pcRaise);
       employee.salaryDifference();
   }

}
