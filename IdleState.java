package CS5800HW6;

public class IdleState implements StateOfVendingMachine
{
    Snack selectedSnack;
    
    @Override
    public void selectSnack(String snackName, VendingMachine vendingMachine) 
    {
        for (Snack snack : vendingMachine.getSnacks()) 
        {
            if (snack.getName().equals(snackName) && snack.stocked()) 
            {
                this.selectedSnack = snack;
                vendingMachine.setState(new WaitForMoneyState(selectedSnack));
                System.out.println("Selected snack: " + snack.getName());
            }
        }
       
    }

    @Override
    public void insertMoney(double money, int quantity, SnackDispenseHandler snackHandler, VendingMachine vendingMachine) 
    {
        System.out.println("need to make a selection first");
    }

    @Override
    public void dispenseSnack(SnackDispenseHandler snackHandler, VendingMachine vendingMachine)
    {
        System.out.println("need to make a selection first");
    }
    
}
