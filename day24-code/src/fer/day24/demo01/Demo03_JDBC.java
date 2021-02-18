package fer.day24.demo01;

import java.sql.*;

/**
 * @author: Alivin Fer
 * @date: 2021/2/1 12:51
 **/

/*
    JDBC 查询操作操作
 */

public class Demo03_JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        // 1. 注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 创建 SQL 语句
            String sql = "select * from test";
            // 3. 创建数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "123456");
            // 4. 获取执行 SQL 的对象 statement
            stat = conn.createStatement();
            // 5. 执行 SQL
            rs = stat.executeQuery(sql);
            // 6. 处理结果
            // 6.1 获取数据
            rs.next();
            int id1 = rs.getInt(1);
            String name1 = rs.getString("name");
            System.out.println(id1 + "--" + name1);

            // 6.2 获取数据
            rs.next();
            int id2 = rs.getInt(1);
            String name2 = rs.getString("name");
            System.out.println(id2 + "--" + name2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 7. 释放资源
            // 避免空指针异常
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(stat != null) {
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
