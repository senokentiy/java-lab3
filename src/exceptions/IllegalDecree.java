package exceptions;


public class IllegalDecree extends RuntimeException
{
    public IllegalDecree(String message)
    {
        super(message);
    }

    @Override
    public String getMessage()
    {
        return "decree must not be null";
    }
}
