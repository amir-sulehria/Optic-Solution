package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.Commons.Common;
import main.Model.Employee;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboard{


    @FXML
    private BorderPane adminPane;
    @FXML
    private Label label;
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

    @FXML
    public void initialize(){
        try {

            AnchorPane center = FXMLLoader.load(getClass().getResource("/main/View/dashboardPane.fxml"));
            adminPane.setCenter(center);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
