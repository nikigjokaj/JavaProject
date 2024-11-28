/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.ArrayList;

/**
 *
 * @author nikigjokaj
 */
public class Table {
    
    //SHORTCUT FOR INPUT AND OUTPUT
    Input input = new Input();
    Output output = new Output();
    
    private static int id;
    private double netAmount;
    private double totalAmount;
    private String address;
    private String cashierName;
    TimeDate timeDate = new TimeDate();
    String time;
    ArrayList<Item> items = new ArrayList<Item>();
    

    public Table(int id, double netAmount, double totalAmount, String time, String address, String cashierName) {
        
        this.id = id;
        this.netAmount = netAmount;
        this.totalAmount = totalAmount;
        this.time = time;
        this.address = address;
        this.cashierName = cashierName;
        
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public void removeFromTotalAmount(double amount) {
        this.totalAmount = this.totalAmount - amount;
    }
    
     public String getTableWaiter() {
        return this.cashierName;
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Table.id = id;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public TimeDate getTimeDate() {
        return timeDate;
    }

    public void setTimeDate(TimeDate timeDate) {
        this.timeDate = timeDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
     
}