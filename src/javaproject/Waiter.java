/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author nikigjokaj
 */
public class Waiter extends User {
    
    private String InternalPhoneNumber;
    private double wagePerHour;
    private double hoursOfWork;
    private double bonus;

    public Waiter(String InternalPhoneNumber, String name, String surname, String username, String password, String address, String number, int id) {
        super(name, surname, username, password, address, number, id);
        this.InternalPhoneNumber = InternalPhoneNumber;
    }
    

    public String waiterGetName() {
        return super.getName();
    }

    public String waiterGetSurname() {
        return super.getSurname();
    }

    public String waiterGetUsername() {
        return super.getUsername();
    }

    public String waiterGetPassword() {
        return super.getPassword();
    }

    public String getInternalPhoneNumber() {
        return InternalPhoneNumber;
    }

    public void setInternalPhoneNumber(String InternalPhoneNumber) {
        this.InternalPhoneNumber = InternalPhoneNumber;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }
    
    public void setBonus(double amount) {
        this.bonus = amount;
    }
    
    public double getBonus() {
        return this.bonus;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Waiter name: " + this.getName() + this.getSurname() + ", username: " + this.getUsername() + ", address: " + this.getAddress() + ", number: " + getNumber() + ", ID: " + this.getId() + ", wage per hour: " + this.getWagePerHour() + ", bonus: " + this.getBonus());
    }
    
}
