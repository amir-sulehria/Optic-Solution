package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.Common;

import java.io.IOException;

public class MainPageController {

    @FXML
    private Button tryLogin;

    @FXML
    public void btnClick() {
        System.out.println("You clicked button");
    }

    @FXML
    public void forgetPassword() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/forgetPassword.fxml"));
            Common.loadStage(root, "Recover Password");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void signIn() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/userHomePage.fxml"));
            Common.loadStage(root, "User Home");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) tryLogin.getScene().getWindow();
        stage.close();
    }

}



