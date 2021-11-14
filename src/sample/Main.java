package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/loginPage.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //load data into user manager when program is opened, but only if the data exists
        DataManager dm = new DataManager();
        try {
            File userData = new File("resources/userData.txt");
            if(userData.isFile()) {
                dm.readFromFile("resources/userData.txt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
        //save data into storage file on application close
        DataManager dm = new DataManager();
        try {
            dm.saveToFile("resources/userData.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
