package ShoppingList;

public class ItemOrders {
    private int amount;
    private Item item;

    // Constructs an object that accepts an Item object and how many will be purchased
    public ItemOrders(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    // Accessor for amount
    public int getAmount() {
        return amount;
    }

    // Accessor for item
    public Item getItem() {
        return item;
    }
}
