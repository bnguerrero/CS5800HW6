package CS5800HW6;

public class Main 
{
    public static void main(String[] args) 
    {
        VendingMachine vendingMachine = new VendingMachine();
    
        vendingMachine.waiting();
        vendingMachine.dispending();
        vendingMachine.idle();
    }    
}
