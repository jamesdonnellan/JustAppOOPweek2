package ie.atu.week2sem2;

public class Pizza implements Food
{
    String name;
    double price;
    String description;


    public Pizza(String name, Double price, String description)
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }

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

    public void setPrice(Double price)
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
}
