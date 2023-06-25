package fer.day03.Demo05;

/**
 * @author: Alivin Fer
 * @date: 2020/10/13 21:02
 **/

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("尤尤");
        stu1.setAge(23);
        System.out.println("姓名：" + stu1.getName() + ", 年龄：" + stu1.getAge());
        System.out.println("=========");

        // 全参构造
        Student stu2 = new Student("能年", 27);

        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());

        // 如果需要改变对象当中的成员变量数据内容，仍然需要使用 setXXX 方法
        stu2.setAge(28);
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());

    }
}
