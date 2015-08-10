package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;


/**
 * Created by tm on 09.08.2015.
 */
public class JFXGUItutorial9 extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №9");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label nameLabel = new Label("Логин: ");
        GridPane.setConstraints(nameLabel,0,0);

        TextField nameInput = new TextField();
        nameInput.setPromptText("Введите имя");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Пароль: ");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField();
        passInput.setPromptText("Введите пароль");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Войти");
        GridPane.setConstraints(loginButton, 1, 2);

        grid.getChildren().addAll(nameInput,nameLabel,passInput,passLabel,loginButton);

        Scene scene = new Scene(grid, 300,200);
        window.setScene(scene);
        window.show();
    }
}
