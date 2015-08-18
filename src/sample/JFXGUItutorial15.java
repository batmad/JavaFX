package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by tm on 18.08.2015.
 */
public class JFXGUItutorial15 extends Application{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Приложение №15");
        Button btn = new Button("Выбрать");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll("Тор", "Супермен", "Железный человек", "Спайдермен");
        listView.getSelectionModel();
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        btn.setOnAction(e -> btnClicked(listView));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView,btn);

        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    public void btnClicked(ListView listView){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();
        for (String movie: movies){
            message += movie + "\n";
        }

        System.out.println(message);
    }
}
