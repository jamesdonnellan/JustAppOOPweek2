package ie.atu.week2sem2;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class JustApp
{
    public static void main(String[] args)
    {
        ArrayList<Food> items = new ArrayList<>(); // a list can only contain one type of class //

        System.out.println("\nWelcome to Just App");
        System.out.println("You ordered ...");

        // Add some items (burgers,pizzas,fries,salads)
        Burger cheeseburger = new Burger("\nName: Cheeseburger",  2.00,  "Description: Tasty\n");
        Pizza tuna = new Pizza("Name: Tuna Pizza", 8.45,  "Description: Surprisingly nice\n");
        Pizza classic = new Pizza("Name: Plain",  8.99, "Description: A bit boring\n");
        Fries curry = new Fries("Name: Curry", 1.50, "Description: Nice\n");
        Dessert brownie = new Dessert("Name: Brownie", 4.99, "Description: Delicious\n");

        // Add all the orders to a collection ( array / array list )
        items.add(cheeseburger);
        items.add(tuna);
        items.add(classic);
        items.add(curry);
        items.add(brownie);

        // Display all the orders
        for(Food item : items) // for every object that's in the array list //
        {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getDescription());
        }

        // Find the cost of the whole order
        double totalCost = 0;
        System.out.println("Costs:\n");
        for (Food item : items)
        {
            System.out.println(item.getPrice());
            totalCost += item.getPrice();
        }

        System.out.println("Total Cost: £ " + totalCost);
    }
}
