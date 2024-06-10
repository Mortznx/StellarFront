package com.example.iranhospital;

import com.ascteral.stellarhospital.Doctor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _Visit {

    @FXML
    private Button BtnAdd;

    @FXML
    private MenuItem BtnCCU;

    @FXML
    private MenuItem BtnEmergency;

    @FXML
    private MenuItem BtnGynecologyAndObstetrics;

    @FXML
    private MenuItem BtnICU;

    @FXML
    private MenuItem BtnINFECTIOUS;

    @FXML
    private MenuItem BtnINTERNAL;

    @FXML
    private MenuItem BtnNICU;

    @FXML
    private Button BtnNext;

    @FXML
    private MenuItem BtnOROLOGY;

    @FXML
    private MenuItem BtnPICU;

    @FXML
    private Button BtnPatientDischargeRequest;

    @FXML
    private Button BtnTextRequest;

    @FXML
    private Button BtnTransferToTheOperatingRoom;

    @FXML
    private Button Exit;

    @FXML
    private TextArea MedicalRecord;

    @FXML
    private TextArea PatientProfile;

    @FXML
    private Button Refresh;

    @FXML
    private SplitMenuButton SplitTransfer;

    @FXML
    private Label TotalPrice;

    @FXML
    void BtnAdd(ActionEvent event) {

    }

    @FXML
    void BtnCCU(ActionEvent event) {

    }

    @FXML
    void BtnEmergency(ActionEvent event) {

    }

    @FXML
    void BtnGynecologyAndObstetrics(ActionEvent event) {

    }

    @FXML
    void BtnICU(ActionEvent event) {

    }

    @FXML
    void BtnINFECTIOUS(ActionEvent event) {

    }

    @FXML
    void BtnINTERNAL(ActionEvent event) {

    }

    @FXML
    void BtnNICU(ActionEvent event) {

    }

    @FXML
    void BtnNext(ActionEvent event) {
        GlobalState.doctor.getCheck();
    }

    @FXML
    void BtnOROLOGY(ActionEvent event) {

    }

    @FXML
    void BtnPICU(ActionEvent event) {

    }

    @FXML
    void BtnPatientDischargeRequest(ActionEvent event) {
    }

    @FXML
    void BtnTextRequest(ActionEvent event) {

    }

    @FXML
    void BtnTransferToTheOperatingRoom(ActionEvent event) {
        //GlobalState.doctor.getOperating();
    }

    @FXML
    void Exit(ActionEvent event) throws IOException {
        String unitName = GlobalState.doctor.getUnitName();
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("DoctorMode.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void Refresh(ActionEvent event) {

    }

    @FXML
    void SplitTransfer(ActionEvent event) {

    }

}
