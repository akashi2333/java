package utils;

import java.sql.*;

public class DButils {
    private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=test";
    private String username = "sa";
    private String password = "20001009abcABC";
    private Connection conn = null;
    private Statement stmt = null;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void getConnect() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接数据库成功");
        } catch (SQLException throwables) {
            System.out.println("连接数据库失败");
            throwables.printStackTrace();
        }
    }

    //执行增删改的sql语句 
    public int doUpdate(String Sqls) {
        getConnect();
        int i = 0;
        try {
            stmt = conn.createStatement();
            i = stmt.executeUpdate(Sqls);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return i;
    }

    //只执行查询的sql语句
    public ResultSet doQuery(String Sqls) {
        getConnect();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(Sqls);
            if (rs.next()) {
                rs.beforeFirst();
                while (rs.next()) {
                    System.out.println(rs.getString("name")+"   "+rs.getString("password"));
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void getClose() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

}
