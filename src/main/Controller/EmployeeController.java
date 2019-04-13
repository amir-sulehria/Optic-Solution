package main.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import main.Commons.Common;

import java.io.IOException;

public class EmployeeController {

    public void addEmployer(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/addNewEmployer.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
