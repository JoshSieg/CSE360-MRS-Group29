package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DoctorPageController {

    public TextField patientNameField;
    public Button logoutButton; //go to login page (first page)
    public Button searchPatientButton;
    public Button viewLastVisitButton;
    public Button goPatientPageButton;


    public SceneController sc = new SceneController();

    public void handleLogoutButton(ActionEvent event) throws IOException{
        sc.switchToLoginPage(event);
    }
    public void handleSearchPatient(ActionEvent event) throws IOException{
        System.out.println("searched patient");
    }
    public void handleViewLastVisit(ActionEvent event) throws IOException {
        System.out.println("viewed last visit");
    }
    public void handleToPatientPage(ActionEvent event) throws IOException {
        sc.switchToPatientPage(event);
    }

}
