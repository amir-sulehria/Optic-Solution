package main.Model;

public class Customer {

    private int id;
    private String name;
    private int totalOrders;
    private String city;
    private String contact;

    public String getName() {
        return name;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }

    public Customer(int id, String name, int totalOrders, String city, String contact) {
        this.id = id;
        this.name = name;
        this.totalOrders = totalOrders;
        this.city = city;
        this.contact = contact;
    }
}
