package cashregister.src;

public class Main {
    /**
     * @author Giovanni
     * @since 28/05/2025
     * @
     * @param args
     */

    public static void main(String[] args) {
        CashRegister register = new CashRegister();

        Product bread = new FoodProduct("Bread", 1.5, "2025-01-01");
        Product milk = new FoodProduct("Milk", 1.2, "2025-01-10");
        Product tv = new ElectronicProduct("TV", 450.00, 36);

        register.addItem(bread, 2);
        register.addItem(milk, 3);
        register.addItem(tv, 1);

        register.applyDiscountToCategory("Food", 10);

        register.printReceipt();

        System.out.printf("Prezzo medio elettronica: €%.2f ",
            register.averagePriceByCategory("Electronics")
        );

        register.removeItemByName("Milk");
        System.out.println(" Dopo rimozione latte:");
        register.printReceipt();
    }
}
