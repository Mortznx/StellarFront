package com.example.iranhospital;

import com.ascteral.stellarhospital.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _HelloController {
    private String unitName;
    private Doctor doctor;
    private Emergency emergency;
    private Neurology neurology;
    private ICU icu;
    private CCU ccu;
    private NICU nicu;
    private PICU picu;
    private InternalMedicine internalMedicine;
    private Obstetrics obstetrics;
    private CTScan ctScan;

    @FXML
    private Button BtnSgnin;

    @FXML
    private ImageView ImgMoverAmbulance;

    @FXML
    private TextField SigninPassword;

    @FXML
    private TextField TxtPersonalCode;
    @FXML
    void BtnSgnin(ActionEvent event) throws IOException {
        Staff staff = new Staff();
        System.out.println(333);
        if (TxtPersonalCode.getText().equals("00") && SigninPassword.getText().equals("0")) {
            System.out.println("dd");
        } else if (TxtPersonalCode.getText().equals("0") && SigninPassword.getText().equals("0")) {
            emergency = new Emergency("");
            this.unitName = "Emergency";
            GlobalState.room = new Room("Emergency");
            GlobalState.emergency = this.emergency;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Emergency.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("1") && SigninPassword.getText().equals("0")) {
            icu = new ICU("");
            this.unitName = "ICU";
            GlobalState.room = new Room("ICU");
            GlobalState.icu = this.icu;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("ICU.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("2") && SigninPassword.getText().equals("0")) {
            ccu = new CCU("");
            this.unitName = "CCU";
            GlobalState.room = new Room("CCU");
            GlobalState.ccu = this.ccu;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("CCU.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("3") && SigninPassword.getText().equals("0")) {
            nicu = new NICU("");
            this.unitName = "NICU";
            GlobalState.room = new Room("NICU");
            GlobalState.nicu = this.nicu;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("NICU.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("4") && SigninPassword.getText().equals("0")) {
            picu = new PICU("");
            this.unitName = "PICU";
            GlobalState.room = new Room("PICU");
            GlobalState.picu = this.picu;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("PICU.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("5") && SigninPassword.getText().equals("0")) {
            neurology = new Neurology("");
            this.unitName = "OROLOGY";
            GlobalState.room = new Room("Orology");
            GlobalState.neurology = this.neurology;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("OROLOGY.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("6") && SigninPassword.getText().equals("0")) {
            internalMedicine = new InternalMedicine("");
            this.unitName = "INTERNAL";
            GlobalState.room = new Room("Internal");
            GlobalState.internalMedicine = this.internalMedicine;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("INTERNAL.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("7") && SigninPassword.getText().equals("0")) {
            ctScan = new CTScan("");
            GlobalState.cTScan = this.ctScan;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Laboratory.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("8") && SigninPassword.getText().equals("0")) {
            ctScan = new CTScan("");
            GlobalState.cTScan = this.ctScan;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Reception.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (TxtPersonalCode.getText().equals("9") && SigninPassword.getText().equals("0")) {
            emergency = new Emergency();
            GlobalState.emergency = this.emergency;
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("addNewPatient.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else if (staff.isCorrectPassword(Integer.parseInt(TxtPersonalCode.getText()), SigninPassword.getText())) {
            this.doctor = staff.getStaffInformation(TxtPersonalCode.getText());
            GlobalState.doctor = this.doctor;
            GlobalState.room = new Room(this.doctor.getUnitName());
            System.out.println(GlobalState.doctor.getUnitName());
            GlobalState.doctor.startShift();
            Stage stage = (Stage) BtnSgnin.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("DoctorMode.fxml"));
            stage.setResizable(false);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("wrong username or password");
            alert.showAndWait();
        }
    }
}