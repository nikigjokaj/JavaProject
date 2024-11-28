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
public class TableFIdelity extends Table {
    
    int tablePoints;

    public TableFIdelity(int tablePoints, int id, double netAmount, double totalAmount, String time, String address, String cashierName) {
        super(id, netAmount, totalAmount, time, address, cashierName);
        this.tablePoints = tablePoints;
    }

    public int getTablePoints() {
        return tablePoints;
    }
    
    public void setPoints() {
        if (super.getTotalAmount() == 10) {
            this.tablePoints = this.tablePoints + 1;
        }
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
    
    public void CalculateBonus() { 
        if (this.tablePoints >= 100) {
            super.removeFromTotalAmount(50);
        }
    }
    
}
