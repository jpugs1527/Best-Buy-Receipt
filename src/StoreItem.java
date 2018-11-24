/**
 *
 * @author jordanpuglisi
 */
public class StoreItem {

    private String itemCode;
    private String itemDescription;
    private String itemPrice;

    public StoreItem(String itemCode, String itemDescription, String itemPrice) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    // TODO: Getters and Setters
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public String getItemPrice() {
        return Double.parseDouble(this.itemPrice);
    }

    public String toString() {
        return "Store Item toString()";
    }
}
