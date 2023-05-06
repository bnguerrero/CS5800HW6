package CS5800HW6;

public interface StateOfVendingMachine // idle, waiting for money, dispensing snack, etc.
{
    void selectSnack(String snackName, VendingMachine vendingMachine);
    void insertMoney(double money, int quantity, SnackDispenseHandler snackHandler, VendingMachine vendingMachine);
    void dispenseSnack(SnackDispenseHandler handler, VendingMachine vendingMachine);
}
