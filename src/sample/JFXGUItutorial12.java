package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by tm on 11.08.2015.
 */
public class JFXGUItutorial12 extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №12");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Рыба", "Курица", "Мясо", "Свинина", "Кока-кола");
        choiceBox.setValue("Мясо");
        choiceBox.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) -> System.out.println(newValue));

        Button btn = new Button("Заказать");
        btn.setOnAction(e -> getChoice(choiceBox));


        VBox layout = new VBox(20);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(choiceBox,btn);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();

    }

    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println("Вы заказали: " + food );
    }
}
