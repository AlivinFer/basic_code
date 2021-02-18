package fer.day24.demo02;

import fer.day24.util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2021/2/7 10:19
 **/

/*
    需求：
        1. 通过键盘录入用户名和密码
        2. 判断用户是否登录成功
 */
public class Demo01 {

    public static void main(String[] args) {
        // 1. 键盘录入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        // 2. 调用方法
        boolean flag = new Demo01().login(username, password);
        // 3. 判断结果，输出不同语句
        if (flag) {
            System.out.println("登录成功！");
        }else {
            System.out.println("用户名或密码错误！");
        }
    }


    /**
     *
     * @param username：用户名
     * @param password：密码
     * @return：是否登录成功
     */
    public boolean login(String username, String password) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }
        // 连接数据库是否登录成功
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            /*if (rs.next()) {
                return true;
            }else {
                return false;
            }*/
            // 如果有下一行
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stat, conn);
        }

        return false;
    }
}
