package CS5800HW6;


public abstract class SnackDispenseHandler 
{
    private SnackDispenseHandler next;
    

    public SnackDispenseHandler(SnackDispenseHandler next)
    {
        this.next = next;
    }
    
    public  void snackRequest(Snack snack, double money, int quantity)
    {
        if(next != null && money > 0)
        {
            next.snackRequest(snack, money, quantity);
        }
    }
    
        /** 
        if(snackType.getQuantity() >= quantity && snackType.getPrice()*quantity <= money)
        {
            System.out.println("dispensing snack(s)");
            money -= snackType.getPrice()*quantity;

        }
        if(money >0 && next != null)
        {
            next.snackRequest(snackType,money,quantity);
        }
        */

}
