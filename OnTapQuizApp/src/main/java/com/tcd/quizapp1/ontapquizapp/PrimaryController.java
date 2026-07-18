package com.tcd.quizapp1.ontapquizapp;

import com.tcd.untils.AlertSingleton;
import com.tcd.untils.StageSingleton;
import com.tcd.untils.services.ThemeStyles;
import static com.tcd.untils.services.ThemeStyles.DEFAUT;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable {

    @FXML
    private ComboBox<ThemeStyles> cbbTheme;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbbTheme.setItems(FXCollections.observableArrayList(ThemeStyles.values()));
    }

    public void manageQuestion(ActionEvent e) throws IOException {
        AlertSingleton.getAlert().showMsg("Mange Question");
        StageSingleton.getStage().showStage("question");
    }

    public void practice(ActionEvent e) {
        AlertSingleton.getAlert().showMsg("Practics");
    }

    public void exam(ActionEvent e) {
        AlertSingleton.getAlert().showMsg("Exam");
    }

    public void changeTheme(ActionEvent e) {
//        switch (this.cbbTheme.getSelectionModel().getSelectedItem()) {
//            case DARK:
//                this.cbbTheme.getScene().getRoot().getStylesheets().clear();
//                this.cbbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("/com/tcd/css/dark.css").toExternalForm());
//                break;
//            case LIGHT:
//                this.cbbTheme.getScene().getRoot().getStylesheets().clear();
//                this.cbbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("/com/tcd/css/light.css").toExternalForm());
//                break;
//            default:
//                this.cbbTheme.getScene().getRoot().getStylesheets().clear();
//                this.cbbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("/com/tcd/css/style.css").toExternalForm());
//            break;
//        }

        this.cbbTheme.getSelectionModel().getSelectedItem().updateTheme(this.cbbTheme.getScene());
    }
}
