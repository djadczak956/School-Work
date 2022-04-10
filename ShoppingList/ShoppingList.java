package ShoppingList;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<ItemOrders> list;

    // Constructs an empty list for ItemOrders
    public ShoppingList() {
        this.list = new ArrayList<ItemOrders>();
    }
        
    // Adds an ItemOrders object to list
    public void add(ItemOrders item) {
        list.add(item);
    }

    // Removes an ItemOrders object from list
    public void remove(ItemOrders item) {
        list.remove(item);
    }
}
