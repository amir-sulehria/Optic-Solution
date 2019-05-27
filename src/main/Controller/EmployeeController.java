package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import main.Commons.Common;
import main.Model.Employee;

import java.io.IOException;

public class EmployeeController {

    @FXML
    TableView<Employee> empTable;

    ObservableList<Employee> employees;


    public void initialize(){
        employees = FXCollections.observableArrayList();
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));

        System.out.println(empTable);
        empTable.setItems(employees);
    }

    public void updateEmployee(){
        ObservableList<Employee> selected = empTable.getSelectionModel().getSelectedItems();
        Employee e = selected.get(0);
        System.out.println(e.getName());
    }

    public void addEmployer(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addNewEmployer.fxml"));
            Common.loadStage(root, "Add new Employee", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delEmployee(){
        ObservableList<Employee> selectedEmp;
        selectedEmp = empTable.getSelectionModel().getSelectedItems();
        selectedEmp.forEach(employees::remove);
    }

}
