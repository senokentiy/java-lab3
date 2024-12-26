package classes;

import java.util.ArrayList;
import java.util.Objects;


public final class Inventory
{
    ArrayList<DynamicItem> inventory = new ArrayList<>();

    public void add(DynamicItem dynamicItem)
    {
        inventory.add(dynamicItem);
    }

    public void delete(DynamicItem dynamicItem)
    {
        inventory.remove(dynamicItem);
    }

    public DynamicItem get(String name)
    {
        for (DynamicItem item : inventory)
            if (item.getName().equals(name))
                return item;

        System.out.println("предмет не найден!");
        return null;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;
        if (!(object instanceof Inventory that)) return false;
        return Objects.equals(inventory, that.inventory);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(inventory);
    }

    @Override
    public String toString()
    {
        return inventory.toString();
    }
}
