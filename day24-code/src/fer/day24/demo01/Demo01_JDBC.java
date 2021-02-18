package fer.day24.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author: Alivin Fer
 * @date: 2021/1/31 14:48
 **/
public class Demo01_JDBC {
    public static void main(String[] args) throws Exception {
        // 1. 导入驱动 jar 包
        // 2. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 3. 获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
        // 4. 定义 sql
        String sql = "update stu set age = 22 where id = 1";
        // 5. 获取执行 sql 的对象 statement
        Statement stmt = conn.createStatement();
        // 6. 执行 sql
        int temp = stmt.executeUpdate(sql);
        // 7. 处理结果
        System.out.println(temp);  // 返回 1 表示改变成功
        // 8. 释放资源
        stmt.close();
        conn.close();


    }
}
