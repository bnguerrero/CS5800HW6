package CS5800HW6;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{
    List<Snack> snacks = new ArrayList<>();
    
    private StateOfVendingMachine state = new IdleState();

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

}
