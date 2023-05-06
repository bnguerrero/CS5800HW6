package CS5800HW6;

public class SodaDispenseHandler extends SnackDispenseHandler
{

    public SodaDispenseHandler(SnackDispenseHandler next) 
    {
        super(next);
    }
    
    @Override
    public void snackRequest(Snack snack, double money, int quantity) 
    {
        if(snack.getQuantity() >= quantity && snack.getPrice()*quantity <= money && snack.getTypeOfSnack().equals("soda"))
        {
            System.out.println("dispensing soda snack(s)");
            money -= snack.getPrice()*quantity;

        }
        else  
        {
            System.out.println("Checking for snack");
            super.snackRequest(snack, money, quantity);
        }
    }

}
