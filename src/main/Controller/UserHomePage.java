package main.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Common;

import java.io.IOException;


public class UserHomePage {

    @FXML
    private Button goBackBtn;

    @FXML
    public void goToMainScreen(){

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/mainPage.fxml"));
            Common.loadStage(root, "Optical Solutions");
        }catch (IOException e){
            e.printStackTrace();
        }

        Stage stage = (Stage) goBackBtn.getScene().getWindow();
        stage.close();
    }


}
