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
public class Application {
    
    Input input = new Input();
    Output output = new Output();
    BarRestaurant barRestaurant = new BarRestaurant();
    ArrayList<Waiter> waiters = barRestaurant.getWaiters();
    ArrayList<Manager> managers = barRestaurant.getManagers();
    ArrayList<Table> tables = barRestaurant.getTables();

    
    public void run() {
        
        barRestaurant.runProgram();
        while(barRestaurant.userLogged) {
            barRestaurant.mainMenu();
            int choice = input.getInt();
            switch(choice) {
                case 1:
                    boolean loop = true;
                    do {
                        try {
                            output.displayStringLine("Chose what kind of table you want to create: (to return to main menu press 0");
                            output.displayStringLine("1. Simple table");
                            output.displayStringLine("2. Table Fidelity");
                            output.displayStringLine("3. Table Company");
                            output.displayStringLine("4. Table Employee");
                            output.displayStringLine("YOUR CHOICE: ");
                            int tableCreateChoice = input.getInt();
                            switch (tableCreateChoice) {
                                case 0: break;
                                case 1:
                                    barRestaurant.createTable();
                                    output.displayStringLine("Press 0 to return to last menu");
                                    choice = input.getInt();
                                    if (choice == 0) {
                                        continue;
                                    }
                                    break;
                                case 2:
                                    barRestaurant.createTableFidelity();
                                    output.displayStringLine("Press 0 to return to last menu");
                                    choice = input.getInt();
                                    if (choice == 0) {
                                        continue;
                                    }
                                    break;
                                case 3:
                                    barRestaurant.createTableCompany();
                                    output.displayStringLine("Press 0 to return to last menu");
                                    choice = input.getInt();
                                    if (choice == 0) {
                                        continue;
                                    }
                                    break;
                                case 4:
                                    barRestaurant.createTableEmployee();
                                    output.displayStringLine("Press 0 to return to the last menu");
                                    choice = input.getInt();
                                    if (choice == 0) {
                                        continue;
                                    }
                                    break;
                                default: 
                                    output.displayStringLine("Not a choice in the menu. Try Again!");
                                    
                            }
                            loop = false;
                        }
                        catch (NumberFormatException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers, not strings. Try Again!");
                        } 
                        catch (IndexOutOfBoundsException exception) {
                            System.err.println( "A MANAGER SHOULD NOT CREATE TABLES!");
                            output.displayStringLine("Please log in as waiter to create the table! Try Again!");
                        }
                    } while (loop);
                    break;
                case 2: 
                    barRestaurant.insertItem();
                    output.displayStringLine("Press 0 to return to the main menu");
                    choice = input.getInt();
                    if (choice == 0) {
                        continue;
                    }
                    break;
                case 3:
                    barRestaurant.removeItem();
                    output.displayStringLine("Press 0 to return to the main menu");
                    choice = input.getInt();
                    if (choice == 0) {
                        continue;
                    }
                    break;
                case 4:
                    barRestaurant.modifyItem();
                    output.displayStringLine("Press 0 to return to the main menu");
                    choice = input.getInt();
                    if (choice == 0) {
                        continue;
                    }
                    break;
                case 5:
                    barRestaurant.tableInfo(barRestaurant.currentTable);
                    output.displayStringLine("Press 0 to return to the main menu");
                    choice = input.getInt();
                    if (choice == 0) {
                        continue;
                    }
                    break;
                case 6:
                    loop = true;
                    do {
                        try {
                            int selectTableID;
                            output.displayStringLine("Type in the ID of table to view information");
                            output.displayStringLine("YOUR CHOICE: ");
                            selectTableID = input.getInt();
                            barRestaurant.tableInfo(selectTableID);
                            output.displayStringLine("Press 0 to return to the main menu");
                            choice = input.getInt();
                            loop = false;
                            if (choice == 0) {
                                continue;
                            }
                        } 
                        catch (NumberFormatException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers, not strings. Try Again!");
                        } 
                        catch (IndexOutOfBoundsException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                        }
                    } while (loop);
                    break;
                case 7:
                    loop = true;
                    do {
                        try {
                            int selectDiscountID;
                            output.displayStringLine("Select table to apply 10% discount: ");
                            barRestaurant.printTables();
                            selectDiscountID = input.getInt();
                            output.displayStringLine("BEFORE DISCOUNT");
                            output.displayStringLine("$" + barRestaurant.getTableTotalAmount(selectDiscountID));
                            barRestaurant.getTableAmountDiscount10(selectDiscountID);
                            output.displayStringLine("AFTER DISCOUNT");
                            output.displayStringLine("$" + barRestaurant.getTableAmountDiscount10(selectDiscountID));
                            output.displayStringLine("Press 0 to return to the main menu");
                            choice = input.getInt();
                            loop = false;
                            if (choice == 0) {
                                continue;
                            }
                        } 
                        catch (NumberFormatException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers, not strings. Try Again!");
                        } 
                        catch (IndexOutOfBoundsException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                        }
                    } while (loop);
                    break;
                case 8: 
                    loop = true;
                    do {
                        try {
                            if (barRestaurant.managerLogged == false) {
                                output.displayStringLine("MANAGER LOGIN REQUIRED!!!");
                                barRestaurant.authenticateManager();
                            }
                            
                            if (barRestaurant.managerLogged == true) {
                                double totalAmountOfTables=0;
                                String waiterName = null;
                                output.displayStringLine("Enter username of the waiter to view the total amount of tables: ");
                                String selectWaiterUsername = input.getString();
                                for (int i=0; i<waiters.size(); i++) {
                                    if (selectWaiterUsername.equalsIgnoreCase(waiters.get(i).waiterGetUsername()))
                                        waiterName = waiters.get(i).waiterGetName();
                                }
                                for (int i=0; i<tables.size(); i++) {
                                    if (waiterName.equalsIgnoreCase(tables.get(i).getTableWaiter())) {
                                        totalAmountOfTables = totalAmountOfTables + tables.get(i).getTotalAmount();
                                    }
                                }
                                output.displayStringLine("The total amount of tables for " + selectWaiterUsername + " is #" + totalAmountOfTables);
                                loop = false;
                                output.displayStringLine("Press 0 to return to the main menu");
                                choice = input.getInt();
                                if (choice == 0) {
                                    continue;
                                }
                            }
                        }
                        catch (NumberFormatException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers, not strings. Try Again!");
                        } 
                        catch (IndexOutOfBoundsException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                        }
                    } while (loop);
                    break;
                case 9:
                    loop = true;
                    do {
                        try {
                            if (barRestaurant.managerLogged == false) {
                                output.displayStringLine("MANAGER LOGIN REQUIRED!!!");
                                barRestaurant.authenticateManager();
                            }
                            
                            if (barRestaurant.managerLogged == true) {
                                int overallNumberOfTables=0;
                                String waiterName = null;
                                output.displayStringLine("Enter username of the waiter to view overall number of tables: ");
                                String selectWaiterUsername = input.getString();
                                for (int i=0; i<waiters.size(); i++) {
                                    if (selectWaiterUsername.equalsIgnoreCase(waiters.get(i).waiterGetUsername()))
                                        waiterName = waiters.get(i).waiterGetName();
                                }
                                for (int i=0; i<tables.size(); i++) {
                                    if (waiterName.equalsIgnoreCase(tables.get(i).getTableWaiter())) {
                                        overallNumberOfTables = overallNumberOfTables + 1;
                                    }
                                }
                                if (overallNumberOfTables == 0) {
                                    output.displayStringLine("There are no tables from the waiter with such username.");
                                }
                                else if (overallNumberOfTables > 0) {
                                    output.displayStringLine("There are " + overallNumberOfTables + " overall tables created from waiter with that userrname.");
                                }
                            loop = false;
                            }
                            output.displayStringLine("Press 0 to return to the main menu");
                            choice = input.getInt();
                            if (choice == 0) {
                                continue;
                            }
                        }
                        catch (NumberFormatException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers, not strings. Try Again!");
                        } 
                        catch (IndexOutOfBoundsException exception) {
                            System.err.println("Exception: " + exception);
                            output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                        }
                        
                    } while (loop);
                    break;
                    
                case 10:
                    
                case 11:
                    output.displayStringLine("The total amount of all items today is: " + barRestaurant.totalAmountOfAllItems());
                    output.displayStringLine("Press 0 to return to the main menu");
                    choice = input.getInt();
                    loop = false;
                        if (choice == 0) {
                            continue;
                        }
                    break;
                case 12:
                    output.displayStringLine("Authenticate as another waiter");
                    barRestaurant.authenticateUser();
                    output.displayStringLine("Press 0 to return to main menu");
                    choice = input.getInt();
                    loop = false;
                        if (choice == 0) {
                            continue;
                        }
                    break;
                case 13:
                    if (barRestaurant.managerLogged == false) {
                        output.displayStringLine("Switch program to MANAGER");
                        barRestaurant.authenticateManager();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                    }
                    if (barRestaurant.managerLogged == true) {
                        output.displayStringLine("Switch program to WAITER");
                        barRestaurant.authenticateUser();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                    }
                    break;
                case 14:
                    while (choice==14) {
                        barRestaurant.otherMenu();
                        barRestaurant.otherMenuCommands();
                    }
                        break;
                case 15:
                    System.exit(0);
                default:
                    output.displayStringLine("Not a choice in the menu. Try Again!");
            }
            
        }
        
    }
}