package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by tm on 10.08.2015.
 */
public class JFXGUItutorial11 extends Application{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №10");

        CheckBox box1 = new CheckBox("Рыба");
        CheckBox box2 = new CheckBox("Курица");
        CheckBox box3 = new CheckBox("Мясо");
        box3.setSelected(true);

        Button btn = new Button("Заказать сейчас!");
        btn.setOnAction(e -> handle(box1,box2,box3));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1,box2,box3,btn);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }

    private void handle(CheckBox box1, CheckBox box2, CheckBox box3){
        String message = "Вы выбрали: \n";
        if(box1.isSelected())
            message += "Рыбу\n";
        if(box2.isSelected())
            message += "Курицу\n";
        if(box3.isSelected())
            message += "Мясо\n";

        System.out.println(message);
    }
}
