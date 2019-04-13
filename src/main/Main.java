package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Commons.Common;

public class Main extends Application {

    Scene mainScene, forgotPassScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/mainPage.fxml"));
        Common.loadStage(root, "Optic Solutions", true);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
