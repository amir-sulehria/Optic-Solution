package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.Commons.Common;

import java.io.IOException;

public class AdminDashboard {

    @FXML
    private ScrollPane employeePane;
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
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/dashboardPane.fxml"));
            setCenter(center);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void temp(){
        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList(
                "Single", "Double", "Suite", "Family App","Single", "Double", "Suite", "Family App","Single", "Double", "Suite", "Family App","Single", "Double", "Suite", "Family App");
        list.setItems(items);

        employeePane.prefWidthProperty().bind(list.widthProperty());
        employeePane.prefHeightProperty().bind(list.heightProperty());
        employeePane.setContent(list);
        employeePane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
    }

    public void openOrders(){

        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/OrdersPane.fxml"));
            setCenter(center);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void openSupplier(){

        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/supplierPane.fxml"));
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

    public void openEmployee(){
        try {
            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/employeeDashboard.fxml"));
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

}
