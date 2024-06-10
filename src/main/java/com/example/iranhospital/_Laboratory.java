package com.example.iranhospital;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class _Laboratory {


    @FXML
    private TextArea LaboratoryTextArea;

    @FXML
    private Button Exit;

    @FXML
    private Button Refresh;

    @FXML
    void Exit(ActionEvent event) throws IOException {
        GlobalState.doctor.endShift();
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

}
