package main.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import main.Commons.Common;

import java.io.IOException;

public class SupplierController {

    public void addSupllier(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addSupplier.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
