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
public class CommissionEmployee extends Employee

{

//Declaring instance variables

private double grossSlaes;

private double commissionRate;

//Parameterised constructor

public CommissionEmployee(String firstname, String lastname, String ssn,

double grossSales, double commissionrate) {

super(firstname,lastname,ssn);

this.grossSlaes=grossSales;

this.commissionRate=commissionrate;

}

//Setters and Getters.

public double getGrossSlaes() {

return grossSlaes;

}

public void setGrossSlaes(double grossSlaes) {

this.grossSlaes = grossSlaes;

}

public double getCommissionRate() {

return commissionRate;

}

public void setCommissionRate(double commissionRate) {

this.commissionRate = commissionRate;

}

/*earnings() will return the money earned by that person

* Params: void

* Return : double

*/

@Override

public double earnings()

{

return getCommissionRate()*getGrossSlaes();

}

//toString() method will display the contents of the Object.

@Override

public String toString() {

System.out.print("Commissioned Employee: ");

super.toString();

System.out.printf("  Gross Sales: %.2f\n",getGrossSlaes());

System.out.printf("  Commission Rate: %.4f\n",getCommissionRate());

System.out.printf("  Earnings: $%.2f\n",earnings());

return "";
}

@Override

public void raise(double percent) {

setCommissionRate(getCommissionRate()+(getCommissionRate()*percent/100));

}
}
