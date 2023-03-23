package smallgroup;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static smallgroup.jdbcutil1.close;
import static smallgroup.jdbcutil1.getconn;

public class jdbc {
    public static void main(String[] args) throws Exception {
        Connection conn = getconn();
        String sql="update god set price=100 where id = 10";
        Statement statement = conn.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        close(statement,conn);
    }
}