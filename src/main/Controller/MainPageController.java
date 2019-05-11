package main.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import main.Commons.Common;

import java.io.IOException;

public class MainPageController {

    @FXML
    private Button tryLogin;
    @FXML
    private ToggleGroup selectUser;
    @FXML
    private RadioButton admin;
    @FXML
    private RadioButton user;

    @FXML
    public void forgetPassword() {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/main/View/forgetPassword.fxml"));
            Common.loadStage(root, "Recover Password", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void signIn() {
        RadioButton btn = (RadioButton) selectUser.getSelectedToggle();
        String selectedBtn = btn.getText();
        Parent root;
        try {
            if(selectedBtn == user.getText()){
                root = FXMLLoader.load(getClass().getResource("/main/View/userHomePage.fxml"));
                Common.loadStage(root, "Dashboard", false);
            }else if(selectedBtn == admin.getText()){
                root = FXMLLoader.load(getClass().getResource("/main/View/adminDashboard.fxml"));
                Common.loadStage(root, "Dashboard", false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) tryLogin.getScene().getWindow();
        stage.close();
    }



}



