package cn.jsx.servlet;

import entity.User;
import test.jdbc.TestJDBC;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username1");
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;DatabaseName=test";
        String username = "sa";
        String password = "20001009abcABC";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String sql = "delete from lele where name = ?;";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ps.setString(1,name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
