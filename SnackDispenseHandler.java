package CS5800HW6;

import java.util.List;

public class SnackDispenseHandler 
{
    private SnackDispenseHandler next;
    List<Snack> snacks;

    public SnackDispenseHandler(List<Snack> snacks)
    {
        this.snacks = snacks;
    }

    public void setNextHandler(SnackDispenseHandler next)
    {
        this.next = next;
    }
    
    public void snackRequest(Snack snackType, double money, int quantity)
    {
        if(snackType.getQuantity() >= quantity && snackType.getPrice()*quantity <= money)
        {
            System.out.println("dispensing snack(s)");
            money -= snackType.getPrice()*quantity;

        }
        if(money >0 && next != null)
        {
            next.snackRequest(snackType,money,quantity);
        }
    }
}
