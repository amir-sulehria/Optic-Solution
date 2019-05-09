package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import main.Commons.Common;
import main.Model.Employee;
import main.Model.Product;

import java.io.IOException;

public class EmployeeController {

    @FXML
    private TableView<Employee> employeeTable;




    public void addEmployer(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addNewEmployer.fxml"));
            Common.loadStage(root, "Add new Employee", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delEmployee(){
        employeeTable.getItems().removeAll();
    }

    public ObservableList<Employee> getEmployees(){

        ObservableList<Employee> employees = FXCollections.observableArrayList();
        employees.add(new Employee(1, "Ali", 324232, "Admin", "092340234", "Lahore"));
        employees.add(new Employee(2, "Hamza", 70000));
        employees.add(new Employee(3, "Hammad", 30000));
        employees.add(new Employee(4, "Akbar", 55000));

        return employees;
    }




}
