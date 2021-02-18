package jdbctemplate;

import domain.classmates;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


/**
 * @author: Alivin Fer
 * @date: 2021/2/16 11:19
 **/

public class Demo02JdbcTemplate {

    // Junit 单元测试，可以让方法独立执行

    // 1. 获取 JdbcTemplate 对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 1. 修改 3 号数据的 English 为 80
     */
    @Test
    public void test1() {

        // 2. 定义 sql 语句
        String sql = "update classmates set English = 80 where id = ?";
        // 3. 执行 sql

        int count = template.update(sql, 1510300308);
        System.out.println(count);
    }

    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2() {
        String sql = "insert into classmates(id,name,sex) values(?,?,?)";
        int count = template.update(sql, 1510300009, "小白", "男");
        System.out.println(count);
    }

    /**
     * 3. 删除添加的记录
     */
    @Test
    public void test3() {
        String sql = "delete from classmates where id = ?";
        int count = template.update(sql, 1510300009);
        System.out.println(count);
    }

    /**
     * 4. 查询数据，并将其封装为 Map 集合
     * 注意：这个方法查询的结果集长度只能是 1
     */
    @Test
    public void test4() {
        String sql = "select * from classmates where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1510300305);
        System.out.println(map);
    }

    /**
     * 5. 查询所有的记录，将其封装为 List
     */
    @Test
    public void test5() {
        String sql = "select * from classmates";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map map:list) {
            System.out.println(map);
        }
    }

    /**
     * 6. 查询所有记录，将其封装为 classmates 对象的 List 集合
     */
    @Test
    public void test6() {
        String sql = "select * from classmates";
        // 常规操作
        /*List<classmates> list = template.query(sql, new RowMapper<classmates>() {

            @Override
            public classmates mapRow(ResultSet rs, int i) throws SQLException {
                classmates cls = new classmates();
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                float English = rs.getFloat("English");
                float Math = rs.getFloat("Math");

                cls.setId(id);
                cls.setAge(age);
                cls.setName(name);
                cls.setSex(sex);
                cls.setAddress(address);
                cls.setEnglish(English);
                cls.setMath(Math);


                return cls;
            }
        });

        for (classmates cls: list) {
            System.out.println(cls);
        }*/

        // 使用 BeanPropertyRowMapper
        List<classmates> list = template.query(sql, new BeanPropertyRowMapper<classmates>(classmates.class));
        for (classmates cls : list) {
            System.out.println(cls);
        }
    }

    /**
     * 7. 查询总记录数
     */
    @Test
    public void test7() {
        String sql = "select count(id) from classmates";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }

}
