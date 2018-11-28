import java.util.ArrayList;

public class PurchasedItems {
    private ArrayList<StoreItem> items;

    public PurchasedItems() {
        items = new ArrayList();
    }

    public void addItem(StoreItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            StoreItem indexItem = items.get(i);
            double itemPrice = indexItem.getItemPrice();
            total += itemPrice;
        }
        return total;
    }

    public boolean containsItem(StoreItem itemCode) {
        StoreItem matchItemCode = itemCode.getItemCode();
        for (int i = 0; i < items.size(); i++) {
            StoreItem indexItem = items.get(i);
            String indexItemCode = indexItem.getItemCode();
            if (matchItemCode == indexItemCode) {
                return true;
            }
        }
        return false;
    }

    public void reset() {
        items.removeAll(items);
    }

    public boolean hasNext() {
        for (int i = 1; i < this.items.size(); i++) {
            if (this.items.get(i) != null) {
                return true;
            }
        }
        return false;
    }

    public StoreItem getNext() {
        StoreItem item = new StoreItem();
        return item;
    }
}