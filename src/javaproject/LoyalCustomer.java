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
public class LoyalCustomer extends Customer {

    public LoyalCustomer(String name, String surname, String username, String password, String address, String number, int id, int timesServerd) {
        super(name, surname, username, password, address, number, id, timesServerd);
    }

    public int getTimesServed() {
        return timesServed;
    }

    public void setTimesServed(int timesServed) {
        this.timesServed = timesServed;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public void CalculateBonus() {
        if (super.getTimesServed() > 100) {
            super.setBonus(50);
        }
    }
    
    @Override
    public void printInfo() {
        System.out.println("Loyal customer name: " + this.getName() + this.getSurname() + ", username: " + this.getUsername() + ", address: " + this.getAddress() + ", number: " + getNumber() + ", ID: " + this.getId() + ", times served: " + this.getTimesServed() + ", bonus: " + super.getBonus());
    }
    
}
