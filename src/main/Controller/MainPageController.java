package main.Controller;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class MainPageController{

    public void btnClick(){
        System.out.println("You clicked button");
    }

    @FXML
    public void forgetPassword(){
        loadStage("/main/View/forgetPassword.fxml");
    }



    private void loadStage(String fxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
