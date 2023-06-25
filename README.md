# basic_code
## Java Study

1. 基础语法
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
2. 面向对象
3. 接口
4. 容器
5. 异常
6. 泛型
7. 反射
8. 注解
9. I/O
10. Junit
11. mysql
12. 数据库连接池
    - c3p0
    - druid
13. Spring JDBC

## 学习中遇到的一些问题

- [ ] git 报错【10054】 **OpenSSL SSL_read: Connection was reset, errno 10054**

  git 提交或更新代码报错，修改设置接触 ssl 验证

  ```shell
  git config --global http.sslVerify "false"
  ```

- [ ] 