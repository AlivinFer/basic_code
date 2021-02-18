package fer.day24.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author: Alivin Fer
 * @date: 2021/2/4 16:05
 **/

/*
    JDBC 工具类
 */
public class JDBCUtils {

    /**
     * 获取连接
     * @return 连接对象
     */
    /*public static Connection getConnection(String url, String user, String password) throws SQLException {  // 静态方法更容易调用
        return DriverManager.getConnection(url, user, password);
    }*/
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // 文件的读取，只需要读取一次即可拿到这些值。使用静态代码块
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    static {
        // 读取资源文件，获取值
        try {
            // 1. 创建 Properties 集合类
            Properties pro = new Properties();

            // 获取 src 路径下的文件的方式 ---> ClassLoader 类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URL res = classLoader.getResource("jdbc.properties");
            String path = null; // 将 url 转换为 路径
            if (res != null) {
                path = res.getPath();
            }
            // System.out.println(path);
            // 2. 加载文件
            // pro.load(new FileReader("E:\\IntelliJ IDEA Community Edition 2019.1.3\\basic_code\\day24-code\\src\\jdbc.properties"));
            if (path != null) {
                pro.load(new FileReader(path));
            }
            // 3. 获取数据，赋值
            url = pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver = pro.getProperty("driver");
            // 4. 注册驱动
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放资源的方法
     * @param stat
     * @param conn
     */
    public static void close(Statement stat, Connection conn) {
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
}
