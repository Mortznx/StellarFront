package com.example.iranhospital;

import com.ascteral.stellarhospital.Staff;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class _HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(_HelloApplication.class.getResource("Signin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Iran Hospital");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Staff staff = new Staff();
        Staff staff1 = new Staff("morteza", "nazari",28, 0, "Emergency");
        staff.addStaff(staff1);
        staff.addStaff(new Staff("a1","a1",29,0,"ICU"));
        staff.addStaff(new Staff("b1","b1",30,0,"CCU"));
        launch();
    }
}