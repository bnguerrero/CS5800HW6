package CS5800HW6;

public class VendingMachine 
{
    private State state = new IdleState();

    private String message = "message";

    public void setState(State state)
    {
        this.state = state;
    }
    public State getState()
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
}
