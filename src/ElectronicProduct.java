package cashregister.src;

/**
 * e una classe pubblica e parla di eletronicca ed è una estensione della classe di Product.
 */
public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}
