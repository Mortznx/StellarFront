package com.example.iranhospital;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.ArrayList;

public class _ICU {

    @FXML
    private Button BtnBack;

    @FXML
    private Button BtnEmeregencyMen1;

    @FXML
    private Button BtnEmeregencyMen2;

    @FXML
    private Button BtnEmeregencyMen3;

    @FXML
    private Button BtnEmeregencyMen4;

    @FXML
    private Button BtnEmeregencyMen5;

    @FXML
    private Button BtnEmeregencyMen6;

    @FXML
    private Button BtnEmeregencyWeman1;

    @FXML
    private Button BtnEmeregencyWeman2;

    @FXML
    private Button BtnEmeregencyWeman3;

    @FXML
    private Button BtnEmeregencyWeman4;

    @FXML
    private Button BtnEmeregencyWeman5;

    @FXML
    private Button BtnEmeregencyWeman6;

    @FXML
    private ScrollPane EmergencyScrollPane;

    @FXML
    private Line Line100;

    @FXML
    private Line Line101;

    @FXML
    private Label lblBedNumberEmergencyMen;

    @FXML
    private Label lblBedNumberEmergencyWeman;

    @FXML
    private Label lblFirstNameEmergencyMen;

    @FXML
    private Label lblFirstNameEmergencyWeman;

    @FXML
    private Label lblIDEmergencyMen;

    @FXML
    private Label lblIDEmergencyWeman;

    @FXML
    private Label lblLastNameEmergencyMen;

    @FXML
    private Label lblLastNameEmergencyWeman;

    @FXML
    private Line line1;

    @FXML
    private Line line10;

    @FXML
    private Line line11;

    @FXML
    private Line line12;

    @FXML
    private Line line13;

    @FXML
    private Line line14;

    @FXML
    private Line line15;

    @FXML
    private Line line16;

    @FXML
    private Line line17;

    @FXML
    private Line line18;

    @FXML
    private Line line19;

    @FXML
    private Line line2;

    @FXML
    private Line line20;

    @FXML
    private Line line21;

    @FXML
    private Line line22;

    @FXML
    private Line line23;

    @FXML
    private Line line24;

    @FXML
    private Line line25;

    @FXML
    private Line line26;

    @FXML
    private Line line3;

    @FXML
    private Line line4;

    @FXML
    private Line line5;

    @FXML
    private Line line6;

    @FXML
    private Line line7;

    @FXML
    private Line line8;

    @FXML
    private Line line9;

    @FXML
    private Label movinglbl;

    @FXML
    private AnchorPane showdata1;

    @FXML
    private AnchorPane showdata2;

    @FXML
    void BtnEmeregencyMen1(ActionEvent event) {
        if (GlobalState.room.man[0]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[0].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[0].getLastName());
            lblBedNumberEmergencyMen.setText("0");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[0].getId()));
        }
    }

    @FXML
    void BtnEmeregencyMen2(ActionEvent event) {
        if (GlobalState.room.man[1]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[1].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[1].getLastName());
            lblBedNumberEmergencyMen.setText("1");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[1].getId()));
        }
    }

    @FXML
    void BtnEmeregencyMen3(ActionEvent event) {
        if (GlobalState.room.man[2]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[2].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[2].getLastName());
            lblBedNumberEmergencyMen.setText("2");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[2].getId()));
        }
    }

    @FXML
    void BtnEmeregencyMen4(ActionEvent event) {
        if (GlobalState.room.man[3]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[3].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[3].getLastName());
            lblBedNumberEmergencyMen.setText("3");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[3].getId()));
        }
    }

    @FXML
    void BtnEmeregencyMen5(ActionEvent event) {
        if (GlobalState.room.man[4]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[4].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[4].getLastName());
            lblBedNumberEmergencyMen.setText("4");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[4].getId()));
        }
    }

    @FXML
    void BtnEmeregencyMen6(ActionEvent event) {
        if (GlobalState.room.man[5]!=null) {
            lblFirstNameEmergencyMen.setText(GlobalState.room.man[5].getFirstName());
            lblLastNameEmergencyMen.setText(GlobalState.room.man[5].getLastName());
            lblBedNumberEmergencyMen.setText("5");
            lblIDEmergencyMen.setText(String.valueOf(GlobalState.room.man[5].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman1(ActionEvent event) {
        if (GlobalState.room.woman[0]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[0].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[0].getLastName());
            lblBedNumberEmergencyWeman.setText("0");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[0].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman2(ActionEvent event) {
        if (GlobalState.room.woman[1]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[1].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[1].getLastName());
            lblBedNumberEmergencyWeman.setText("1");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[1].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman3(ActionEvent event) {
        if (GlobalState.room.woman[2]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[2].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[2].getLastName());
            lblBedNumberEmergencyWeman.setText("2");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[2].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman4(ActionEvent event) {
        if (GlobalState.room.woman[3]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[3].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[3].getLastName());
            lblBedNumberEmergencyWeman.setText("3");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[3].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman5(ActionEvent event) {
        if (GlobalState.room.woman[4]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[4].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[4].getLastName());
            lblBedNumberEmergencyWeman.setText("4");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[4].getId()));
        }
    }

    @FXML
    void BtnEmeregencyWeman6(ActionEvent event) {
        if (GlobalState.room.woman[5]!=null) {
            lblFirstNameEmergencyWeman.setText(GlobalState.room.woman[5].getFirstName());
            lblLastNameEmergencyWeman.setText(GlobalState.room.woman[5].getLastName());
            lblBedNumberEmergencyWeman.setText("5");
            lblIDEmergencyWeman.setText(String.valueOf(GlobalState.room.woman[5].getId()));
        }
    }

    @FXML
    void BtnBack(ActionEvent event) throws IOException {
        Stage stage =(Stage) BtnBack.getScene().getWindow();
        stage.close();
        Stage primaryStage=new Stage();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("DoctorMode.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void unvisible(){
        ArrayList<Line> lines = new ArrayList<Line>();
        lines.add(line1);lines.add(line2);lines.add(line3);lines.add(line4);lines.add(line5);lines.add(line6);lines.add(line7);
        lines.add(line8);lines.add(line9);lines.add(line10);lines.add(line11);lines.add(line12);lines.add(line13);lines.add(line14);
        lines.add(line15);lines.add(line16);lines.add(line17);lines.add(line18);lines.add(line19);lines.add(line20);lines.add(line21);
        lines.add(line22);lines.add(line22);lines.add(line23);lines.add(line24);lines.add(line25);lines.add(line26);lines.add(Line100);lines.add(Line101);
        for(Line i : lines){
            i.setVisible(false);
        }
    }
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
        if (event.getSource()==BtnEmeregencyMen1){
            st.setNode(BtnEmeregencyMen1);
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
        else if (event.getSource()==BtnEmeregencyMen2){
            st.setNode(BtnEmeregencyMen2);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen3){
            st.setNode(BtnEmeregencyMen3);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEmeregencyMen4){
            st.setNode(BtnEmeregencyMen4);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEmeregencyMen5){
            st.setNode(BtnEmeregencyMen5);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen5){
            st.setNode(BtnEmeregencyMen5);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen6){
            st.setNode(BtnEmeregencyMen6);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman1){
            st.setNode(BtnEmeregencyWeman1);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman2){
            st.setNode(BtnEmeregencyWeman2);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman3){
            st.setNode(BtnEmeregencyWeman3);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman4){
            st.setNode(BtnEmeregencyWeman4);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman5){
            st.setNode(BtnEmeregencyWeman5);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman6){
            st.setNode(BtnEmeregencyWeman6);
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
        if (event.getSource()==BtnEmeregencyMen1){
            st.setNode(BtnEmeregencyMen1);
            st.setCycleCount(1);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEmeregencyMen2){
            st.setNode(BtnEmeregencyMen2);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen3){
            st.setNode(BtnEmeregencyMen3);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEmeregencyMen4){
            st.setNode(BtnEmeregencyMen4);
            st.setAutoReverse(true);
            st.play();
        }
        else if (event.getSource()==BtnEmeregencyMen5){
            st.setNode(BtnEmeregencyMen5);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen5){
            st.setNode(BtnEmeregencyMen5);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyMen6){
            st.setNode(BtnEmeregencyMen6);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman1){
            st.setNode(BtnEmeregencyWeman1);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman2){
            st.setNode(BtnEmeregencyWeman2);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman3){
            st.setNode(BtnEmeregencyWeman3);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman4){
            st.setNode(BtnEmeregencyWeman4);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman5){
            st.setNode(BtnEmeregencyWeman5);
            st.setAutoReverse(true);
            st.play();
        }

        else if (event.getSource()==BtnEmeregencyWeman6){
            st.setNode(BtnEmeregencyWeman6);
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

        if (event.getSource() == BtnEmeregencyMen1) {
            unvisible();
            line1.setVisible(true);
            fd1.setNode(line1);
            fd1.play();
            line2.setVisible(true);
            fd2.setNode(line2);
            fd2.play();
            showdata1.setVisible(true);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyMen2) {
            unvisible();
            line3.setVisible(true);
            fd1.setNode(line3);
            fd1.play();
            line4.setVisible(true);
            fd2.setNode(line4);
            fd2.play();
            Line100.setVisible(true);
            fd4.setNode(Line100);
            fd4.play();
            showdata1.setVisible(true);
            showdata2.setVisible(false);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyMen3) {
            unvisible();
            line5.setVisible(true);
            fd1.setNode(line5);
            fd1.play();
            line6.setVisible(true);
            fd2.setNode(line6);
            fd2.play();
            showdata1.setVisible(true);
            showdata2.setVisible(false);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyMen4) {
            unvisible();
            line7.setVisible(true);
            fd1.setNode(line7);
            fd1.play();
            line8.setVisible(true);
            fd2.setNode(line8);
            fd2.play();
            showdata1.setVisible(true);
            showdata2.setVisible(false);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyMen5) {
            unvisible();
            line9.setVisible(true);
            fd1.setNode(line9);
            fd1.play();
            line10.setVisible(true);
            fd2.setNode(line10);
            fd2.play();
            Line101.setVisible(true);
            fd4.setNode(Line101);
            fd4.play();
            showdata1.setVisible(true);
            showdata2.setVisible(false);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyMen6) {
            unvisible();
            line11.setVisible(true);
            fd1.setNode(line11);
            fd1.play();
            line12.setVisible(true);
            fd2.setNode(line12);
            fd2.play();
            showdata1.setVisible(true);
            showdata2.setVisible(false);
            fd3.setNode(showdata1);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman1) {
            unvisible();
            line13.setVisible(true);
            fd1.setNode(line13);
            fd1.play();
            line14.setVisible(true);
            fd2.setNode(line14);
            fd2.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman2) {
            unvisible();
            line21.setVisible(true);
            fd1.setNode(line21);
            fd1.play();
            line23.setVisible(true);
            fd2.setNode(line23);
            fd2.play();
            line22.setVisible(true);
            fd4.setNode(line22);
            fd4.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman3) {
            unvisible();
            line17.setVisible(true);
            fd1.setNode(line17);
            fd1.play();
            line18.setVisible(true);
            fd2.setNode(line18);
            fd2.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman4) {
            unvisible();
            line15.setVisible(true);
            fd1.setNode(line15);
            fd1.play();
            line16.setVisible(true);
            fd2.setNode(line16);
            fd2.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman5) {
            unvisible();
            line24.setVisible(true);
            fd1.setNode(line24);
            fd1.play();
            line25.setVisible(true);
            fd2.setNode(line25);
            fd2.play();
            line26.setVisible(true);
            fd4.setNode(line26);
            fd4.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        } else if (event.getSource() == BtnEmeregencyWeman6) {
            unvisible();
            line19.setVisible(true);
            fd1.setNode(line19);
            fd1.play();
            line20.setVisible(true);
            fd2.setNode(line20);
            fd2.play();
            showdata1.setVisible(false);
            showdata2.setVisible(true);
            fd3.setNode(showdata2);
            fd3.play();
        }
        EmergencyScrollPane.setOnScroll(scrollEvent -> {
            double deltaY = scrollEvent.getDeltaY();
            double deltaX = scrollEvent.getDeltaY() * 0.02;
            Node contentNode = EmergencyScrollPane.getContent();
            double newX = Math.min(Math.max(contentNode.getTranslateX() + deltaX, -10), 0);
            contentNode.setTranslateX(newX);
            double scrollH = newX /  -10;
            EmergencyScrollPane.setHvalue(scrollH);
            scrollEvent.consume();
        });
    }
}