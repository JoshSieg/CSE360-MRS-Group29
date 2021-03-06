package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PharmacyInfoPageController {
    public TextField pharmacyName;
    public TextField pharmacyAddress;
    public TextField pharmacyPhone;
    public Button nameButton;
    public Button addressButton;
    public Button phoneButton;
    public Button backButton;
    public SceneController sc = new SceneController();

    @FXML
    public void initialize() {
        pharmacyName.setText(UserManager.getCurrentPatient().getPharmacyName());
        pharmacyAddress.setText(UserManager.getCurrentPatient().getPharmacyAddress());
        pharmacyPhone.setText(UserManager.getCurrentPatient().getPharmacyPhoneNumber());
    }

    public void handleNameButton (ActionEvent event) {
        if (nameButton.getText().equals("Edit")) {
            pharmacyName.setEditable(true);
            nameButton.setText("Save");
        } else if (nameButton.getText().equals("Save")) {
            pharmacyName.setEditable(false);
            nameButton.setText("Edit");
            UserManager.getCurrentPatient().setPharmacyName(pharmacyName.getText());
        }
    }

    public void handleAddressButton (ActionEvent event) {
        if (addressButton.getText().equals("Edit")) {
            pharmacyAddress.setEditable(true);
            addressButton.setText("Save");
        } else if (addressButton.getText().equals("Save")) {
            pharmacyAddress.setEditable(false);
            addressButton.setText("Edit");
            UserManager.getCurrentPatient().setPharmacyAddress(pharmacyAddress.getText());
        }
    }

    public void handlePhoneButton (ActionEvent event) {
        if (phoneButton.getText().equals("Edit")) {
            pharmacyPhone.setEditable(true);
            phoneButton.setText("Save");
        } else if (phoneButton.getText().equals("Save")) {
            pharmacyPhone.setEditable(false);
            phoneButton.setText("Edit");
            UserManager.getCurrentPatient().setPharmacyPhoneNumber(pharmacyPhone.getText());
        }
    }

    public void handleBackButton (ActionEvent event) throws IOException {
        sc.switchToPatientPage(event);
    }
}
