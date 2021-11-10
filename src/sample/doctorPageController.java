package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class doctorPageController {

    public TextField dateField;

    public Button scheduleButton;
    public Button logoutButton; //go to login page (first page)
    public Button patientSearchButton; //go to patient search page
    public Button viewLastVisitButton;
    public Button goPatientPageButton;

    public SceneController sc = new SceneController();

    public void handleSchedule() {
        System.out.println("clicked schedule");
    }

    public void handleLogout(ActionEvent event) throws IOException{
        sc.switchToLoginPage(event);
    }

    public void handlePatientSearch() {
        System.out.println("clicked patient search");
    }

    public void handleViewLastVisit() {
        System.out.println("clicked last visit");
    }

    public void handleToPatientPage() {
        System.out.println("clicked patient page");
    }

}
