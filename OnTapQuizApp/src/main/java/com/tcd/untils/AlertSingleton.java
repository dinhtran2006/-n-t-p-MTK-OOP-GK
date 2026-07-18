/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.untils;

import javafx.scene.control.Alert;

/**
 *
 * @author CongDinh
 */
public class AlertSingleton {
    private static AlertSingleton instance;
    private final Alert alert;
    
    private AlertSingleton() {
        this.alert = new Alert(Alert.AlertType.INFORMATION);
        this.alert.setTitle("English Quiz");
        this.alert.setHeaderText("Announcement");
    }
    
    public static AlertSingleton getAlert() {
        if(instance == null)
            instance = new AlertSingleton();
        
        return instance;
    }
    
    public void showMsg(String content) {
        this.alert.setContentText(content);
        this.alert.show();
    }
}
