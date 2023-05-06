package CS5800HW6;

public class ChipDispenseHandler extends SnackDispenseHandler
{

    public ChipDispenseHandler(SnackDispenseHandler next)
    {
        super(next);
    }

    @Override
    public void snackRequest(Snack snack, double money, int quantity) 
    {
        if(snack.getQuantity() >= quantity && snack.getPrice()*quantity <= money && snack.getTypeOfSnack().equals("chip"))
        {
            System.out.println("dispensing chip snack(s)");
            money -= snack.getPrice()*quantity;

        }
        else  
        {
            System.out.println("Checking for snack");
            super.snackRequest(snack, money, quantity);
        }
    }
    
}
