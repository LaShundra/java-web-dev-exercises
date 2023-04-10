package org.launchcode.java.studios.RestaurantMenu;



public class Restaurant {

    public static void main(String[] args) {

        MenuItem onionRings = new MenuItem("Onion Rings", "Breaded sweet yellow onions fried until crispy golden brown", 7.99, "Appetizer");
        MenuItem baconCheeseburger = new MenuItem("Bacon Cheeseburger", "Candied Applewood smoked bacon, cheese of your choice, quarter pound angus beef, lettuce, tomatoes, pickle, house made honey ranch, sauted onions and a side of tater tots", 9.99, "Entree");
        MenuItem peachCobbler = new MenuItem("Peach Cobbler", "Homemade cobbler with fresh peaches", 8.99, "Dessert");
        MenuItem cheeseSticks = new MenuItem("Mozzarella Sticks", "Breaded mozzarella cheese fried until golden brown", 8.99, "Appetizer");
        MenuItem chickenWings = new MenuItem("Whole Chicken Wings", "Cooked to order, 6, 10, or 12 fried, grilled, or broiled with your choice of dipping sauce", 12.22, "Entree");
        MenuItem cheeseCake = new MenuItem("Vanilla Bean Cheesecake Slice", "Smooth creamy cream cheese topped with strawberries, blueberries, cherries or plain", 11.99, "Dessert");


        Menu menu = new Menu();
        menu.addItem(onionRings);
        menu.addItem(baconCheeseburger);
        menu.addItem(peachCobbler);
        menu.addItem(cheeseSticks);
        menu.addItem(chickenWings);
        menu.addItem(cheeseCake);

//        System.out.println(menu.getMenuItems().size());

        menu.removeItem(onionRings);
        System.out.println(menu);

        System.out.println(cheeseCake.equals(cheeseSticks));

    }
}
