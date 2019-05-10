package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

public class DashboardController {

    @FXML
    private LineChart<String, Number> lineChart;
    @FXML
    private PieChart popular;
    @FXML
    private PieChart lowStock;


    @FXML
    public void initialize() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("Ray-Ben", 13),
                new PieChart.Data("GUCCI", 25),
                new PieChart.Data("Police", 10),
                new PieChart.Data("Korean Lens", 22),
                new PieChart.Data("Multi-Coat Glass", 30));
        popular.setData(data);

        ObservableList<PieChart.Data> data2 = FXCollections.observableArrayList(
                new PieChart.Data("Ray-Ben", 13),
                new PieChart.Data("GUCCI", 25),
                new PieChart.Data("Police", 10),
                new PieChart.Data("Korean Lens", 22),
                new PieChart.Data("Multi-Coat Glass", 30));
        lowStock.setData(data2);

        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.getData().add(new XYChart.Data<String, Number>("Jan", 1));
        series.getData().add(new XYChart.Data<String, Number>("Feb", 2));
        series.getData().add(new XYChart.Data<String, Number>("March", 3));
        series.getData().add(new XYChart.Data<String, Number>("April", 4));
        series.getData().add(new XYChart.Data<String, Number>("May", 5));
        series.getData().add(new XYChart.Data<String, Number>("June", 1));
        series.getData().add(new XYChart.Data<String, Number>("July", 2));
        series.getData().add(new XYChart.Data<String, Number>("Aug", 3));
        series.getData().add(new XYChart.Data<String, Number>("Sept", 4));
        series.getData().add(new XYChart.Data<String, Number>("Oct", 5));
        series.getData().add(new XYChart.Data<String, Number>("Nov", 5));
        series.getData().add(new XYChart.Data<String, Number>("Dec", 5));

        lineChart.getData().add(series);
    }

}
