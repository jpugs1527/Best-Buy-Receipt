public interface AddOn {
  public boolean applies(PurchasedItems items, String date);

  public String getLines();
}