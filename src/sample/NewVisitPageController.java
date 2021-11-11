package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewVisitPageController {
    public TextField timeOfVisitField;
    public TextField heightField;
    public TextField weightField;
    public TextField bodyTempField;
    public TextField bloodPressureField;
    public TextField reasonOfVisitField;
    public Button backButton;
    public Button addNewVisitButton;

    public SceneController sc = new SceneController();

    public void handleBackButton (ActionEvent event) throws IOException {
        //sc.switchToNursePage(event);
    }
    public void handleAddNewVisitButton () {
        System.out.println("Added New Visit");
    }


}
