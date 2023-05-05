package CS5800HW6;

public class DispensingSnackState implements StateOfVendingMachine
{

    @Override
    public void selectSnack(VendingMachine vendingMachine) 
    {
        vendingMachine.setState(new IdleState());
        vendingMachine.setMessage("Please make a selection");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine)
    {
        vendingMachine.setState(new WaitForMoneyState());
        vendingMachine.setMessage("Wating for money");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) 
    {
        // do nothing
    }
    
}
