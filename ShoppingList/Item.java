package ShoppingList;

public class Item {
    private String name;
    private double price;

    // Constructs object with a name and price
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Accessor method for name
    public String getName() {
        return name;
    }

    // Accessor method for price
    public double getPrice() {
        return price;
    }
}
