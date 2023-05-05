package CS5800HW6;

public class IdleState implements StateOfVendingMachine
{

    @Override
    public void idle(VendingMachine vendingMachine) 
    {
        // do nothing
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
       vendingMachine.setState(new DispensingSnackState());
       vendingMachine.setMessage("dispending snack");
       System.out.println("Vending machine message: " + vendingMachine.getMessage());

    }
    
}
