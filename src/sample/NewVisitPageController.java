package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class NewVisitPageController {
    public TextField nameOfPatientField;
    public TextField dateOfVisitField;
    public TextField heightField;
    public TextField weightField;
    public TextField bodyTempField;
    public TextField bloodPressureField;
    public TextField reasonOfVisitField;
    public Button backButton;
    public Button addNewVisitButton;

    ArrayList<Patient> patientList = UserManager.getCurrentUser().getPatientList();
    for(int i=0; i<patientList.size(); i++) {
        if(nameOfPatientField == patientList.get(i)) {
            patientList.get(i).newVisit(heightField,weightField,bodyTempField,bloodPressureField);
        }
        //If entered ID does not match, print invalid ID.
        else if(inputId != ((Laptops) arr.get(i)).getId()) {
            System.out.println("Invalid ID.");
        }
    }

    public SceneController sc = new SceneController();

    public void handleBackButton (ActionEvent event) throws IOException {
        sc.switchToNursePage(event);
    }
    public void handleAddNewVisitButton (ActionEvent event) throws IOException {
        sc.switchToNewVisitPage(event);
    }


}
