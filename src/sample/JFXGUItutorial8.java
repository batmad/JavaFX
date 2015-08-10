package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by tm on 09.08.2015.
 */
public class JFXGUItutorial8 extends Application{

    Stage window;
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFXGuide");

        HBox topMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        topMenu.getChildren().addAll(button1, button2, button3);

        VBox leftMenu = new VBox();
        Button button4 = new Button("Menu");
        Button button5 = new Button("Back");
        Button button6 = new Button("Contacts");
        leftMenu.getChildren().addAll(button4, button5, button6);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();
    }
}
