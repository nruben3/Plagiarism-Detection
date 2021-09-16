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
public class BasePlusCommissionEmployee extends CommissionEmployee{



private double baseSalary;

  



public BasePlusCommissionEmployee(String firstname, String lastname, String ssn,

double grossSales, double commissionrate,double basesalary)

{

super(firstname,lastname,ssn,grossSales,commissionrate);

this.baseSalary=basesalary;

}


public double getBaseSalary() {

return baseSalary;

}

public void setBaseSalary(double baseSalary) {

this.baseSalary = baseSalary;

}





@Override

public double earnings()

{

return getBaseSalary()+super.earnings();

}



@Override

public String toString() {

System.out.print("Base Salary Plus ");

super.toString();

System.out.printf("  with Base Salary of: $%.2f\n",getBaseSalary());

return "";

}

@Override

public void raise(double percent) {

setCommissionRate(getCommissionRate()+(getCommissionRate()*percent/100));
setBaseSalary(getBaseSalary()+(getBaseSalary()*percent/100));

}
}




