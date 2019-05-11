package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.Commons.Common;
import main.Model.Customer;

import java.io.IOException;

public class CustomerController {


    @FXML
    private TextField searchText;
    @FXML
    private ChoiceBox<String> searchBy;
    @FXML
    private TableView<Customer> customerTableView;

    ObservableList<Customer> customers;




    public void initialize(){
        customers = FXCollections.observableArrayList();
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customers.add(new Customer(1, "Ali", 2, "Lahore", "0133434"));
        customerTableView.setItems(customers);

        System.out.println(searchBy.getSelectionModel().getSelectedItem());

    }

    public void updateSearch(){
        //here we'll catch choicebox changes
        System.out.println(searchBy.getSelectionModel().getSelectedItem());

    }

    public void updateCustomer(){
        ObservableList<Customer> selected = customerTableView.getSelectionModel().getSelectedItems();
        Customer e = selected.get(0);
        System.out.println(e.getName());
    }

    public void delCustomer(){
        ObservableList<Customer> selectedSupp;
        selectedSupp = customerTableView.getSelectionModel().getSelectedItems();
        selectedSupp.forEach(customers::remove);
    }

    public void addCustomer(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addSupplier.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
