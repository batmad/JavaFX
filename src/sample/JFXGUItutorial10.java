package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;



/**
 * Created by tm on 09.08.2015.
 */
public class JFXGUItutorial10 extends Application {

    Stage window;
    TextField input;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №11");

        Label label = new Label("Сколько Вам лет?");
        input= new TextField();


        Button button = new Button("Ввести");
        button.setOnAction(e -> isInt(input));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.getChildren().addAll(label,input,button);

        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();
    }

    public boolean isInt(TextField input){
        try{
            int number = Integer.parseInt(input.getText());
            this.input.setStyle("-fx-alignment:center-left;");
            System.out.println("Тебе исполнилось: " + number);
            return true;
        }catch(NumberFormatException e){
            this.input.setStyle("-fx-alignment:center;");
            System.out.println("Ошибка: " + input.getText() + " не является числом");
            return false;
        }
    }

}
