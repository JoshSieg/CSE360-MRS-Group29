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
    public SceneController sc = new SceneController();

    public void handleBackButton (ActionEvent event) throws IOException {
        sc.switchToNursePage(event);
    }
    public void handleAddNewVisitButton (ActionEvent event) throws IOException {
        ArrayList<Nurse> nurseList = new ArrayList<Nurse>();
        nurseList = UserManager.getAllNurses();
        int j = 0;
        for(int i=0; i<nurseList.size(); i++) {
            if(UserManager.getCurrentUser() == nurseList.get(i)) {
                j = i;
                break;
            }
        }
        Nurse currentNurse = nurseList.get(j);
        int k = 0;
        for(int i=0; i<currentNurse.getPatientList().size(); i++) {
            if(currentNurse.getPatientList().get(i).getName() == nameOfPatientField.getText()) {
                k = i;
            }
        }
        currentNurse.getPatientList().get(k).newVisit(heightField.getText(),weightField.getText(),bodyTempField.getText(),bloodPressureField.getText());
        sc.switchToNewVisitPage(event);
    }


}
