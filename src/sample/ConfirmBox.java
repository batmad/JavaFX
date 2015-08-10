package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by tm on 06.08.2015.
 */
public class ConfirmBox {

    public static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        Label label = new Label(message);

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);
        layout.setMinHeight(200);
        layout.setMinWidth(300);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label,yesButton,noButton);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
