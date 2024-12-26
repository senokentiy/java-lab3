package classes;

import exceptions.IllegalPeopleNumber;
import interfaces.*;


public final class King extends Male implements DecreeMaker, PeopleSender
{
    public King(String name)
    {
        super(name);
    }

    @Override
    public void sendOut(Human human, int count)
    {
        try
        {
            if (count <= 0)
                throw new IllegalPeopleNumber("people count must be positive!");
        }
        catch (IllegalPeopleNumber e)
        {
            System.out.println(e.getMessage());
            e.getCause();
            System.exit(1);
        }

        System.out.println(this + " рассылает " + count + " " + human + ".");
    }

    @Override
    public void makeDecree(Decree decree)
    {
        System.out.println(this + " издает указ!");

        try
        {
            System.out.println(decree.text());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
