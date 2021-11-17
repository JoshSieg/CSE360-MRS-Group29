package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Calendar;

public class DoctorPageController {

    public TextField patientNameField;
    public TextArea patientInfoField;
    public Button logoutButton; //go to login page (first page)
    public Button searchPatientButton;
    public Button viewLastVisitButton;
    public Button goPatientPageButton;
    public VBox patientBox;
    private String[][] patients;
    private Patient selectedPatient = null;

    public SceneController sc = new SceneController();

    @FXML
    public void initialize() {
        patients = new String[UserManager.getAllPatients().size()][2];
        int count = 0;

        ToggleButton tempButton;
        ToggleGroup tg = new ToggleGroup();
        for (Patient patient : UserManager.getAllPatients()) {
            patients[count][0] = patient.getName();
            patients[count][1] = patient.getUsername();
            count++;
            tempButton = new ToggleButton(patient.getName());
            tempButton.setOnAction(this::handleClickName);
            tempButton.setMinWidth(198);
            tempButton.setToggleGroup(tg);
            patientBox.getChildren().add(tempButton);
        }
    }

    public void handleClickName(ActionEvent event) {
        String selectedPatientName = ((ToggleButton)event.getSource()).getText();
        String selectedPatientUsername = null;
        for (int i = 0; i < UserManager.getAllPatients().size(); i++) {
            if (patients[i][0].equals(selectedPatientName)) {
                selectedPatientUsername = patients[i][1];
            }
        }
        if (selectedPatientUsername != null) {
            for (Patient patient : UserManager.getAllPatients()) {
                if (patient.getUsername().equals(selectedPatientUsername)) {
                    selectedPatient = patient;
                }
            }
            if (selectedPatient != null) {
                patientInfoField.setText(selectedPatient.getName() + "\n" + "D.O.B: " + selectedPatient.getDateOfBirth().get(Calendar.MONTH) + "/" + selectedPatient.getDateOfBirth().get(Calendar.DAY_OF_MONTH) + "/" + selectedPatient.getDateOfBirth().get(Calendar.YEAR));
            }
        }
    }

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
