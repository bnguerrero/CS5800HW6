package CS5800HW6;

public abstract class AuthenticationHandler 
{
    private AuthenticationHandler next;

    public AuthenticationHandler(AuthenticationHandler next)
    {
        this.next = next;
    }
    public void handleRequest(String requestType)
    {
        if(next != null)
        {
            next.handleRequest(requestType);
        }
    }
}
