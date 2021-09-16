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
public class Test {

public static void main(String[] args) {

  

  

  

Employee arr[]={new CommissionEmployee("Fred", "Jones", "111-11-1111", 2000.0, .0500),

new BasePlusCommissionEmployee("Sue", "Smith", "222-22-2222", 3000.0, .0500, 300),

new SalariedEmployee("Sha", "Yang", "333-33-3333", 1150.0),

new HourlyEmployee("Ian", "Tanning", "444-44-4444", 15.0, 50),

new HourlyEmployee("Angela", "Domchek", "555-55-5555", 20.0, 40)};

  

for(int i=0;i<arr.length;i++)

{

System.out.printf("%s",arr[i]);

}

for(int i=0;i<arr.length;i++)

{

if(arr[i] instanceof SalariedEmployee)

{

arr[i].raise(4);

}

else

{

arr[i].raise(2);

}

}

System.out.println("\nEmployee information after raises.");

for(int i=0;i<arr.length;i++)

{

System.out.printf("%s",arr[i]);

}

}

}


