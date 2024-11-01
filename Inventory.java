public class Inventory {
    public static final double DOUBLE = 0.9;
    public Product product;
    public String location;
    public Inventory (Product product, String location) {
        this.product = product;
        this.location = location;
    }
    public void showInventory() {
        System.out.println("Location: " + location);
        double CalculatedPrice = product.price * DOUBLE;
        System.out.println("Product Name: " + product.name);
        System.out.println("Price: $" + product.price);
        System.out.println("Discounted Price: $" + CalculatedPrice);
        System.out.println("Stock: " + product.stock);
    }
}
