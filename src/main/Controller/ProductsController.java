package main.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import main.Commons.Common;

import java.io.IOException;

public class ProductsController {

    public void addProduct(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addProduct.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
