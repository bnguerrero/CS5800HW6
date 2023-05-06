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

}
