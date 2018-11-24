public abstract class TaxComputationMethod {
  public abstract double computeTax(PurchasedItems items, ReciptDate date);

  protected abstract boolean taxHoliday();
}