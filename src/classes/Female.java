package classes;

import java.util.Objects;
import java.util.Random;


public class Female extends Human
{
    protected Male husband;

    public Female(String name)
    {
        super(name);
    }

    public Male getHusband()
    {
        return husband;
    }

    public void setHusband(Male husband)
    {
        this.husband = husband;
    }

    public int getFingerSize()
    {
        return fingerSize;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Female female)) return false;
        if (!super.equals(object)) return false;
        return fingerSize == female.fingerSize && Objects.equals(husband, female.husband);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), husband, fingerSize);
    }
}
