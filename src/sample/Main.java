package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;

        Label label1 = new Label("Добро пожаловать в первую сцену");
        Button button1 = new Button("Идти в сцену 2");
        button1.setOnAction(e -> window.setScene(scene2));
        window.setOnCloseRequest(e ->{
            e.consume();
            closeProgram();
        });

        //button3
        Button button3 = new Button("открыть новое окно");
        button3.setOnAction(e -> AlertBox.display("Новое окно", "Круто!"));

        //button3
        Button button4 = new Button("закрыть приложение");
        button4.setOnAction(e -> {
            closeProgram();
        });


        //Layout - children are laid in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1, button3, button4);
        scene1 = new Scene(layout1, 200, 200);

        //button2
        Button button2 = new Button("Это сцена говно иди в сцену 1");
        button2.setOnAction(e -> window.setScene(scene1));



        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2,600,300);

        window.setScene(scene1);
        window.setTitle("Тайтл здесь");
        window.show();
    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("Завершение работы программы", "Вы уверены?");
        if(answer){
            window.close();
        }
    }

}
