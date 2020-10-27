package fer.day03.demo03;

/**
 * @author: Alivin Fer
 * @date: 2020/10/12 20:44
 **/

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("尤尤");
        stu.setAge(23);
        stu.setMale(false);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是男生：" + stu.isMale());

    }
}
