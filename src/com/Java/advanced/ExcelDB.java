package com.Java.advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcelDB {

    public static Connection getConnection() throws Exception {
    String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    String url = "jdbc:odbc:excelDB";
    String username = "yourName";
    String password = "yourPass";
    Class.forName(driver);
    return DriverManager.getConnection(url, username, password);
    
}

public static void main(String args[]) throws Exception {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    //conn = getConnection();
    
    //Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
    conn = DriverManager.getConnection("jdbc:odbc:;Driver={Microsoft Excel Driver(*.xlsx)};DBQ=D://Test.xlsx");
    stmt = conn.createStatement();
    String excelQuery = "select * from [Sheet1$]";
    rs = stmt.executeQuery(excelQuery);

    while (rs.next()) {
      System.out.println(rs.getString(0));
    }

    rs.close();
    stmt.close();
    conn.close();
  }
}