
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
        String matchItemCode = itemCode.getItemCode();
        for (int i = 0; i < items.size(); i++) {
            StoreItem indexItem = items.get(i);
            String indexItemCode = indexItem.getItemCode();
            if (matchItemCode == indexItemCode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i).getItemCode() + "\n");
            System.out.print(items.get(i).getItemDescription() + "\n");
            System.out.print(items.get(i).getItemPrice() + "\n");
        }
        System.out.println("Total: " + getTotalCost());
    }
}
