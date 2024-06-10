package com.example.iranhospital;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class _DoctorMode {
    private boolean changStagePa;

    @FXML
    void Resize1(MouseEvent event) {
        ScaleTransition st = new ScaleTransition();
        st.setToX(1.1);
        st.setToY(1.1);
        st.setDuration(Duration.millis(200));
        FadeTransition fd = new FadeTransition(Duration.millis(400));
        fd.setAutoReverse(false);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.setCycleCount(1);
        if (event.getSource()==BtnChangePassword){
            st.setNode(BtnChangePassword);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
//            fd.setNode(line1);
//            fd.play();
//            fd.setNode(line2);
//            fd.play();
//            fd.setNode(showdata1);
//            fd.play();
        }
        else if (event.getSource()==BtnEnterRoom){
            st.setNode(BtnEnterRoom);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEndOfWork){
            st.setNode(BtnEndOfWork);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnPatients){
            st.setNode(BtnPatients);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnVisit){
            st.setNode(BtnVisit);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
    }

    @FXML
    void Resize2(MouseEvent event) {

        ScaleTransition st = new ScaleTransition();
        st.setToX(1);
        st.setToY(1);
        st.setCycleCount(1);
        st.setDuration(Duration.millis(200));
        FadeTransition fd = new FadeTransition(Duration.millis(400));
        fd.setAutoReverse(false);
        fd.setFromValue(0);
        fd.setToValue(1);
        fd.setCycleCount(1);
        if (event.getSource()==BtnChangePassword){
            st.setNode(BtnChangePassword);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEndOfWork){
            st.setNode(BtnEndOfWork);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEnterRoom){
            st.setNode(BtnEnterRoom);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnPatients){
            st.setNode(BtnPatients);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnVisit){
            st.setNode(BtnVisit);
            st.setAutoReverse(true);
            st.play();
        }

    }
    public void showdata(MouseEvent event) {
        FadeTransition fd1 = new FadeTransition(Duration.millis(400));
        fd1.setAutoReverse(false);
        fd1.setFromValue(0.0);
        fd1.setToValue(1.0);
        fd1.setCycleCount(1);

        FadeTransition fd2 = new FadeTransition(Duration.millis(400));
        fd2.setAutoReverse(false);
        fd2.setFromValue(0.0);
        fd2.setToValue(1.0);
        fd2.setCycleCount(1);

        FadeTransition fd3 = new FadeTransition(Duration.millis(400));
        fd3.setAutoReverse(false);
        fd3.setFromValue(0.0);
        fd3.setToValue(1.0);
        fd3.setCycleCount(1);

        FadeTransition fd4 = new FadeTransition(Duration.millis(400));
        fd4.setAutoReverse(false);
        fd4.setFromValue(0.0);
        fd4.setToValue(1.1);
        fd4.setCycleCount(1);
    }

    @FXML
    private Button BtnChangePassword;

    @FXML
    private Button BtnEndOfWork;

    @FXML
    private Button BtnEnterRoom;

    @FXML
    private Button BtnMesage1;

    @FXML
    private Button BtnMesage2;

    @FXML
    private Button BtnMesage3;

    @FXML
    private Button BtnMesage4;

    @FXML
    private Button BtnMesage5;

    @FXML
    private Button BtnPatients;

    @FXML
    private Button BtnVisit;

    @FXML
    private Button Exit;

    @FXML
    private Button Refresh;

    @FXML
    void BtnChangePassword(ActionEvent event) throws IOException {
        if (!this.changStagePa) {
            Stage stage = (Stage) Exit.getScene().getWindow();
            Stage primaryStage = new Stage();
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("ChangePassword.fxml"));
            Scene scene = new Scene(root);
            stage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }

    @FXML
    void BtnEndOfWork(ActionEvent event) throws IOException {
        Stage stage =(Stage) BtnEnterRoom.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Signin.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void BtnEnterRoom(ActionEvent event) throws IOException {
        String unitName = GlobalState.doctor.getUnitName();
        Stage stage =(Stage) BtnEnterRoom.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource(GlobalState.doctor.getUnitName()+".fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void BtnMesage1(ActionEvent event) {

    }

    @FXML
    void BtnMesage2(ActionEvent event) {

    }

    @FXML
    void BtnMesage3(ActionEvent event) {

    }

    @FXML
    void BtnMesage4(ActionEvent event) {

    }

    @FXML
    void BtnMesage5(ActionEvent event) {

    }

    @FXML
    void BtnPatients(ActionEvent event) throws IOException {
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Patients.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @FXML
    void BtnVisit(ActionEvent event) throws IOException {
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Visit.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void Exit(ActionEvent event) throws IOException {
        Stage stage =(Stage) Exit.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Signin.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    void Refresh(ActionEvent event) throws IOException {
        GlobalState.doctor.getCheckUpList();
        Stage stage =(Stage) Refresh.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("DoctorMode.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
