public class ReceiptFactory {
  StoreHeader storeHeader;
  BasicReceipt br;
  private TaxComputationMethod[] taxComputationObjs = new TaxComputationMethod[1];
  private AddOn[] addOns;

  public ReceiptFactory(StoreHeader storeHeader, TaxComputationMethod[] taxComputationObjs, AddOn[] addOns) {
    this.storeHeader = storeHeader;
    this.taxComputationObjs = taxComputationObjs;
    this.addOns = addOns;
  }

  //TODO populate taxCompObjs
  public void setTaxCompObjs() {
    this.taxComputationObjs[1] = "md";
  }


  public void setStoreHeader() {
    this.storeHeader = new StoreHeader("123 Main St.", "21455", "MD", "410-704-5555", "2014");
  }

  public getReceipt(PurchasedItems items, Date date) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    date = new Date();
    formatter.format(date);

    br.setTaxComputationMethod(taxComputationObjs[1]);

    br.setStoreHeader(storeHeader);

    return br
  }

}