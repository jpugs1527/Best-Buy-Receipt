
import java.util.Date;

public class BasicReceipt implements Receipt {

    private StoreHeader storeHeader;
    private TaxComputationMethod tc;
    private String date;
    private PurchasedItems items;

    public BasicReceipt(PurchasedItems items, String date) {
        this.items = items;
        this.date = date;
    }

    public void setStoreHeader(StoreHeader storeHeader) {
        this.storeHeader = storeHeader;
    }

    public void setTaxComputationMethod(TaxComputationMethod tc) {
        this.tc = tc;
    }

    public void prtReceipt() {
        
        double total = items.getTotalCost();
        double tax = tc.computeTax(items, this.date);
        this.storeHeader.toString();
        System.out.printf("%-15s %n", this.date);
    
        System.out.printf("%-15s %15s %15f %n", "Total Sale", "$", total);
        System.out.printf("%-15s %15s %15f %n", "MD Sales Tax (6%)", "$", total * .06);
        System.out.printf("%-15s %15s %15f %n", "TOTAL SALE", "$", total * 1.06);
    }

}
