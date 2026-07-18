/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.tcd.quizapp1.ontapquizapp;

import com.tcd.pojo.Category;
import com.tcd.pojo.Level;
import com.tcd.services.CategorySevices;
import com.tcd.services.LevelServices;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author CongDinh
 */
public class QuestionController implements Initializable {
    @FXML ComboBox<Category> cbbCate;
    @FXML ComboBox<Level> cbbLevel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CategorySevices categoryServices = new CategorySevices();
        LevelServices levelServices = new LevelServices();
        try {
            this.cbbCate.setItems(FXCollections.observableArrayList(categoryServices.getCate()));
            this.cbbLevel.setItems(FXCollections.observableArrayList(levelServices.getLevel()));
        } catch (SQLException ex) {
            System.getLogger(QuestionController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }    
    
}
