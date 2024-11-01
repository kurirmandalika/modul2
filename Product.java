public class Product {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double price;
    public int stock;
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public void DiscountedProduct() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Discounted Price: $" + getaDouble());
        System.out.println("Stock: " + getStock());
    }

    private double getaDouble() {
        return price * 0.9;
    }

    public void applyStockAdjustment(int adjustment) {
        stock += adjustment;
        System.out.println("Stock adjusted. New stock: + stock");
    }
}