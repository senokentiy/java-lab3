package classes;

import java.util.Objects;


public class Entity
{
    protected String name;

    protected Entity(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Entity entity)) return false;

        return Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(name);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
