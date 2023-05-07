package CS5800HW6;

public class Snack 
{
    private String name;
    private double price; 
    private int quantity;
    private String typeOfSnack;

    public Snack(String name, double price, int quantity, String typeOfSnack)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typeOfSnack = typeOfSnack;
    }

    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }   
    public void setQuantity(int newQuantity) 
    {
        this.quantity = newQuantity;
    }
    public String getTypeOfSnack()
    {
        return typeOfSnack;
    }
    public boolean stocked()
    {
        return this.quantity >= quantity;
    }
    public void dispense(int quantity)
    {
        this.quantity -= quantity;
    }
}
