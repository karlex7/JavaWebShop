/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FRIDAY
 */
    public class Customer {
    private int IDCustomer;
    private String FirstName;
    private String LastName;
    private String Adress;
    private String Email;
    private String CustomerPassword;

    public Customer(String FirstName, String LastName, String Adress, String Email, String CustomerPassword) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Adress = Adress;
        this.Email = Email;
        this.CustomerPassword = CustomerPassword;
    }

    public Customer(int IDCustomer, String FirstName, String LastName, String Adress, String Email, String CustomerPassword) {
        this.IDCustomer = IDCustomer;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Adress = Adress;
        this.Email = Email;
        this.CustomerPassword = CustomerPassword;
    }

    public int getIDCustomer() {
        return IDCustomer;
    }

    public void setIDCustomer(int IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCustomerPassword() {
        return CustomerPassword;
    }

    public void setCustomerPassword(String CustomerPassword) {
        this.CustomerPassword = CustomerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +"FirstName=" + FirstName + ", LastName=" + LastName + ", Adress=" + Adress + ", Email=" + Email + ", CustomerPassword=" + CustomerPassword + '}';
    }
    
}
