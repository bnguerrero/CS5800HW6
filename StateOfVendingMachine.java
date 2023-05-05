package CS5800HW6;

public interface StateOfVendingMachine // idle, waiting for money, dispensing snack, etc.
{
    void selectSnack(VendingMachine vendingMachine);
    void insertMoney(VendingMachine vendingMachine);
    void dispenseSnack(VendingMachine vendingMachine);
}
