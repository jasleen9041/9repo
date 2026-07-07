class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock + "units");
        System.out.println("-------------------------");
    }
}
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 10);
        Product product2 = new Product("Smartphone", 499.99, 25);

        System.out.println("--- Current Inventory ---");
        product1.displayDetails();
        product2.displayDetails();
    }
}


    
    
