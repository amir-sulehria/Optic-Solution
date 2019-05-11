package main.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.Commons.Common;
import main.Model.Employee;

import java.io.IOException;

public class UserHomePage{


    @FXML
    private BorderPane adminPane;
    @FXML
    private Label label;
    @FXML
    private AnchorPane dashboardPane;
    @FXML
    private AnchorPane ordersPane;
    @FXML
    private Label adminName;
    @FXML
    private Label orderPane;

    public void openDashboard(){

        try {

            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/userDashboard.fxml"));
            setCenter(center);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void openOrders(){

        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/OrdersPane.fxml"));
            setCenter(center);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void openProducts(){
        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/productPane.fxml"));
            setCenter(center);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openCustomer(){
        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/customerPane.fxml"));
            setCenter(center);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logOut(){
        try {
            AnchorPane main = FXMLLoader.load(getClass().getResource("/main/View/mainPage.fxml"));
            Common.loadStage(main, "Optic Solutions", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) adminName.getScene().getWindow();
        stage.close();
    }

    public void setCenter(AnchorPane center){

        BorderPane pane = (BorderPane) adminName.getScene().getRoot();
        pane.getCenter().setVisible(false);
        BorderPane root = (BorderPane) adminName.getScene().getRoot();
        root.setCenter(center);

    }

    @FXML
    public void initialize(){
        try {

            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/userDashboard.fxml"));
            adminPane.setCenter(center);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
