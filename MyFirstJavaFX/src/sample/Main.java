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
        primaryStage.setTitle("Калькулятор");
        primaryStage.setScene(new Scene(root, 400, 500));
        primaryStage.setResizable(false);  //запрет на изменение размера (окно не растягивается)
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
