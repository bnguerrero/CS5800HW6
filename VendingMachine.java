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
        this.snackHandler = new SnackDispenseHandler(this.snacks);
        snacks.add(new Snack("pepsi", 1.50, 9));
        snacks.add(new Snack("coke", 1.25, 5));
        snacks.add(new Snack("cheetos", 2.00, 10));
        snacks.add(new Snack("doritos", 1.00, 2));
        snacks.add(new Snack("kitkat", .50, 3));
        snacks.add(new Snack("snickers", .75, 4));


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
    
    public void waiting()
    {
        getState().waitingForMoney(this);
    }
    public void idle()
    {
        getState().idle(this);
    }
    public void dispending()
    {
        getState().dispensingSnack(this);
    }

    public void selectSnack(String snack)
    {
        if (sna)
    }

}
