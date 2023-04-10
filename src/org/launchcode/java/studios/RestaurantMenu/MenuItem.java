package org.launchcode.java.studios.RestaurantMenu;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String  catagory;
    private final LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String catagory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.catagory = catagory;
        this.dateAdded = LocalDate.now();
    }

    public String getName(String name){
        return name;
    }
    public String getCatagory(){
        return catagory;
    }
    public String getDescription(){
        return description;
    }

    public Double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

      public void setCatagory(String catagory){
        this.catagory = catagory;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(Double price){
        this.price = price;
    }


    public LocalDate getDateAdded(){
        return dateAdded;
    }
    @Override
    public String toString(){
        String newText = isNew() ?" - New!" : "";
        return  name + newText + '\n' + description + " | $" + price;
    }
    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }
        MenuItem otherItem = (MenuItem)toBeCompared;

        return this.name.equals(otherItem.getName());
    }

    private String getName() {
        return null;
    }

    boolean isNew(){
//        LocalDate today = LocalDate.now();
//        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
//        System.out.println(daysBetween + " days since " + name + " was added");
//        return daysBetween < 90;
        return true;
    }
}
