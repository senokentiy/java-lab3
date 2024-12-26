package classes;

import enums.Material;


public class DynamicItem extends Item
{
    protected DynamicItem(String name, Material material)
    {
        super(name, material);
    }

    @Override
    public void changeDurability(int diff)
    {
        durability += diff;
        updateDurability();
    }

    @Override
    protected void updateDurability()
    {
        if (durability > 100)
            durability = 100;

        if (durability < 100)
            name = defaultName;

        if (durability <= 0)
        {
            durability = 0;
            System.out.println(this + " сломан!");
            name += " (сломано)";
        }
    }


}
