public class StoreHeader {
    private String street_addr;
    private String zip_code;
    private String state_code;
    private String phone_number;
    private String store_number;

    public StoreHeader(String street_addr, String zip_code, String state_code, String phone_number,
            String store_number) {
        this.street_addr = street_addr;
        this.zip_code = zip_code;
        this.state_code = state_code;
        this.phone_number = phone_number;
        this.store_number = store_number;
    }

    public String getStateCode(String state) {
        if (state == "Maryland") {
            return "MD";
        } else {
            return "No state code found...";
        }
    }

    public String toString() {
        return String.format("%-15s %15s %s %n %-15s %15s", "BEST BUY", "Store # ", store_number,
                street_addr + ", " + state_code + " " + zip_code, phone_number);
    }
}