package fer.day25.demo01c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author: Alivin Fer
 * @date: 2021/2/14 9:04
 **/

public class Demo02c3p0 {
    public static void main(String[] args) throws SQLException {
        // 不传参数，使用默认的
        // DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        // 获取连接（超过连接池数量回报错）
        for (int i = 0; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);
        }
    }
}
