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
public class Manager extends User {
    
    private String internalPhoneNumber;

    public Manager(String internalPhoneNumber, String name, String surname, String username, String password, String address, String number, int id) {
        super(name, surname, username, password, address, number, id);
        this.internalPhoneNumber = internalPhoneNumber;
    }
    
    public String managerGetName() {
        return super.getName();
    }

    public String managerGetSurname() {
        return super.getSurname();
    }

    public String managerGetUsername() {
        return super.getUsername();
    }

    public String managerGetPassword() {
        return super.getPassword();
    }

    public String getInternalPhoneNumber() {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber(String internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Manager name: " + this.getName() + this.getSurname() + ", username: " + this.getUsername() + ", address: " + this.getAddress() + ", number: " + getNumber() + ", ID: " + this.getId() + "Internal number: " + this.getInternalPhoneNumber());
    }
  
}
