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
public class TableEmployee extends Table {
    BarRestaurant workers = new BarRestaurant();
    ArrayList<Waiter> waiters = workers.getWaiters();

    public TableEmployee(int id, double netAmount, double totalAmount, String time, String address, String cashierName) {
        super(id, netAmount, totalAmount, time, address, cashierName);
    }

    public void CalculateBonus() {
        String waiter;
        if (super.getTotalAmount() > 500) {
            waiter = super.getTableWaiter();
            for (int i=0; i<waiters.size(); i++) {
                if(waiter.equalsIgnoreCase(waiters.get(i).waiterGetName())) {
                    waiters.get(i).setBonus(50);
                }
            }
        }
    }
 
}
