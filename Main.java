package CS5800HW6;

public class Main 
{
    public static void main(String[] args) 
    {
        VendingMachine vendingMachine = new VendingMachine();
    
        vendingMachine.selectSnack("coke");
        vendingMachine.insertMoney(1.25, 1);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("pepsi");
        vendingMachine.insertMoney(3.00, 2);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("cheetos");
        vendingMachine.insertMoney(22.00, 10);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("doritos");
        vendingMachine.insertMoney(2.00, 2);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("kitkat");
        vendingMachine.insertMoney(.50, 1);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("snickers");
        vendingMachine.insertMoney(3.00, 4);
        vendingMachine.dispenseSnack();
        vendingMachine.selectSnack("snickers");
        vendingMachine.insertMoney(3.00, 1);
        vendingMachine.dispenseSnack();
        
        


    }    
}
