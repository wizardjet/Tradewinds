public class Cargo {
    // Inventory has items
    // Cargo has inventory

    int cargoMax;

    public Cargo() {
        
    }

    private static final int INV_MAX = 99;
    Goods goodsArr;

    public Cargo() {
        this.goodsArr = new Item[INV_MAX];
    }

    Item getItem() {

    }

    Item addItem() {

    }

    Item removeItem() {

    }

    void discardItem() {

    }

    boolean itemExists() {
        
    }
}