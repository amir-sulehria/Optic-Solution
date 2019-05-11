package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
import main.Commons.Common;
import main.Model.Employee;
import main.Model.Supplier;

import java.io.IOException;

public class SupplierController {

    @FXML
    private TableView<Supplier> suppTable;

    ObservableList<Supplier> supplier;




    public void initialize(){
        supplier = FXCollections.observableArrayList();
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        supplier.add(new Supplier(3, "Hammad", 30000));
        supplier.add(new Supplier(4, "Akbar", 55000));
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        supplier.add(new Supplier(3, "Hammad", 30000));
        supplier.add(new Supplier(4, "Akbar", 55000));
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        supplier.add(new Supplier(3, "Hammad", 30000));
        supplier.add(new Supplier(4, "Akbar", 55000));
        supplier.add(new Supplier(1, "Ali", 324232, "092340234", "Lahore"));
        supplier.add(new Supplier(2, "Hamza", 70000));
        suppTable.setItems(supplier);

    }

    public void updateSupplier(){
        ObservableList<Supplier> selected = suppTable.getSelectionModel().getSelectedItems();
        Supplier e = selected.get(0);
        System.out.println(e.getName());
    }

//    public void addSupplier(){
//        try {
//            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/main/View/addNewEmployer.fxml"));
//            Common.loadStage(root, "Add new Employee", true);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void delSupplier(){
        ObservableList<Supplier> selectedSupp;
        selectedSupp = suppTable.getSelectionModel().getSelectedItems();
        selectedSupp.forEach(supplier::remove);
    }

    public void addSupllier(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addSupplier.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
