package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class ForgotPasswordController {

    public Button backButton;
    public Button sendButton;
    public Button verifyButton;

    public Label sentLabel;
    public Label verLabel;
    public SceneController sc = new SceneController();


    public void handleBackButton(ActionEvent event) throws IOException {
        sc.switchToLoginPage(event);
    }

    public void handleSendButton(ActionEvent event) throws IOException {
        sentLabel.setText("Sent!");
    }


    public void handleVerifyButton(ActionEvent event) throws IOException {
        verLabel.setText("Verified!");
    }



}