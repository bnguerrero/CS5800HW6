package CS5800HW6;

public class WaitForMoneyState implements StateOfVendingMachine
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
        // do nothing 
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) 
    {
        vendingMachine.setState(new DispensingSnackState());
        vendingMachine.setMessage("Dispensing snack");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }
    
}
