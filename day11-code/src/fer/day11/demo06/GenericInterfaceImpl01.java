package fer.day11.demo06;

/**
 * @author: Alivin Fer
 * @date: 2020/11/20 20:10
 **/

/*
    含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就使用什么泛型
    就相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
实例：
    public interface List<E> {
        boolean add(E e);
        E get(int index);
    }
    public class ArrayList<E> implements List<E> {
        public boolean add(E e) {}
        public E get(int index) {}
    }
 */
public class GenericInterfaceImpl01<I> implements GenericInterface<I> {

    @Override
    public void method(I s) {
        System.out.println(s);
    }
}
