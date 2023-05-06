package CS5800HW6;

public class WaitForMoneyState implements StateOfVendingMachine
{
    private Snack snack;

    public WaitForMoneyState(Snack snack)
    {
        this.snack = snack;
    }

    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) 
    {
        System.out.println("please insert money and quantity of snacks.");
    }

    @Override
    public void insertMoney(double money, int quantity, SnackDispenseHandler snackHandler, VendingMachine vendingMachine) 
    {
        if (snack.stocked() ) 
        {
            vendingMachine.setState(new DispensingSnackState(snack, money, quantity, snackHandler));
        }
    }

    @Override
    public void dispenseSnack(SnackDispenseHandler handler, VendingMachine vendingMachine) 
    {
        System.out.println("please insert money and quantity of snacks.");
    }
   
}
