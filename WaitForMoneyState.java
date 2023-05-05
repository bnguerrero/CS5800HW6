package CS5800HW6;

public class WaitForMoneyState implements State
{

    @Override
    public void idle(VendingMachine vendingMachine) 
    {
        vendingMachine.setState(new IdleState());
        vendingMachine.setMessage("Please make a selection");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }

    @Override
    public void waitingForMoney(VendingMachine vendingMachine) 
    {
        // do nothing 
    }

    @Override
    public void dispensingSnack(VendingMachine vendingMachine) 
    {
        vendingMachine.setState(new DispensingSnackState());
        vendingMachine.setMessage("Dispensing snack");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }
    
}
