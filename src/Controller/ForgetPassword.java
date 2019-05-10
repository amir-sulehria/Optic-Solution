package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ForgetPassword {

    @FXML
    private TextField user;
    @FXML
    private TextField userNo;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Button closeBtn;



    @FXML
    public void sendPasswd(){
        System.out.printf("Hey %s, We've sent your password at your number %s", user.getText(), userNo.getText());
        closeBox();
    }

    @FXML
    public void closeBox(){

        System.out.println("Box will close now");
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }


}
