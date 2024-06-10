package com.example.iranhospital;

import com.ascteral.stellarhospital.Emergency;
import com.ascteral.stellarhospital.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _AddnewPatient {
    Patient patient;

    @FXML
    private MenuItem GenderMale;

    @FXML
    private MenuItem GenderFemale;

    @FXML
    private TextField TxtFirstName;

    @FXML
    private TextField TxtLastName;

    @FXML
    private TextField TxtID;

    @FXML
    private Button BtnRegistration;

    @FXML
    private TextField TxtFatherName;

    @FXML
    private SplitMenuButton SplitGender;

    @FXML
    private TextField TxtBirthdayYear;

    @FXML
    private TextField TxtBirthdayMonth;

    @FXML
    private TextField TxtBirthdayDay;

    @FXML
    private TextField TxtLocation;

    @FXML
    private TextField TxtPhone;

    @FXML
    private TextField TxtCompanion;

    @FXML
    private TextField TxtCompanionPhone;

    @FXML
    private TextField TxtArrivalDate;


    @FXML
    private Button BtnExit;

    @FXML
    void BtnExit(ActionEvent event) throws IOException {
        Stage stage =(Stage) BtnExit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Signin.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public _AddnewPatient() {
        this.patient = new Patient();
    }


    @FXML
    void GenderFemale(ActionEvent event) {
        patient.setMale(false);
    }

    @FXML
    void GenderMale(ActionEvent event) {
        patient.setMale(true);
    }

    @FXML
    void BtnRegistration(ActionEvent event) {
        patient.setFirstName(TxtFirstName.getText());
        patient.setLastName(TxtLastName.getText());
        patient.setFatherName(TxtFatherName.getText());
        patient.setBirthday(TxtBirthdayYear.getText() + TxtBirthdayMonth.getText() + TxtBirthdayDay.getText());
        patient.setCompanion(TxtCompanion.getText());
        patient.setArrivalDate(patient.getArrivalDate());
        patient.setBirthdayLocation("Tabriz");
        patient.setId(patient.getNewId());
        patient.setLocation(TxtLocation.getText());
        patient.setSingle(true);
        patient.setCompanionPhone(TxtCompanionPhone.getText());
        patient.setPhone(TxtPhone.getText());
        patient.setIdentifyID(Long.parseLong(TxtID.getText()));
        GlobalState.emergency.addPatient(patient);
        System.out.println(new Emergency().getPatientInformation(0).toString());
    }

}
