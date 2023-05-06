package CS5800HW6;

public class CandyDispenseHandler extends SnackDispenseHandler
{

    public CandyDispenseHandler(SnackDispenseHandler next) 
    {
        super(next);
    }

    @Override
    public void snackRequest(Snack snack, double money, int quantity) 
    {
        if(snack.getQuantity() >= quantity && snack.getPrice()*quantity <= money && snack.getTypeOfSnack().equals("candy"))
        {
            System.out.println("dispensing candy snack(s)");
            money -= snack.getPrice()*quantity;

        }
        else  
        {
            System.out.println("not enought money or stock available");
            super.snackRequest(snack, money, quantity);
        }
    }
    
}
