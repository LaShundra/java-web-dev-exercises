package org.launchcode.java.studios.RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
//
//    public void setMenuItems(ArrayList<MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCatagory().equals("Appetizer")) {
                appetizers.append("\n" + item.toString());
            }
        }

        StringBuilder entrees = new StringBuilder();
        for (MenuItem item : menuItems){
            if (item.getCatagory().equals("Entree")){
               entrees.append("\n" + item.toString());
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems){
            if (item.getCatagory().equals("Dessert")) {
                desserts.append("\n" + item.toString());
            }
        }

        return "J & D MENU\n" +
                "\nAPPETIZERS\n" + appetizers.toString() + "\n" +
                "\nENTREES\n" + entrees.toString() + "\n" +
                "\nDESSERTS\n" + desserts.toString() +"\n";
    }

    void addItem(MenuItem item){
        menuItems.add(item);
        lastUpdated = LocalDate.now();
    }

//    void addItem(MenuItem newItem) {
//        String message = "That item has already been added to the menu.";
//        if (menuItems.contains(newItem)) {
//            System.out.println(message);
//            return;
//        }
//        for (MenuItem item : menuItems) {
//            if (item.equals(newItem)) {
//                System.out.println(message);
//                return;
//            }
//        }
//        menuItems.add(newItem);
//        lastUpdated = LocalDate.now();
//    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}
//public void setMenuItems(String items)
