package lista02.ex1;

public class Main {

   public static void main(String[] args){
       Employee employee = new Employee();

       double salary = 1477.85;
       double pcRaise = 10;
       employee.setSalary(salary);
       employee.applyRaise(pcRaise);
       employee.diferencaDeSalario();
   }

}
