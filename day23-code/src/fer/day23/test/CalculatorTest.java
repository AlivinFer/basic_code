package fer.day23.test;

import fer.day23.demo02.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: Alivin Fer
 * @date: 2021/1/7 20:02
 **/
public class CalculatorTest {
    /*
        初始化方法
        用于资源申请，所以测试在执行之前都会先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }
    /*
        释放资源方法
        在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close() {
        System.out.println("close...");
    }

    // 测试 add 方法
    @Test
    public void testAdd() {
        // System.out.println("我被执行了");
        // 1. 创建计算器对象
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        // 2. 调用 add 方法
        int result = c.add(1, 2);
        // System.out.println(result);
        // 3. 添加断言，判断方法返回的是否是我们想要的结果
        Assert.assertEquals(3, result);
    }

}
