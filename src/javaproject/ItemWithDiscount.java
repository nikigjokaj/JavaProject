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
public class ItemWithDiscount extends Item {
    
    private double discount;

    public ItemWithDiscount(String itemName, int itemID, double itemPrice, int tableNumber, double discount) {
        super(itemName, itemID, itemPrice, tableNumber);
        this.discount = discount;
    }
    
    public void setItemDiscount(int discountAmount) {
        this.discount = discountAmount;
    }
    
    public double getItemDiscount() {
        return this.discount;
    }
    
    public double calculateDiscount(){
        double itemPrice = this.getItemPrice();
         itemPrice = itemPrice - this.discount;
         return itemPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    @Override
    public void printInfo() {
        System.out.println("Item name: " + this.getItemName() + ", ID: " + this.getItemID() + ", Price: $" + this.calculateDiscount() + ", Table Number: " + this.getTableNumber());
    }
    
}
