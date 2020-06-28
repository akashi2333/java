package test.jdbc;

import entity.User;

import java.sql.*;

public class TestJDBC {
    public static void add(User us) throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=test";
        String username = "sa";
        String password = "20001009abcABC";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        String sql = "insert into lele values('"+us.getName()+"','"+us.getPassword()+"')";
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        con.close();
    }
}
