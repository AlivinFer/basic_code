package jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import utils.JDBCUtils;

/**
 * @author: Alivin Fer
 * @date: 2021/2/15 20:17
 **/

/*
    Demo02JdbcTemplate 入门
 */

public class Demo01JdbcTemplate {
    public static void main(String[] args) {
        // 1. 导入 jar 包
        // 2. 创建 Demo02JdbcTemplate 对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 3. 调用方法
        String sql = "update user set password = 555 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
