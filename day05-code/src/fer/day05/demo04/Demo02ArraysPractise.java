package fer.day05.demo04;

import java.util.Arrays;

/**
 * @author: Alivin Fer
 * @date: 2020/10/25 16:21
 *
 * 使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 **/

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "acnishfkawqepokliutqrwcv";
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        
        // 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}
