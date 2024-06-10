package com.example.iranhospital;

import com.ascteral.stellarhospital.Billing;
import com.ascteral.stellarhospital.Emergency;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _Reception {

    private Billing billing;

    @FXML
    private Button BtnAddnewPatient;

    @FXML
    private Button BtnDischarge;

    @FXML
    private TextArea ClearanceList;

    @FXML
    private Button Exit;

    @FXML
    private TextArea PatientProfile;

    @FXML
    private Button Refresh;

    @FXML
    private Label TotalPrice;

    @FXML
    private TextField TxtFileNumber;

    @FXML
    void BtnAddnewPatient(ActionEvent event) throws IOException {
        GlobalState.doctor.endShift();
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("addNewPatient.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void BtnDischarge(ActionEvent event) {
        this.billing.discharging(Integer.parseInt(TxtFileNumber.getText()));
    }

    @FXML
    void Exit(ActionEvent event) throws IOException {
        GlobalState.doctor.endShift();
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Signin.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    //@FXML
    /*void Refresh(ActionEvent event) {
        this.billing = new Billing();
        String text = "";
        for (int i = 0; i < this.billing.getMessages.size();i++) {
            text += String.valueOf(this.billing.getMessaages.get(i)) + "\n";
        }
        PatientProfile.setText(text);
    }*/
    @FXML
    void keyPressed(KeyEvent event) {

    }
}
