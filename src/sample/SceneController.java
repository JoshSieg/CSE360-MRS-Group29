package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToAccountCreationPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/accountCreationPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNewVisitPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/addNewVisitPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDoctorPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/doctorPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToInsuranceInfoPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/insuranceInfoPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToLoginPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/loginPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMedicalHistoryPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/medicalHistoryPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNursePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/nursePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPasswordChangePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/passwordChangePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPatientPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/patientPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPharmacyInfoPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/PharmacyInfoPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPrescriptionsPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/prescriptionsPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToProfilePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("resources/profilePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}