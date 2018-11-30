public class Coupon100Get10Percent implements Rebate {
  public boolean applies(PurchasedItems items, String date) {
        return items.getTotalCost() > 100;
  }

  public String getLines() {
    return "10% off for spending more than $100!";
  }
}