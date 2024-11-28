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
public class ItemsInOffer extends Item {
    
    private double buyMorePayLess;

    public double getBuyMorePayLess() {
        return buyMorePayLess;
    }

    public void setBuyMorePayLess(double buyMorePayLess) {
        this.buyMorePayLess = buyMorePayLess;
    }
    

    public ItemsInOffer(String itemName, int itemID, double itemPrice, int tableNumber, double buyMorePayLess) {
        super(itemName, itemID, itemPrice, tableNumber);
        this.buyMorePayLess = buyMorePayLess;
    }
    
    public double calculateDiscount(){
         double itemPrice = this.getItemPrice();
         itemPrice = itemPrice - this.buyMorePayLess;
         return itemPrice;
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Item name: " + this.getItemName() + ", ID: " + this.getItemID() + ", Price: $" + this.calculateDiscount() + ", Table Number: " + this.getTableNumber());
    }
    
    
    
}
