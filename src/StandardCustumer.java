public class StandardCustumer extends Customer{

    public StandardCustumer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
