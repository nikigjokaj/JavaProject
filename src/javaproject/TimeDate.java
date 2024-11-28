/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nikigjokaj
 */
public class TimeDate {
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
    Date date = new Date();
    
    public String getTimeAndDate() {
        
        String time = dateFormat.format(date);
        
        return time;
    }
    
}


