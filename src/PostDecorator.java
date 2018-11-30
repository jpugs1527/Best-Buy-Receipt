
public class PostDecorator extends Decorator {

    private AddOn a;

    public PostDecorator(Receipt r, AddOn a) {
        super(r, a);
    }

    public void prtReceipt() {
        callTrailer();
        System.out.println(a.getLines());
    }
}
