package fer.day24.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: Alivin Fer
 * @date: 2021/2/1 12:51
 **/

/*
    完整规范 JDBC 操作
 */

public class Demo02_JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        // 1. 注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 创建 SQL 语句
            String sql = "insert into stu values(3, '王五', 25, 90, null, null)";
            // 3. 创建数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
            // 4. 获取执行 SQL 的对象 statement
            stat = conn.createStatement();
            // 5. 执行 SQL
            int count = stat.executeUpdate(sql);
            // 6. 处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功!");
            }else {
                System.out.println("添加失败!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 7. 释放资源
            // 避免空指针异常
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
