package sample;/**
 * Created by tm on 06.08.2015.
 */

import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox  {

    public static void display(String title, String message) {
        Stage window = new Stage();

        //window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(150);

        Label label = new Label(message);
        Button closeButton = new Button("Закрыть");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 250, 150);
        window.setScene(scene);
        window.show();
        //window.showAndWait();
    }
}
