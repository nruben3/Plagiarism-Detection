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
public abstract class Employee {

private String firstname;
private String lastname;
  
private String socialSecurityNumber;
public Employee() {
}

public Employee(String firstname, String lastname,
String socialSecurityNumber) {
super();
this.firstname = firstname;
this.lastname = lastname;
this.socialSecurityNumber = socialSecurityNumber;
}

public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}
public String getSocialSecurityNumber() {
return socialSecurityNumber;
}
public void setSocialSecurityNumber(String socialSecurityNumber) {
this.socialSecurityNumber = socialSecurityNumber;
}
@Override
public String toString() {
System.out.println(getFirstname()+" "+getLastname()+" with ssn: "+getSocialSecurityNumber());
return " ";
}

public abstract double earnings();


public abstract void raise(double percent);

    void earnings1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

