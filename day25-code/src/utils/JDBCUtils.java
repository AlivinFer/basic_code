package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @author: Alivin Fer
 * @date: 2021/2/15 9:04
 **/

/*
    druid 工具类
 */
public class JDBCUtils {
    // 1. 定义成员变量 DataSource
    private static DataSource ds;

    static {
        // 加载配置文件
        Properties pro = new Properties();
        try {
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取 DataSource
        try {
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /*
        释放资源
     */
    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs, Statement stat, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stat != null) {
            try {
                stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /*
        获取连接池方法
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
