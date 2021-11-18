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
            File userData = new File("src/sample/resources/userData.txt");
            if(userData.isFile()) {
                dm.readFromFile("src/sample/resources/userData.txt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //test accounts
        UserManager.getAllNurses().add(new Nurse("John Doe", "john", "password"));
        UserManager.getAllDoctors().add(new Doctor("James Doctor", "james", "password", UserManager.getAllNurses().get(0)));
        UserManager.getAllDoctors().add(new Doctor("Don Donter", "don", "password", UserManager.getAllNurses().get(0)));
        UserManager.getAllPatients().add(new Patient("Patient 1", "p1", "password", 2000, 30, 1, UserManager.getAllDoctors().get(0), UserManager.getAllDoctors().get(0).getAssignedNurse()));
        UserManager.getAllPatients().add(new Patient("Patient 2", "p2", "password", 2000, 30, 1, UserManager.getAllDoctors().get(0), UserManager.getAllDoctors().get(0).getAssignedNurse()));
        UserManager.getAllPatients().add(new Patient("Patient 3", "p3", "password", 2000, 30, 1, UserManager.getAllDoctors().get(0), UserManager.getAllDoctors().get(0).getAssignedNurse()));
        UserManager.getAllPatients().add(new Patient("Patient 4", "p4", "password", 2000, 30, 1, UserManager.getAllDoctors().get(0), UserManager.getAllDoctors().get(0).getAssignedNurse()));
    }


    public static void main(String[] args) {
        launch(args);
        //save data into storage file on application close
        DataManager dm = new DataManager();
        try {
            dm.saveToFile("src/sample/resources/userData.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
