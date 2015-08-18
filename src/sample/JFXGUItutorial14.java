package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by tm on 14.08.2015.
 */
public class JFXGUItutorial14 extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №14");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll(
                "Настоящий детектив",
                "Игра престолов",
                "Друзья",
                "Санта Барбара",
                "Фарго"
        );

        comboBox.setPromptText("Выберите любимый сериал");
        comboBox.setEditable(true);
        comboBox.setOnAction(e -> System.out.println("Вы выбрнали" + comboBox.getValue()));

        Button button = new Button("Выбрать");
        button.setOnAction(e -> System.out.println("ПРИВЕТ " + comboBox.getValue()));

        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10,10,10,10));
        layout.getChildren().addAll(comboBox,button);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
