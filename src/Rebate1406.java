public class Rebate1406 implements Rebate {
  public boolean applies(PurchasedItems items, String date) {
    StoreItem item = new StoreItem("1406", "Item 1406", "19.99");
    return items.containsItem(item);
  }

  public String getLines() {
    return "Mail-in Rebate for Item #1406\n" + "Name:\n" + "Address:\n\n"
        + "Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";
  }
}