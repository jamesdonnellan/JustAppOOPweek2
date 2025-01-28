package ie.atu.week2sem2;

import java.util.ArrayList;

public class JustApp
{
    public static void main(String[] args)
    {
        ArrayList<Food> items = new ArrayList<>(); // a list can only contain one type of class //

        System.out.println("Welcome to Just App");
        System.out.println("You ordered ...");

        // Add some items (burgers,pizzas,fries,salads)
        Burger cheeseburger = new Burger("Cheeseburger",  1.99,  "Tasty");
        Pizza tuna = new Pizza("Tuna Pizza", 8.99,  "Surprisingly nice");
        Pizza classic = new Pizza("Plain",  8.99, "A bit boring");
        Fries curry = new Fries("curry", 1.99, "Nice");

        // Add all the orders to a collection ( array / array list )
        items.add(cheeseburger);
        items.add(tuna);
        items.add(classic);
        items.add(curry);

        // Display all the orders
        for(Food item : items) // for every object that's in the array list //
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
        }

        // Find the cost of the whole order

    }
}
