package main.Model;

import java.util.UUID;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private String role;
    private String contact;
    private String address;

    public Employee(int id, String name, int salary, String role, String contact, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
        this.contact = contact;
        this.address = address;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = "Employer";
        this.contact = null;
        this.address = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }
}
