package main.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import main.Model.Order;

import java.util.Date;

public class OrderController {

    ObservableList<Order> orders;
    @FXML
    private TableView<Order> ordersTab;
    @FXML
    private ChoiceBox<String> searchBy;



    @FXML
    public void initialize(){
        System.out.println("hi");
        orders = FXCollections.observableArrayList();
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        orders.add(new Order(1, "Ali", "Akram", 450, "Complete", "2019, 1, 19", "Paid", "2019, 9, 10", "New"));
        orders.add(new Order(2, "Mustafa", "Akram", 550, "Complete", "2019, 1, 29", "Paid", "2019, 2, 10", "New"));
        orders.add(new Order(3, "Kamil", "Burhan", 400, "In-Complete", "2019, 12, 19", "Un-Paid", "2019, 7, 17", "Repair"));
        orders.add(new Order(4, "Hasan", "Burhan", 470, "In-Complete", "2019, 1, 9", "Paid", "2019, 1, 10", "New"));
        orders.add(new Order(5, "Fahad", "Burhan", 150, "Complete", "2019, 11, 9", "Paid", "2019, 1, 1", "New"));
        Order o = (orders.get(3));
        ordersTab.setItems(orders);
        System.out.println(o.getCust_name());

        System.out.println(searchBy.getValue());
    }

        public void delOrder(){
            ObservableList<Order> selectedOrder;
            selectedOrder = ordersTab.getSelectionModel().getSelectedItems();
            selectedOrder.forEach(orders::remove);
    }


}

