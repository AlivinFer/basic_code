package fer.day14.demo04;

import fer.day14.demo03.RegisterRuntimeException;

import java.util.Scanner;

/**
 * @author: Alivin Fer
 * @date: 2020/12/5 17:46
 **/

/*
    自定义异常类
    要求：
        模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已存在
    分析：
        1. 使用数组保存已经注册过的用户名(数据库)
        2. 使用Scanner获取用户输入的注册的用户名(前端，页面)
        3. 定义一个方法，对用户输入的注册用户名进行判断
            遍历已经注册存储过的用户名的数组，获取每一个用户名
            使用获取到的用户名输入的用户名比较
                true：
                    用户名已经存在，抛出 RegisterException 异常，告知用户：亲，该用户名已存在
                false：
                    继续遍历比较
            如果循环结束了，还没有找到重复的用户名，提示用户 "恭喜您，注册成功"
 */
public class Demo02RegisterException {
    // 1.使用数组保存已经注册过的用户名(数据库)
    static String[] usernames = {"小郭", "黑猪", "阿松"};
    public static void main(String[] args) /*throws RegisterException*/ {
        // 2. 使用 Scanner 获取用户输入的注册用户名(前端，页面)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);

    }

    // 3. 定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsername(String username) /*throws RegisterException*/ {
        // 遍历已经注册过的用户名数组，获取每一个用户名
        for (String name : usernames) {
            if (name.equals(username)) {
                // 运行期异常无需处理
                throw new RegisterRuntimeException("该用户已经被注册");
            }
        }
        System.out.println("恭喜您，注册成功");
    }
}
