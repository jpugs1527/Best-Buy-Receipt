import java.util.GregorianCalendar;

public class MDTaxComputation extends TaxComputationMethod {
  public double computeTax(PurchasedItems items, ReceiptDate date) {
    // calls private method taxHoliday as part of this computation
    if(taxHoliday()) {
      return 0.0;
    } else {
      return 0.06;
    }
  }

  private boolean taxHoliday(ReceiptDate date) {
    // returns true if date of receipt within the state’s tax free holiday,
    // else returns false. Supporting method of method computeTax.
    Date startHoliday = new GregorianCalendar(2018, Calender.AUGUST, 12).getTime();
    Data endHoliday = new GregorianCalendar(2018, Calender.AUGUST, 18).getTime();
    return startHoliday.compareTo(date) * date.compareTo(b) >= 0;
  }
}