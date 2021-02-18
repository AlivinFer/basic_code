package fer.day25.demo02druid;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: Alivin Fer
 * @date: 2021/2/15 9:41
 **/

/*
    使用新的工具类
 */

public class Demo02druid {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        /*
            完成添加操作，给 user 表添加一条记录
         */
        try {
            // 1. 获取连接
            conn = JDBCUtils.getConnection();
            // 2. 定义 sql
            String sql = "insert into user values(null,?,?)";
            // 3. 获取 pstmt 对象
            pstmt = conn.prepareStatement(sql);
            // 4. 给 ? 赋值
            pstmt.setString(1, "ff");
            pstmt.setString(2, "888");
            // 5. 执行 sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
             // 6. 释放资源
            JDBCUtils.close(pstmt, conn);
        }
    }
}
