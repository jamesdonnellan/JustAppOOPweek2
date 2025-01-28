package ie.atu.week2sem2;

public class Fries implements Food
{
    String name;
    double price;
    String description;

    public Fries(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public String getDescription()
    {
        return description;
    }
}
