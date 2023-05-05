package CS5800HW6;

List<Snack> snacks;

public class SnackDispenseHandler 
{
    private SnackDispenseHandler next;

    public SnackDispenseHandler(List<Snack> snacks)
    {
        this.snacks = snacks;
    }

    public void setNextHandler(AuthenticationHandler next)
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
