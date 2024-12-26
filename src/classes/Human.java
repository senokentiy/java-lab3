package classes;

import java.util.Objects;
import interfaces.*;
import enums.Mood;


public class Human extends Entity implements Speaker, Looker, Grabber, FingerSizeGenerator
{
    private final Inventory inventory = new Inventory();
    private Mood mood = Mood.OK;
    protected int fingerSize = genSize();

    public Human(String name)
    {
        super(name);
    }

    @Override
    public void lookAt(Entity entity)
    {
        System.out.println(this + " смотрит на " + entity + ".");
    }

    @Override
    public void grab(DynamicItem dynamicItem)
    {
        inventory.add(dynamicItem);
        System.out.println(this + " взял " + dynamicItem + ".");
    }

    @Override
    public void takeOut(DynamicItem dynamicItem)
    {
        inventory.delete(dynamicItem);
        System.out.println(this + " выкинул " + dynamicItem + ".");
    }

    @Override
    public void say(String text)
    {
        System.out.println(text);
    }

    public Mood getMood()
    {
        return mood;
    }

    public void setMood(Mood mood)
    {
        this.mood = mood;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Human human)) return false;
        if (!super.equals(object)) return false;
        return mood == human.mood;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), inventory, mood);
    }
}
