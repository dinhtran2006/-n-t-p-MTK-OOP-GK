module com.tcd.quizapp1.ontapquizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.tcd.quizapp1.ontapquizapp to javafx.fxml;
    exports com.tcd.quizapp1.ontapquizapp;
}
