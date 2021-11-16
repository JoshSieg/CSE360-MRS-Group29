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

    public void handleSearchPatient() {
        System.out.println("clicked patient search");
    }

    public void handleViewLastVisit() {
        System.out.println("clicked last visit");
    }

    public void handleToPatientPage() {
        System.out.println("clicked patient page");
    }

}
