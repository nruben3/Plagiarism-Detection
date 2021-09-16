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
public class HourlyEmployee extends Employee {



private double hourlyWage;

private int hoursworked;



public HourlyEmployee(String firstname, String lastname, String ssn,

double hourlyWage, int hoursworked) {

super(firstname,lastname,ssn);

this.hourlyWage=hourlyWage;

this.hoursworked=hoursworked;

  

}



public double getHourlyWage() {

return hourlyWage;

}

public void setHourlyWage(double hourlyWage) {

if(hourlyWage>0)

{

this.hourlyWage = hourlyWage;   

}

else

{

throw new IllegalArgumentException("HourlyWage must be greater than 0.0");

}

  

}

public int getHoursworked() {

return hoursworked;

}

public void setHoursworked(int hoursworked) {

if(hoursworked>0 && hoursworked<=168)

{

this.hoursworked = hoursworked;   

}

else

{

throw new IllegalArgumentException("Hours Worked must be greater than 0 and less than 168");

}

  

}

@Override

public double earnings()

{

double sal=0;

if(hoursworked<=40)

sal= hourlyWage*hoursworked;

else if(hoursworked>40)

{

sal= (40*hourlyWage)+((hoursworked-40)*(hourlyWage*1.5));   

}

return sal;

}



@Override

public String toString() {

System.out.print("Hourly Employee: ");

super.toString();

System.out.printf("  Hourly Wage: %.2f\n",getHourlyWage());

System.out.println("  Hours Worked: "+getHoursworked());

System.out.printf("  Earnings: $%.2f\n",earnings());

return "";

}

@Override

public void raise(double percent) {

setHourlyWage(getHourlyWage()+(getHourlyWage()*percent/100));

}

}



