package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import main.Commons.Common;
import main.Model.Product;

import java.io.IOException;

public class ProductController {

    @FXML
    private TableView<Product> productTableView;

    ObservableList<Product> products;




    public void initialize(){
        products = FXCollections.observableArrayList();
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));
        products.add(new Product(1, "Flex", 450, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(2, "High Index", 450, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(3, "Flex", 950, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(4, "Flex", 750, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(5, "Flex", 400, "Frame", 10, "Ray-Ben", "Ali"));
        products.add(new Product(6, "Multi-coated", 410, "Glass", 10, "Ray-Ben", "Ali"));
        products.add(new Product(7, "Poly", 700));
        products.add(new Product(8, "Hammad", 300));
        products.add(new Product(9, "Akbar", 500));

        productTableView.setItems(products);

    }

    public void updateProduct(){
        ObservableList<Product> selected = productTableView.getSelectionModel().getSelectedItems();
        Product e = selected.get(0);
        System.out.println(e.getName());
    }

    public void addProduct(){
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/main/View/addNewEmployer.fxml"));
            Common.loadStage(root, "Add new Employee", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delProduct(){
        ObservableList<Product> selectedEmp;
        selectedEmp = productTableView.getSelectionModel().getSelectedItems();
        selectedEmp.forEach(products::remove);
    }

}
