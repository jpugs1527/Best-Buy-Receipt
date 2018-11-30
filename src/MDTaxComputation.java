

public class MDTaxComputation extends TaxComputationMethod {
  public double computeTax(PurchasedItems items, String date) {
    // calls private method taxHoliday as part of this computation
    if(taxHoliday(date)) {
      return 0.0;
    } else {
      return .06;
    }
  }

  public boolean taxHoliday(String date) {
    // returns true if date of receipt within the state’s tax free holiday,
    // else returns false. Supporting method of method computeTax.
    boolean holiday = false;
    return holiday;
    
//    Date startHoliday = new GregorianCalendar(2018, Calender.AUGUST, 12).getTime();
//    Data endHoliday = new GregorianCalendar(2018, Calender.AUGUST, 18).getTime();
//    return startHoliday.compareTo(date) * date.compareTo(b) >= 0;
  }
}