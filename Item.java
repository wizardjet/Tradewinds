public class Item {

    String name;
    int price;

    public Item() {}

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }
    
}