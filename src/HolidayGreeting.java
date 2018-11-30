public class HolidayGreeting implements SecondaryHeading {
  public boolean applies(PurchasedItems items, String date) {
    return true; // SecondaryHeading decorators always applied
  }

  public String getLines() {
  return "* Happy Holidays from Best Buy *";
  }
}