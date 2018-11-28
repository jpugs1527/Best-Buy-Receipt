public class BasicReceipt implements Receipt {
    private StoreHeader storeHeader;
    private TaxComputationMethod tc;
    private Date date;
    private PurchasedItems items;

    public BasicReceipt(PurchaseItem items, Date date) {
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
        double total = 0.0;
        this.storeHeader.toString();
        System.out.printf("%-15s %n", this.date);
        for (int i = 0; i < items.length(); i++) {
            StoreItem indexItem = items.get(i);
            String indexItemCode = indexItem.getItemCode();
            String indexItemDescription = indexItem.getItemDescription();
            String indexItemPrice = indexItem.getItemPrice();
            total = total + indexItem.getItemPrice();
            System.out.printf("%-15s %-15s %15d %n", "ITEM #", indexItemCode + " ", indexItemDescription, indexItemPrice);
        }
        System.out.printf("%-15s %15d %n", "Total Sale", "$" + total);
        System.out.printf("%-15s %15d", "MD Sales Tax (6%)", "$" + total*.06);
        System.out.printf("%-15s %15d", "TOTAL SALE", "$" + total*1.06);
    }

}