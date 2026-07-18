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
public enum ThemeStyles {
    DEFAUT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new DefautFactory());
            ThemeManager.updateTheme(scene);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new DarkFactory());
            ThemeManager.updateTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new LightFactory());
            ThemeManager.updateTheme(scene);
        }
    };
    
    public abstract void updateTheme(Scene scene);
}
