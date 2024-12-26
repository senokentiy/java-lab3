package classes;

import interfaces.Proposer;
import java.util.Objects;


public class Male extends Human implements Proposer
{
    protected Female wife;

    public Male(String name)
    {
        super(name);
    }

    @Override
    public void proposeTo(Female female, Ring ring)
    {
        if (wife != null)
        {
            System.out.println("многоженство запрещено!");
            return;
        }

        if (ring.isBroken())
        {
            System.out.println("кольцо сломано!");
            return;
        }

        if (!(ring.getSize() == female.getFingerSize()))
        {
            System.out.println("кольцо не подходит по размеру!");
            return;
        }

        getMarried(female);
    }

    private void getMarried(Female female)
    {
        setWife(female);
        female.setHusband(this);
        System.out.println(this + " женится на " + female + ".");
    }

    public Female getWife()
    {
        return wife;
    }

    public void setWife(Female wife)
    {
        this.wife = wife;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Male male)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(wife, male.wife);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), wife);
    }
}
