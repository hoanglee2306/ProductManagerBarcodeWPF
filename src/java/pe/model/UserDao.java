/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.utils.DbUtils;

/**
 *
 * @author Computing Fundamental - HCM Campus
 */
public class UserDao {
    
 private static final String LOGIN = "SELECT * FROM tblUsers WHERE userID = ? AND password = ?";
public UserDto login(String userID, String password) throws SQLException {
    UserDto user = null;
    Connection conn = null;
    PreparedStatement ptm = null;
    ResultSet rs = null;
    try {
        conn = DbUtils.getConnection();
        if (conn != null) {
            ptm = conn.prepareStatement(LOGIN);
            ptm.setString(1, userID.trim());  // Xóa khoảng trắng
            ptm.setString(2, password.trim());  // Xóa khoảng trắng
            rs = ptm.executeQuery();
            if (rs.next()) {
                user = new UserDto();
                user.setUserID(rs.getString("userID"));
                user.setFullName(rs.getString("fullName"));
                user.setRoleID(rs.getString("roleID"));
                user.setPassword(rs.getString("password"));
                System.out.println("Login successful: " + userID);
            } else {
                System.out.println("No user found for: " + userID);
            }
        } else {
            System.out.println("Database connection is null");
        }
    } catch (Exception e) {
        System.out.println("Login error: " + e.getMessage());
        e.printStackTrace();  // In stack trace
    } finally {
        if (rs != null) rs.close();
        if (ptm != null) ptm.close();
        if (conn != null) conn.close();
    }
    return user;
}
}
