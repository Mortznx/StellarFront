package com.example.iranhospital;

import com.ascteral.stellarhospital.Staff;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _ChangePassword {

    @FXML
    private Button BtnChange;

    @FXML
    private PasswordField TxtLastPassword;

    @FXML
    private PasswordField TxtNewPassword;

    @FXML
    private PasswordField TxtRepeatNewPassword;

    @FXML
    void BtnChange(ActionEvent event) throws IOException {
        Staff staff = new Staff();
        staff.changPassword(Integer.parseInt(TxtLastPassword.getText()),TxtNewPassword.getText());
        Stage stage =(Stage) BtnChange.getScene().getWindow();
        stage.close();
    }

}