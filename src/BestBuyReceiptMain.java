import java.util.*;
import java.io.*;

public class BestBuyReceiptMain {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    
    String date = "";
    int m, d, y = 0;
    PurchasedItems items = new PurchasedItems();
    System.out.print("Please enter the month (number): ");
    m = scan.nextInt();
    System.out.print("Please enter the day: ");
    d = scan.nextInt();
    System.out.print("Please enter the year: ");
    y = scan.nextInt();
    date = m + "/" + d + "/" + y;

    String choice = menu();

    if ("4028".equals(choice)) {
      StoreItem item = new StoreItem("4028", "Samsung S9 (unlocked) Midnight Black 64 GB", "719.99");
      items.addItem(item);
    } else if ("0915".equals(choice)) {
      StoreItem item = new StoreItem("0915", "Samsung S9 Case (black)", "39.99");
      items.addItem(item);
    } else if ("2428".equals(choice)) {
      StoreItem item = new StoreItem("2428", "Anker External Battery (20,000mAh)", "49.99");
      items.addItem(item);
    } else {
      System.err.println("Invalid selection...Quitting");
      System.exit(0);
    }
    
    ReceiptFactory rf = new ReceiptFactory();
    Receipt receipt = rf.getReceipt(items, date);
    receipt.prtReceipt();
  }

  public static String menu() {
      String itemNumber = "";
      try (Scanner in = new Scanner(System.in)) {
          System.out.println("ITEM #:");
          System.out.println("4028 Samsung S9 (unlocked) Midnight Black 64 GB - $719.99");
          System.out.println("0915 Samsung S9 Case (black) - $39.99");
          System.out.println("2428 Anker External Battery (20,000 mAh) - $49.99");
          System.out.println("Enter the item number for the item you would like to purchase: ");
          itemNumber = in.next();
      }
    return itemNumber;
  }
}
