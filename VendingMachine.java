package CS5800HW6;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{
    private List<Snack> snacks;
    private StateOfVendingMachine state;
    private SnackDispenseHandler snackHandler; 
    
    public VendingMachine()
    {
        snacks = new ArrayList<>();
        state = new IdleState();
        this.snackHandler = new ChipDispenseHandler(new SodaDispenseHandler(new CandyDispenseHandler(null)));

        snacks.add(new Snack("pepsi", 1.50, 9, "soda"));
        snacks.add(new Snack("coke", 1.25, 5, "soda"));
        snacks.add(new Snack("cheetos", 2.00, 10, "chip"));
        snacks.add(new Snack("doritos", 1.00, 2, "chip"));
        snacks.add(new Snack("kitkat", .50, 3, "candy"));
        snacks.add(new Snack("snickers", .75, 4, "candy"));
    }

    private String message = "message";

    public void setState(StateOfVendingMachine state)
    {
        this.state = state;
    }
    public StateOfVendingMachine getState()
    {
        return state;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public void selectSnack(String snackName)
    {
        getState().selectSnack(snackName, this);

    }
    public void insertMoney(double money, int quantity)
    {
        getState().insertMoney(money, quantity, snackHandler,  this);
    }
    public void dispenseSnack()
    {
        getState().dispenseSnack(snackHandler, this);
        
    }

    public List<Snack> getSnacks()
    {
        return snacks;
    }
    

}
