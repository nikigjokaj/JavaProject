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
public class Item {
    
    //SHORTUC FOR INPUT AND OUTPUT
    Output output = new Output();
    Input input = new Input();
    
    private String name;
    private static int id;
    private double price;
    private int tableNumber;
    double discount;

    public Item(String itemName, int itemID, double itemPrice, int tableNumber) {
        this.name = itemName;
        this.id = itemID;
        this.price = itemPrice;
        this.tableNumber = tableNumber;
        
    }
    
    public int getTableNumber() {
        return this.tableNumber;
    }
    
    public int getItemID() {
        return this.id;
    }
    
    public String getItemName() {
        return this.name;
    }
    
    public void printItemWithTableID(int choice) {
        if (choice == tableNumber) {
            output.displayStringLine(id + ". Item " + name);
        } 
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    public double getItemPrice() {
        return this.price;
    }
    
     public void printInfo() {
        System.out.println("Item name: " + this.getItemName() + ", ID: " + this.getItemID() + ", Price: $" + this.getItemPrice() + ", Table Number: " + this.getTableNumber());
    }
     
    public void printItemInformation(String itemName, int itemID, double itemPrice, int tableNumber) {
        output.displayStringLine("Name: " + itemName + ", ID: " + itemID + ", Price: " + itemPrice + ", Table: " + tableNumber);
    }
    
}
