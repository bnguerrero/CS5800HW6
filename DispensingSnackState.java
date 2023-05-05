package CS5800HW6;

public class DispensingSnackState implements State
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
        vendingMachine.setState(new WaitForMoneyState());
        vendingMachine.setMessage("Wating for money");
        System.out.println("Vending machine message: " + vendingMachine.getMessage());
    }

    @Override
    public void dispensingSnack(VendingMachine vendingMachine) 
    {
        // do nothing
    }
    
}
