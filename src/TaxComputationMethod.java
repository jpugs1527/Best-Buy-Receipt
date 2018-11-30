public abstract class TaxComputationMethod {
  public abstract double computeTax(PurchasedItems items, String date);

  protected abstract boolean taxHoliday(String date);
}