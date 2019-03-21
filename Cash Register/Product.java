public class Product {

    String name;

    protected int code;
    protected boolean taxEligible;
    protected double price;
    int amount;

    public Product(String newName, int newCode, boolean newTax, double newPrice, int newAmount, String newType) {

        name = newName;
        code = newCode;
        taxEligible = newTax;
        price = newPrice;
        amount = newAmount;

    }
}
