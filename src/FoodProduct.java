package cashregister.src;

public class FoodProduct extends Product {
    /**
     * la classe  FoodProduct parla di cibo è una classe pubblica
     */
    private String expirationDate;

    /**
     * public FoodProduct e publica
     * @param name
     * @param price
     * @param expirationDate
     */
    public FoodProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String getCategory() {
        return "Food";
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
