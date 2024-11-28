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
public class BarRestaurant {

    //SHORTCUTS:
    Input input = new Input();
    Output output = new Output();

    ArrayList<Waiter> waiters = new ArrayList<>();
    ArrayList<Manager> managers = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Table> tables = new ArrayList<>();
    ArrayList<Table> payedTables = new ArrayList<>();
    ArrayList<Waiter> authenticatedWaiters = new ArrayList<>();
    ArrayList<Manager> authenticatedManagers = new ArrayList<>();
    TimeDate timeDate = new TimeDate();
    boolean userLogged = false;
    boolean managerLogged = false;
    int waitersLoggedIndex = 6;
    int managersLoggedIndex = 3;
    int currentTable = 1;

    public BarRestaurant() {

    }

    public void runProgram() {
        waitersDatabase();
        managerDatabase();
        output.displayStringLine("BarRestaurant - Java Project");
        authenticateUser();
    }

    public void authenticateUser() {
        output.displayString("Username:  ");
        String user = input.getString();
        output.displayString("Password:  ");
        String password = input.getString();
        login(user, password);
    }

    public void authenticateManager() {
        output.displayString("Manager Username:  ");
        String user = input.getString();
        output.displayString("Manager Password:  ");
        String password = input.getString();
        login(user, password);
    }

    public void loginManager(String user, String password) {
        if (managers.get(0).managerGetUsername().equals(user) && managers.get(0).managerGetPassword().equals(password)) {
            output.displayStringLine("Manager " + managers.get(0).managerGetName() + " " + managers.get(0).managerGetSurname() + " logged in!");
            userLogged = true;
            managerLogged = true;
            waitersLoggedIndex = 6;
            managersLoggedIndex = 0;
            authenticatedManagers.add(managers.get(0));
        } else if (managers.get(1).managerGetUsername().equals(user) && managers.get(1).managerGetPassword().equals(password)) {
            output.displayStringLine("Manager " + managers.get(1).managerGetName() + " " + managers.get(1).managerGetSurname() + " logged in!");
            userLogged = true;
            managerLogged = true;
            waitersLoggedIndex = 6;
            managersLoggedIndex = 1;
            authenticatedManagers.add(managers.get(1));
        } else {
            System.err.println("Invalid username or password. Try Again!");
            authenticateUser();
        }
    }

    public void login(String user, String password) {
        if (waiters.get(0).waiterGetUsername().equals(user) && waiters.get(0).waiterGetPassword().equals(password)) {
            output.displayStringLine("Waiter " + waiters.get(0).waiterGetName() + " " + waiters.get(0).waiterGetSurname() + " logged in!");
            userLogged = true;
            waitersLoggedIndex = 0;
            managersLoggedIndex = 3;
            authenticatedWaiters.add(waiters.get(0));
        } else if (waiters.get(1).waiterGetUsername().equals(user) && waiters.get(1).waiterGetPassword().equals(password)) {
            output.displayStringLine("Waiter " + waiters.get(1).waiterGetName() + " " + waiters.get(1).waiterGetSurname() + " logged in!");
            userLogged = true;
            waitersLoggedIndex = 1;
            managersLoggedIndex = 3;
            authenticatedWaiters.add(waiters.get(1));
        } else if (waiters.get(2).waiterGetUsername().equals(user) && waiters.get(2).waiterGetPassword().equals(password)) {
            output.displayStringLine("Waiter " + waiters.get(2).waiterGetName() + " " + waiters.get(2).waiterGetSurname() + " logged in!");
            userLogged = true;
            waitersLoggedIndex = 2;
            managersLoggedIndex = 3;
            authenticatedWaiters.add(waiters.get(2));
        } else if (waiters.get(3).waiterGetUsername().equals(user) && waiters.get(3).waiterGetPassword().equals(password)) {
            output.displayStringLine("Waiter " + waiters.get(3).waiterGetName() + " " + waiters.get(3).waiterGetSurname() + " logged in!");
            userLogged = true;
            waitersLoggedIndex = 3;
            managersLoggedIndex = 3;
            authenticatedWaiters.add(waiters.get(3));
        } else if (waiters.get(4).waiterGetUsername().equals(user) && waiters.get(4).waiterGetPassword().equals(password)) {
            output.displayStringLine("Waiter " + waiters.get(4).waiterGetName() + " " + waiters.get(4).waiterGetSurname() + " logged in!");
            userLogged = true;
            waitersLoggedIndex = 4;
            managersLoggedIndex = 3;
            authenticatedWaiters.add(waiters.get(4));
        } else if (managers.get(0).managerGetUsername().equals(user) && managers.get(0).managerGetPassword().equals(password)) {
            output.displayStringLine("Manager " + managers.get(0).managerGetName() + " " + managers.get(0).managerGetSurname() + " logged in!");
            userLogged = true;
            managerLogged = true;
            waitersLoggedIndex = 6;
            managersLoggedIndex = 0;
            authenticatedManagers.add(managers.get(0));
        } else if (managers.get(1).managerGetUsername().equals(user) && managers.get(1).managerGetPassword().equals(password)) {
            output.displayStringLine("Manager " + managers.get(1).managerGetName() + " " + managers.get(1).managerGetSurname() + " logged in!");
            userLogged = true;
            managerLogged = true;
            waitersLoggedIndex = 6;
            managersLoggedIndex = 1;
            authenticatedManagers.add(managers.get(1));
        } else {
            System.err.println("Invalid username or password. Try Again!");
            authenticateUser();
        }
    }

    public void waitersDatabase() {

        waiters.add(new Waiter("0694852137", "Mike", "Jones", "mike", "mike123", "Sterling Heights", "069353882", 1));
        waiters.add(new Waiter("0698745236", "Oliver", "Gustin", "oliver", "oliver123", "Detroit", "069224799", 2));
        waiters.add(new Waiter("0675893254", "Corinna", "Jackson", "corinna", "123corinna", "Troy", "069961288", 3));
        waiters.add(new Waiter("0699663255", "David", "Hernandez", "david", "david123", "Chicago", "069755412", 4));
        waiters.add(new Waiter("0671748231", "Natalie", "Brown", "natalie", "123natalie", "Detroit", "069448529", 5));

    }

    public void managerDatabase() {
        managers.add(new Manager("0692351619", "Martin", "Clark", "martin", "123martin", "Lansing", "0698455547", 6));
        managers.add(new Manager("0695742264", "Dave", "Amell", "dave", "dave123", "Milwaukee", "0693554218", 7));
    }

    public ArrayList<Waiter> getWaiters() {
        return waiters;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void printAuthenticatedWaiters() {
        for (int i = 0; i < authenticatedWaiters.size(); i++) {
            output.displayStringLine("The waiters who are currently logged in are: " + authenticatedWaiters.get(i).getName());
        }
    }

    public void printAuthenticatedManagers() {
        for (int i = 0; i < authenticatedManagers.size(); i++) {
            output.displayStringLine("The managers who are currently logged in are: " + authenticatedManagers.get(i).getName());
        }
    }

    public void createTable() {

        int waiterIndex = waitersLoggedIndex;
        int size = tables.size() + 1;
        String time = timeDate.getTimeAndDate();
        tables.add(new Table(size, 0, 0, time, "BarRestaurant Address", waiters.get(waiterIndex).waiterGetName()));
        output.displayStringLine("Table " + size + " created!");

    }

    public void createTableFidelity() {

        int waiterIndex = waitersLoggedIndex;
        int size = tables.size() + 1;
        String time = timeDate.getTimeAndDate();
        tables.add(new TableFIdelity(0, size, 0, 0, time, "BarRestaurant Address", waiters.get(waiterIndex).waiterGetName()));
        output.displayStringLine("Table " + size + " created!");

    }

    public void createTableCompany() {

        int waiterIndex = waitersLoggedIndex;
        int size = tables.size() + 1;
        String time = timeDate.getTimeAndDate();
        tables.add(new TableCompany(size, 0, 0, time, "BarRestaurant Address", waiters.get(waiterIndex).waiterGetName(), 0));
        output.displayStringLine("Table " + size + " created!");

    }

    public void createTableEmployee() {

        int waiterIndex = waitersLoggedIndex;
        int size = tables.size() + 1;
        String time = timeDate.getTimeAndDate();
        tables.add(new TableEmployee(size, 0, 0, time, "BarRestaurant Address", waiters.get(waiterIndex).waiterGetName()));
        output.displayStringLine("Table " + size + " created!");

    }

    public void printTables() {

        for (int i = 1; i <= tables.size(); i++) {
            output.displayStringLine(i + ". Table " + i);
        }
    }

    public void printTablesPay() {

        for (int i = 0; i <= tables.size(); i++) {
            output.displayStringLine(i + ". Table " + i);
        }
    }

    public double getTableTotalAmount(int choice) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            if (choice == items.get(i).getTableNumber()) {
                total = total + items.get(i).getItemPrice();
            }
        }
        return total;
    }

    public double getTableAmountDiscount10(int choice) {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            if (choice == items.get(i).getTableNumber()) {
                total = total + items.get(i).getItemPrice();
            }
        }
        total = total * 0.90;
        return total;
    }

    public void tableInfo(int choice) {
        output.displayStringLine("TABLE " + choice + " INFORMATION");
        output.displayStringLine("Table contains items: ");
        for (int i = 0; i < items.size(); i++) {
            if (choice == items.get(i).getTableNumber()) {
                items.get(i).printInfo();
            }
        }
        output.displayStringLine("Total AMOUNT: $" + getTableTotalAmount(choice));
    }

    public void printItem(int choice) {
        for (int i = 0; i < items.size(); i++) {
            if (choice == items.get(i).getTableNumber()) {
                output.displayStringLine(items.get(i).getItemID() + ". Item " + items.get(i).getItemName());
            }
        }
    }

    public void insertItem() {
        boolean loop = true;
        do {
            try {

                output.displayStringLine("Select the table that you want add the item to: ");
                printTables();
                output.displayString("Your choice: ");
                int choice = input.getInt();
                if (choice > tables.size() || choice < 0) {
                    output.displayString("Table doesnt exist, try again: ");
                    choice = input.getInt();
                } else {
                    int size = items.size();
                    output.displayStringLine("You are adding to Table " + choice);
                    output.displayStringLine("Enter name of the new item: ");
                    String itemName = input.getString();
                    output.displayStringLine("Enter the price of the new item: ");
                    double itemPrice = input.getDouble();
                    output.displayStringLine("Chosee the type of the item to create: ");
                    output.displayStringLine("1. Simple item");
                    output.displayStringLine("2. Item With Discount");
                    output.displayStringLine("3. Item Christmas");
                    output.displayStringLine("4. Items in Offer");
                    output.displayStringLine("YOUR CHOICE: ");
                    int itemCreateChoice = input.getInt();
                    switch (itemCreateChoice) {
                        case 1:
                            items.add(new Item(itemName, size, itemPrice, choice));
                            output.displayStringLine("Item " + itemName + " priced " + itemPrice + "$ created!");
                            break;
                        case 2:
                            items.add(new ItemWithDiscount(itemName, size, itemPrice, choice, 0));
                            output.displayStringLine("Item " + itemName + " priced " + itemPrice + "$ created!");
                            break;
                        case 3:
                            items.add(new ItemChristmas(itemName, size, itemPrice, choice, 0, 0));
                            output.displayStringLine("Item " + itemName + " priced " + itemPrice + "$ created!");
                            break;
                        case 4:
                            items.add(new ItemsInOffer(itemName, size, itemPrice, choice, 0));
                            output.displayStringLine("Item " + itemName + " priced " + itemPrice + "$ created!");
                            break;
                        default:
                            output.displayStringLine("Not a choice in the menu. Try Again!");
                    }
                    currentTable = choice;
                }
                loop = false;
            } catch (NumberFormatException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers not strings. Try Again!");
            } catch (IndexOutOfBoundsException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
            }
        } while (loop);
    }

    public void removeItem() {
        boolean loop = true;
        do {
            try {
                output.displayStringLine("Select the table that you want to remove the items from: ");
                printTables();
                output.displayString("Your choice: ");
                int choice = input.getInt();
                printItem(choice);
                choice = input.getInt();
                items.remove(choice);
                output.displayStringLine("Item removed!");
                loop = false;
            } catch (NumberFormatException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers not strings. Try Again!");
            }
        } while (loop);
    }

    public void modifyItem() {
        boolean loop = true;
        do {
            try {
                output.displayStringLine("Select the table that you want to modify the items from: ");
                printTables();
                output.displayString("Your choice: ");
                int choice = input.getInt();
                printItem(choice);
                int choice2 = input.getInt();
                output.displayString("Input new item name: ");
                String inputNewName = input.getString();
                output.displayString("Input new item price: ");
                double inputNewPrice = input.getDouble();
                items.get(choice).setName(inputNewName);
                items.get(choice).setPrice(inputNewPrice);
                output.displayStringLine("Item edited with new name " + inputNewName + " and new price of " + inputNewPrice + "$.");
                loop = false;
            } catch (NumberFormatException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers not strings. Try Again!");
            }
        } while (loop);
    }

    public void printServedTables() {
        output.displayStringLine("Tables being served: ");
        printTables();
    }

    public void payTable() {
        boolean loop = true;
        do {
            try {
                output.displayStringLine("Select the Table you want to pay: ");
                printTablesPay();
                output.displayString("Your choice: ");
                int choice = input.getInt();
                for (int i = 0; i < payedTables.size(); i++) {
                    payedTables.add(i, tables.get(choice));
                }
                output.displayStringLine("Table " + choice + " payed!");
                tables.remove(choice);
                loop = false;
                output.displayStringLine("Table " + choice + " payed!");
            } catch (NumberFormatException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers not strings. Try Again!");
            } catch (IndexOutOfBoundsException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
            }
        } while (loop);
    }

    public void printPayedTables() {
        output.displayStringLine("Payed Tables: ");
        for (int i = 0; i < payedTables.size(); i++) {
            output.displayStringLine("Table " + i + " with amount " + payedTables.get(i).getTotalAmount());
        }
    }

    public double totalAmountOfAllItems() {
        double totalAmount = 0;
        for (int i = 0; i < items.size(); i++) {
            totalAmount = totalAmount + items.get(i).getItemPrice();
        }
        return totalAmount;
    }

    public double printAllBonuses() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            //
        }
        return total;
    }

    public void mainMenu() {
        output.displayStringLine("");
        output.displayStringLine("1. New table");
        output.displayStringLine("2. Insert item in table");
        output.displayStringLine("3. Remove item from table");
        output.displayStringLine("4. Modify item in table");
        output.displayStringLine("5. Print information for current table");
        output.displayStringLine("6. Print information for table with a certain ID");
        output.displayStringLine("7. Apply discount to table with 10%");
        output.displayStringLine("8. Overall number of tables for the waiter with a certain username (Manager Required)");
        output.displayStringLine("9. Total amount of all tables processed by the waiter with a certain username (Namanger Required)");
        output.displayStringLine("10. Total number of all items processed by the waiter with a certain username (Manager Required)");
        output.displayStringLine("11. Total amount of all items of the current day");
        output.displayStringLine("12. Switch program from one waiter to another waiter");
        output.displayStringLine("13. Switch program from Waiter to Manager and viceversa");
        output.displayStringLine("14. NEXT PAGE");
        output.displayStringLine("");
        output.displayStringLine("To terminate program press 15");
        output.displayStringLine("");
    }

    public void otherMenu() {
        output.displayStringLine("");
        output.displayStringLine("1. Change item discount (MANAGER REQUIRED)");
        output.displayStringLine("2. Change item christmas discount (MANAGER REQUIRED)");
        output.displayStringLine("3. Change item offer (MANAGER REQUIRED)");
        output.displayStringLine("4. Print served tables");
        output.displayStringLine("5. Pay table");
        output.displayStringLine("6. Print payed tables");
        output.displayStringLine("7. Print the overall amount for all tables (MANAGER REQUIRED)");
        output.displayStringLine("8. Print bonus (MANAGER REQUIRED)");
        output.displayStringLine("9. Print the overall amount for all items (MANAGER REQUIRED)");
        output.displayStringLine("10. Print logged Waiters (MANAGER REQUIRED)");
        output.displayStringLine("11. Print logged Managers (MANAGER REQUIRED)");
        output.displayStringLine("");
        output.displayStringLine("TO terminate program press 12");
        output.displayStringLine("");

    }

    public void otherMenuCommands() {
        output.displayString("Your CHOICE: ");
        boolean loop = true;
        do {
            try {
                int otherChoice = input.getInt();
                int choice = 0;
                switch (otherChoice) {
                    case 1:
                        output.displayStringLine("");
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 2:
                        output.displayStringLine("");
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 3:
                        output.displayStringLine("");
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 4:
                        printServedTables();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 5:
                        payTable();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 6:
                        printPayedTables();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 7:
                        loop = true;
                        do {
                            try {
                                if (managerLogged == false) {
                                    output.displayStringLine("MANAGER LOGIN REQUIRED!!!");
                                    authenticateManager();
                                }

                                if (managerLogged == true) {
                                    output.displayStringLine("The overall amount for table is: " + totalAmountOfAllItems());
                                    loop = false;
                                }
                                output.displayStringLine("Press 0 to return to the main menu");
                                choice = input.getInt();

                                if (choice == 0) {
                                    continue;
                                }
                            } catch (NumberFormatException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers, not strings. Try Again!");
                            } catch (IndexOutOfBoundsException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                            }

                        } while (loop);
                        break;
                    case 8:
                        loop = true;
                        do {
                            try {
                                if (managerLogged == false) {
                                    output.displayStringLine("MANAGER LOGIN REQUIRED!!!");
                                    authenticateManager();
                                }

                                if (managerLogged == true) {
                                    output.displayStringLine("The bonus is: " + printAllBonuses());
                                    loop = false;
                                }
                                output.displayStringLine("Press 0 to return to the main menu");
                                choice = input.getInt();

                                if (choice == 0) {
                                    continue;
                                }
                            } catch (NumberFormatException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers, not strings. Try Again!");
                            } catch (IndexOutOfBoundsException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                            }

                        } while (loop);
                        break;

                    case 9:
                        loop = true;
                        do {
                            try {
                                if (managerLogged == false) {
                                    output.displayStringLine("MANAGER LOGIN REQUIRED!!!");
                                    authenticateManager();
                                }

                                if (managerLogged == true) {
                                    output.displayStringLine("The overall amount for items is: " + totalAmountOfAllItems());
                                    loop = false;
                                }
                                output.displayStringLine("Press 0 to return to the main menu");
                                choice = input.getInt();

                                if (choice == 0) {
                                    continue;
                                }
                            } catch (NumberFormatException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers, not strings. Try Again!");
                            } catch (IndexOutOfBoundsException exception) {
                                System.err.println("Exception: " + exception);
                                output.displayStringLine("Please enter numbers that are within bounds. Try Again!");
                            }

                        } while (loop);
                        break;
                    case 10:
                        printAuthenticatedWaiters();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 11:
                        printAuthenticatedManagers();
                        output.displayStringLine("Press 0 to return to the main menu");
                        choice = input.getInt();
                        loop = false;
                        if (choice == 0) {
                            continue;
                        }
                        break;
                    case 12:
                        choice = 0;
                        break;
                    default:
                        output.displayStringLine("Not a choice in the menu. Try Again!");
                }
            } catch (NumberFormatException exception) {
                System.err.println("Exception: " + exception);
                output.displayStringLine("Please enter numbers, not strings. Try Again!");
            } catch (IndexOutOfBoundsException exception) {
                System.err.println("MANAGER SHOULD NOT CREATE TABLE!");
                output.displayStringLine("Please log in as waiter to create table! Try Again!");
            }
        } while (loop);
    }
}
