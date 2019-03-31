package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Scene mainScene, forgotPassScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/mainPage.fxml"));
        //forgotPassScene = FXMLLoader.load(getClass().getResource("View/forgetPassword.fxml"));


        primaryStage.setTitle("Optic Solutions");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setMinWidth(primaryStage.getWidth());
        primaryStage.setMinHeight(primaryStage.getHeight());
        primaryStage.setMaxHeight(primaryStage.getWidth());
        primaryStage.setMaxHeight(primaryStage.getHeight());
    }




    public static void main(String[] args) {
        launch(args);
    }
}
