package main.Model;

import java.util.UUID;

public class Supplier {

    private int id;
    private String name;
    private int charges;
    private String contact;
    private String address;

    public Supplier(int id, String name, int charges, String contact, String address) {
        this.id = id;
        this.name = name;
        this.charges = charges;
        this.contact = contact;
        this.address = address;
    }

    public Supplier(int id, String name, int charges) {
        this.id = id;
        this.name = name;
        this.charges = charges;
        this.contact = null;
        this.address = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCharges() {
        return charges;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
}
