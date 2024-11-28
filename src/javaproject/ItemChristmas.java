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
public class ItemChristmas extends Item {

    private double discountChristmas;
    private double discount;
    
    public ItemChristmas(String itemName, int itemID, double itemPrice, int tableNumber, double discount, double discountChristmas) {
        super(itemName, itemID, itemPrice, tableNumber);
        this.discountChristmas = discountChristmas;
        this.discount = discount;
    }

    public double getDiscountChristmas() {
        return discountChristmas;
    }

    public void setDiscountChristmas(double discountChristmas) {
        this.discountChristmas = discountChristmas;
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

    public void setItemDiscountChristmas(int discountAmount) {
        this.discountChristmas = discountAmount;
    }
    
    public double getItemDiscount() {
        return this.discount;
    }
    
    public double getItemDiscountChristmas() {
        return this.getItemDiscount() + this.discountChristmas;
    }
    
    public double calculateDiscount(){
        double itemPrice = this.getItemPrice();
         itemPrice = itemPrice - this.getItemDiscount() - this.discountChristmas;
         return itemPrice;
    }
    
    @Override
    public void printInfo() {
        System.out.println("Item name: " + this.getItemName() + ", ID: " + this.getItemID() + ", Price: $" + this.calculateDiscount() + ", Table Number: " + this.getTableNumber());
    }
    
    
    
    
    
    
    
    
}
