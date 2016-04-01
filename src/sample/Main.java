package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller myController = loader.getController();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1010, 639));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
