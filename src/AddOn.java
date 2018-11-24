public interface AddOn {
  public boolean applies(PurchaseItem items);

  public String getLines();
}