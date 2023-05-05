package CS5800HW6;

public interface StateOfVendingMachine // idle, waiting for money, dispensing snack, etc.
{
    void idle(VendingMachine vendingMachine);
    void waitingForMoney(VendingMachine vendingMachine);
    void dispensingSnack(VendingMachine vendingMachine);
}
