# basic_code
## Java Study

1. 面向对象
2. 接口
3. 容器
4. 异常
5. 泛型
6. 反射
7. 注解
8. I/O
9. Junit
10. mysql
11. 数据库连接池
    - c3p0
    - druid
12. Spring JDBC

## 基础语法-对应代码工程

- day01-code
  - demo01
    - psvm 快速生成主函数
  - demo02
    - 不运行任何魔法值（即未经定义的常量）直接出现在代码中
    - 基本方法调用
    - 有参和无参方法调用
    - void 方法基本使用
  - demo03
    - 方法重载（Overload）使用
- day02-code
  - demo01
    - 创建数组的几种方式
  - demo02
    - 访问数组几种方式
    - 数组遍历
    - 注意问题
      - 数组越界（ArrayIndexOutOfBoundsException）
      - 空指针（NullPointerException）
  - demo03
    - 数组传参&作为返回值
- day03-code
  - demo01
    - 对象
    - 面向对象和面向过程
    - 对象的创建和使用
      - 成员变量
      - 成员方法
  - demo02
    - 对象属性赋值
    - 使用对象类型作为方法参数
    - 使用对象类型作为方法的返回值
  - demo03
    - 局部变量和成员变量
    - 封装、继承、多态
    - Setter/Getter
  - demo04
    - this 的使用
    - 构造方法
  - demo05
    - 如何创建一个标准的类
- day04-code
  - demo01
    - 键盘输入Scanner 使用
    - 键盘输入三个值，求最大值
  - demo02
    - 匿名对象
  - demo03
    - Random 类
    - 模拟猜数字小游戏
  - demo04
    - 数组
    - ArrayList
- day05-code
  - demo01
    - String 类
    - 字符串常量池
  - demo02
    - 字符串比较 == 和 equals
    - String 常用方法
  - demo03
    - static 关键字
  - demo04
    - Arrays 工具类方法
- day06-code
  - demo01
    - 继承
  - demo02
    - 父类与自类变量同名处理
    - 重写
  - demo03
    - 重写和重载
  - demo04
    - 父类与子类
  - demo05
    - 继承原则
  - demo06
    - 父类和子类构造方法
  - demo07
    - super 用法
  - demo08
    - this 用法
  - demo09
    - 继承注意点
  - demo10
    - 抽象类
  - demo11
    - 案例实现
- day07-code
  - demo01
    - 接口
  - demo02
    - 抽象类和接口
  - demo03
    - 接口与接口多继承
- day08-code
  - demo01
    - 多态
  - demo02
    - 对象向上向下转型
  - demo03
    - 实现案例

## 学习中遇到的一些问题

- [x] git 报错【10054】 **OpenSSL SSL_read: Connection was reset, errno 10054**

  git 提交或更新代码报错，修改设置 ssl 验证为 false

  ```shell
  git config --global http.sslVerify "false"
  ```
