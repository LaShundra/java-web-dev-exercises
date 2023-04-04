package org.launchcode.java.studios.RestaurantMenu;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String  catagory;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String catagory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.catagory = catagory;
        this.dateAdded = new Date();
    }
}
