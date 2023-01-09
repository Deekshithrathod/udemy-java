package section11;

class Product {
    private int itemNumber;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        itemNumber = 1;
        name = "SKU110";
        price = 100;
        quantity = 100;
    }

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(int itemNumber, String name, double price, int quantity) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Lecture117 {
    public static void main(String[] args) {
        Product product = new Product(100, "Custom Name", 1000, 50);
        System.out.println(product.getItemNumber());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());

        product.setPrice(1100);
        product.setQuantity(100);
        System.out.println("----");
        System.out.println(product.getPrice());
        System.out.println(product.getQuantity());
    }
}
