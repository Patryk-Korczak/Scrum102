package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        System.out.println("test");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        System.out.println("test2");
        System.out.println("test4");
        System.out.println("test3");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
