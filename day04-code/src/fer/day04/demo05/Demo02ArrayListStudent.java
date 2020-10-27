package fer.day04.demo05;

import java.util.ArrayList;

/**
 * @author: Alivin Fer
 * @date: 2020/10/16 19:14
 **/

/*
自定义 4 个学生对象，添加到集合，并遍历
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("诺手", 18);
        Student two = new Student("鳄鱼", 19);
        Student three = new Student("武器", 20);
        Student four = new Student("船长", 21);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
    }

}
