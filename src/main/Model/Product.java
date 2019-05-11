package main.Model;

public class Product {

    private int id;
    private String name;
    private int price;
    private String type;
    private int quantity;
    private String manufacturer;
    private String supplier;

    public Product(int id, String name, int price, String type, int quantity, String manufacturer, String supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.supplier = supplier;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSupplier() {
        return supplier;
    }
}
