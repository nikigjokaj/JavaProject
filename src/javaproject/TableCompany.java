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
public class TableCompany extends Table {

    private int numberOfTimesServerd;
    
    public TableCompany(int id, double netAmount, double totalAmount, String time, String address, String cashierName, int numberOfTimesServed) {
        super(id, netAmount, totalAmount, time, address, cashierName);
        this.numberOfTimesServerd = numberOfTimesServed;
    }

    public int getNumberOfTimesServerd() {
        return numberOfTimesServerd;
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

    public TimeDate getTimeDate() {
        return timeDate;
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
    
    
    
    public void serverTable() {
        this.numberOfTimesServerd = this.numberOfTimesServerd + 1;
    }
    
    public void CalculateBonus() {
        if (this.numberOfTimesServerd >= 300) {
            super.setTotalAmount(0);
        }
    }
    
    
}
