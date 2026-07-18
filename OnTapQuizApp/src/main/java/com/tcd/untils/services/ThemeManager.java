/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.untils.services;

import javafx.scene.Scene;

/**
 *
 * @author CongDinh
 */
public class ThemeManager {

    private static ThemeAbstractFactory factory = new DefautFactory();

    public static void setFactory(ThemeAbstractFactory f) {
        factory = f;
    }

    public static void updateTheme(Scene scene) {
        scene.getRoot().getStylesheets().clear();
        scene.getRoot().getStylesheets().add(factory.getStyleSheet());
    }

}
