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
public class Customer extends User {
    int timesServed = 0;
    double bonus;
    
    public Customer(String name, String surname, String username, String password, String address, String number, int id, int timesServerd) {
        super(name, surname, username, password, address, number, id);
        this.timesServed = timesServed;
    }

    public int getTimesServed() {
        return timesServed;
    }
    
    public void serverCustomer() {
        this.timesServed = this.timesServed + 1;
    }
    
    public void setBonus(double amount) {
        this.bonus = amount;
    }
    
    public double getBonus() {
        return this.bonus;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Customer name: " + this.getName() + this.getSurname() + ", username: " + this.getUsername() + ", address: " + this.getAddress() + ", number: " + getNumber() + ", ID: " + this.getId() + ", times served: " + this.getTimesServed());
    }
   
}
