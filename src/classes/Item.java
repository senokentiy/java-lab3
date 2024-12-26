package classes;

import java.util.Objects;
import enums.Material;


abstract class Item extends Entity
{
    protected final String defaultName = name;
    protected Material material;
    protected int durability = 100;                      // 0-100 %
    protected boolean isBroken = false;

    protected Item(String name, Material material)
    {
        super(name);
    }

    public int getDurability()
    {
        return durability;
    }

    public Material getMaterial()
    {
        return material;
    }

    public boolean isBroken()
    {
        return isBroken;
    }

    abstract void changeDurability(int diff);

    protected abstract void updateDurability();

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof DynamicItem that)) return false;
        if (!super.equals(object)) return false;

        return durability == that.durability && isBroken == that.isBroken && Objects.equals(name, that.name) && material == that.material;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), name, material, durability, isBroken);
    }
}
