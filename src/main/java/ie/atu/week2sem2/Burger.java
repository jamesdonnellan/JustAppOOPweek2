package ie.atu.week2sem2;

public class Burger implements Food
{
    String name; // We don't name it so we can reuse it, if you hardcode details into class it is unusable //
    double price;
    String description;

    // Constructor //
    public Burger(String name, double price, String description)
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters //
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void addSauce(String sauce)
    {

    }
}
