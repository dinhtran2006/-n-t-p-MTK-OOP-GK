/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.untils.services;

import com.tcd.quizapp1.ontapquizapp.App;

/**
 *
 * @author CongDinh
 */
public class LightFactory extends ThemeAbstractFactory {

    @Override
    public String getStyleSheet() {
        return App.class.getResource("/com/tcd/css/light.css").toExternalForm();
    }
}
