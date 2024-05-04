/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock_management;

import com.stock_management.gui.DBConfig;
import com.stock_management.gui.IMSFrame;
import com.stock_management.user.SessionInfo;
import com.stock_management.user.UserSession;

import java.sql.Connection;

public class Main {
    
    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void runIMSFrame() throws Exception {
        SessionInfo si = new SessionInfo(100023, true, true, connection);
        UserSession su = new UserSession(si, "Stock Management System", "Admin");
        new IMSFrame(su).setVisible(true);
    }

    public static void main(String args[]) throws Exception {            
        Main main = new Main();
        DBConfig dbConfig = new DBConfig(main);
        dbConfig.runFrame();
    }
    
}
