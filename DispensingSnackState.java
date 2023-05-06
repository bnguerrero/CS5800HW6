package CS5800HW6;

public class DispensingSnackState implements StateOfVendingMachine
{
    private Snack snack;
    private double money;
    private int quantity;
    private SnackDispenseHandler handler;

    public DispensingSnackState(Snack snack, double money, int quantity, SnackDispenseHandler handler)
    {
        this.snack = snack;
        this.money = money;
        this.quantity = quantity;
        this.handler = handler;
    }

    @Override
    public void selectSnack( String snackName, VendingMachine vendingMachine) 
    {
        System.out.println("dispensing snacks(s)");

    }

    @Override
    public void insertMoney(double money, int quantity, SnackDispenseHandler snackHandler, VendingMachine vendingMachine) 
    {
        System.out.println("dispensing snacks(s)");
    }

    @Override
    public void dispenseSnack( SnackDispenseHandler snackHandler, VendingMachine vendingMachine)
    {
        snackHandler.snackRequest(snack, this.money, this.quantity);
        vendingMachine.setState(new IdleState());
    }
    
}
