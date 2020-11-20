package fer.day11.demo04;

/**
 * @author: Alivin Fer
 * @date: 2020/11/18 21:09
 **/

public class Demo02UseGenericClass {

    public static void main(String[] args) {

        GenericClass<Integer> gc = new GenericClass<>();
        GenericClass<String> gc1 = new GenericClass<>();
        gc.setAge(18);
        gc1.setName("尤尤");

        Integer age = gc.getAge();
        System.out.println(age);

        String name = gc1.getName();
        System.out.println(name);


    }
}
