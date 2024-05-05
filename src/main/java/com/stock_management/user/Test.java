/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock_management.user;


import com.stock_management.db.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import com.stock_management.appliance.ApplianceBean;
import com.stock_management.appliance.ApplianceDAO;
import com.stock_management.appliance.ApplianceIO;
import com.stock_management.gui.IMSFrame;

import java.io.File;
import java.sql.SQLException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.sql.Timestamp;
//import java.util.Calendar;
import java.util.HashMap;
//import java.util.List;
//import javax.swing.JOptionPane;

public class Test {
    
    Connection connection;
    
    public void UserTest() throws SQLException {
        UserBean a = new UserBean();
        a.setUserID(106481);
        a.setUserPWD("hellothere1".hashCode());
        a.setAdmin(false);
        a.setUserName("Ravi Yadav");
        a.setGender("Male");
        a.setdOB(Date.valueOf("1996-02-23"));
        a.setRegDate(Timestamp.valueOf("2019-12-15 16:20:02"));
        a.setCompany("Neprimo Inc.");
        a.setRecoveryCode("BDG2adAGG34fg5GH");
        
        UserBean b = new UserBean();
        b.setUserID(209841);
        b.setUserPWD("hellothere2".hashCode());
        b.setAdmin(false);
        b.setUserName("Ramina Kandel");
        b.setGender("Female");
        b.setdOB(Date.valueOf("1995-11-09"));
        b.setRegDate(Timestamp.valueOf("2019-11-23 14:05:11"));
        b.setCompany("Neprimo Inc.");
        b.setRecoveryCode("BGSC5fg3Gjk78FCB");
        
        UserBean c = new UserBean();
        c.setUserID(129850);
        c.setUserPWD("hellothere3".hashCode());
        c.setAdmin(false);
        c.setUserName("Garima Shrestha");
        c.setGender("Female");
        c.setdOB(Date.valueOf("1996-01-10"));
        c.setRegDate(Timestamp.valueOf("2020-02-17 16:26:45"));
        c.setCompany("Neprimo Inc.");
        c.setRecoveryCode("GBDS645Vgd5n7jdB");
        
        UserBean d = new UserBean();
        d.setUserID(100023);
        d.setUserPWD("admin".hashCode());
        d.setAdmin(true);
        d.setUserName("Bishal GC");
        d.setGender("Male");
        d.setdOB(Date.valueOf("1992-12-13"));
        d.setRegDate(Timestamp.valueOf("2018-11-06 11:56:09"));
        d.setCompany("Neprimo Inc.");
        d.setRecoveryCode("BNKKfj8gBSVfg4h4");
        
//        System.out.println(connection.toString());
        DAO user = new UserDAO(connection);
        
//        user.createUser(a);
//        System.out.println(user.createUser(b));
//        user.createUser(c);
//        user.createUser(d);

       user.getAllUsers().forEach(System.out::println);
//        System.out.println(user.getUser(129850));
//           System.out.println(user.deleteUser(209841));

    }
    
    public void ApplianceTest() throws Exception {
        ApplianceIO applianceIO = new ApplianceIO();
        SessionInfo si = new SessionInfo(100023, true, true, connection);
        ApplianceDAO applianceDAO = new ApplianceDAO(si);
        File f = new File("src\\main\\resources\\testExcel.xlsx");
        HashMap<Integer, ApplianceBean> appliances = applianceIO.importExcelFile(f);
        
        for (ApplianceBean a : appliances.values()) {
            System.out.println(applianceDAO.createAppliance(a));
        }
    }
    
    public static void main1(String[] args) throws SQLException, Exception{
        Test t = new Test();
        DBConnection db = new DBConnection();
        t.connection = db.getConnection();
//        t.UserTest();
//        t.ApplianceTest();
        SessionInfo si = new SessionInfo(100023, true, true, db.getConnection());
        UserSession su = new UserSession(si, "Neprimo Inc.", "Bishal GC");
        
        
        new IMSFrame(su).setVisible(true);
    }
}
