package CS5800HW6;

public class IdleState implements StateOfVendingMachine
{

    @Override
    public void selectSnack(VendingMachine vendingMachine) 
    {
        // do nothing
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
       vendingMachine.setState(new DispensingSnackState());
       vendingMachine.setMessage("dispending snack");
       System.out.println("Vending machine message: " + vendingMachine.getMessage());

    }
    
}
