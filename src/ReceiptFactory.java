
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class ReceiptFactory {

    StoreHeader storeHeader;
    private TaxComputationMethod[] taxComputationObjs;
    private AddOn[] addOns;

    public ReceiptFactory() throws FileNotFoundException, IOException {
        this.taxComputationObjs = new TaxComputationMethod[]{new MDTaxComputation()};
        this.addOns = new AddOn[]{new Rebate1406(), new Coupon100Get10Percent(), new HolidayGreeting()};

        FileInputStream fstream = new FileInputStream("config.txt");
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(fstream));
        String street_addr = buffRead.readLine();
        String state_code = buffRead.readLine();
        String zip_code = buffRead.readLine();
        String store_number = buffRead.readLine();
        String phone_number = buffRead.readLine();
        this.storeHeader = new StoreHeader(street_addr, zip_code, state_code, phone_number, store_number);
    }

    public Receipt getReceipt(PurchasedItems items, String date) {
        BasicReceipt br = new BasicReceipt(items, date);

        br.setTaxComputationMethod(taxComputationObjs[0]);
        br.setStoreHeader(storeHeader);

        Receipt receipt = (Receipt) br;

//        for (AddOn addon : addOns) {
//            if (addon.applies(items, date)) {
//                if (addon instanceof SecondaryHeading) {
//                    receipt = new PreDecorator(receipt, addon);
//                } else {
//                    receipt = new PostDecorator(receipt, addon);
//                }
//            }
//        }
        
        return receipt;
    }

}
