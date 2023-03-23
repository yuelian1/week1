package smallgroup;



import java.sql.*;
import java.util.Properties;



public class jdbcutil1 {
    public static final String driver ="com.mysql.jdbc.Driver";
    public static final String name = "root";
    public static final String url = "jdbc:mysql://localhost:3306/db-01?useSSL=false&serverTimezone=UTC";
    public static final String password = "123456";

    //加载驱动
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("加载驱动出现问题");
        }
    }

    //结束
    public static void close(Statement sm, Connection conn) throws SQLException {
        //if (rs!=null) rs.close();
        if (sm!=null) sm.close();
        if (conn!=null) conn.close();
    }
    //连接
    public static Connection getconn() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }
}
