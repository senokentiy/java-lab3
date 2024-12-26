package classes;

import java.util.Objects;
import interfaces.FingerSizeGenerator;
import enums.*;


public final class Ring extends DynamicItem implements FingerSizeGenerator
{
    private final int size = genSize();

    public Ring(String name, Material material)
    {
        super(name, material);
    }

    public void heal(Human human)
    {
        human.setMood(Mood.HAPPY);
        System.out.println(this + " исцеляет " + human + " от печали.");
    }

    public int getSize()
    {
        return size;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Ring that)) return false;
        if (!super.equals(object)) return false;
        return size == that.size;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), size);
    }
}
