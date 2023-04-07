package org.launchcode.java.studios.RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;



public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }
//
//    public void setMenuItems(ArrayList<MenuItem> menuItems) {
//        this.menuItems = menuItems;
//    }

    @Override
    public String toString(){
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems){
            if (item.getCatagory().equals("appetizer")) {
                appetizers.append("\n" + item.toString());
            }
        }
        StringBuilder entree = new StringBuilder();
        for (MenuItem item : menuItems){
            if (item.getCatagory().equals("entree")){
               entree.append("\n" + item.toString());
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : menuItems){
            if (item.getCatagory().equals("dessert")) {
                dessert.append("\n" + item.toString());
            }
        }
        return "J & D MENU \n" + "\nAPPETIZERS\n" + appetizers.toString() +
                "\n"+ "\nENTREES\n" + entree.toString() + "\n" +
                "\nDESSERTS\n" + dessert.toString() + "\n";
    }


    void addItem(MenuItem newItem) {
        String message = "That item has already been added to the menu.";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}
//public void setMenuItems(String items)
