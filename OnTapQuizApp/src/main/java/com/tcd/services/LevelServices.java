/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcd.services;

import com.tcd.pojo.Category;
import com.tcd.pojo.Level;
import com.tcd.untils.ConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CongDinh
 */
public class LevelServices {
    public List<Level> getLevel() throws SQLException {
        Connection conn = ConnectionSingleton.getCon().connect();
        
        String sql = "SELECT * FROM level";
        
        PreparedStatement stm = conn.prepareCall(sql);
        ResultSet rs = stm.executeQuery();
        
        List<Level> level = new ArrayList<>();
        
        while(rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            
            level.add(new Level(id, name));
        }
        
        return level;
    }
}
