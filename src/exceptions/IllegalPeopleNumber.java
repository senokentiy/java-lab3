package exceptions;


public class IllegalPeopleNumber extends Exception
{
    public IllegalPeopleNumber(String message)
    {
        super(message);
    }

    @Override
    public String getMessage()
    {
        return "people count must be positive!";
    }
}
