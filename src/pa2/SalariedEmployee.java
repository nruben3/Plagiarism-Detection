/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa2;

/**
 *
 * @author noahruben
 */
public class SalariedEmployee extends Employee {



private double salary;



public SalariedEmployee(String firstname, String lastname, String ssn,double salary)

{

super(firstname,lastname,ssn);

this.salary=salary;

}



public double getSalary() {

return salary;

}

public void setSalary(double salary) {

if(salary>0)

{

this.salary = salary;   

}

else

{

throw new IllegalArgumentException("Salary must be greater than 0");

}

  

}



@Override

public double earnings()

{

return getSalary();

}



@Override

public String toString() {

System.out.print("Salaried Employee: ");

super.toString();

System.out.printf("  Salary: %.2f\n",getSalary());

System.out.printf("  Earnings: $%.2f\n",earnings());

return "";

}

@Override

public void raise(double percent) {

setSalary(getSalary()+(getSalary()*percent/100));

}

}
