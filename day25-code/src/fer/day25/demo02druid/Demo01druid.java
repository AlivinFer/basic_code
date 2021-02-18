package fer.day25.demo02druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;


/**
 * @author: Alivin Fer
 * @date: 2021/2/14 11:08
 **/

public class Demo01druid {
    public static void main(String[] args) throws Exception {
        // 1. 导入 jar 包
        // 2. 定义配置文件

        // 3. 加载配置文件
        Properties pro = new Properties();
        InputStream is = Demo01druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        // 4. 获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        // 5. 获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
