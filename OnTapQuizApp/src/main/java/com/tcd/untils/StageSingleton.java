/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.untils;

import com.tcd.quizapp1.ontapquizapp.App;
import com.tcd.untils.services.ThemeManager;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author CongDinh
 */
public class StageSingleton {

    private static StageSingleton instance;
    private final Stage stage;

    private StageSingleton() {
        this.stage = new Stage();
        this.stage.setTitle("English Quiz app");
    }

    public static StageSingleton getStage() {
        if (instance == null) {
            instance = new StageSingleton();
        }

        return instance;
    }

    public void showStage(String fxml) throws IOException {
        if (!this.stage.isShowing()) {
            Scene scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());

            ThemeManager.updateTheme(scene);

            this.stage.setScene(scene);
            this.stage.show();
        }
    }
}
