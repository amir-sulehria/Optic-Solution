package main.Commons;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Common {

    public static void loadStage(Parent root, String title) {

        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
//        stage.setMinWidth(stage.getWidth());
//        stage.setMinHeight(stage.getHeight());
//        stage.setMaxWidth(stage.getWidth());
//        stage.setMaxHeight(stage.getHeight());

    }

}
