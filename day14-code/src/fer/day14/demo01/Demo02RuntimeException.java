package fer.day14.demo01;

/**
 * @author: Alivin Fer
 * @date: 2020/12/3 20:50
 **/

// 运行期异常
public class Demo02RuntimeException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);
        try {
            // 可能出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e) {
            // 异常的处理逻辑
            System.out.println(e);
        }
        System.out.println("loading....");
    }
}
