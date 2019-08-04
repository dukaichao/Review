package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:单例懒汉式
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化，避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 *
 * User:Mr.Du
 * Date:2019/8/4
 * Time:11:38
 */
public class SingletonPattern1 {
    //1.懒汉式
    private static final SingletonPattern1 singletonPattern = new SingletonPattern1();
    private SingletonPattern1(){};
    public static SingletonPattern1 getInstance(){
        return singletonPattern;
    }

    public static void main(String[] args) {
        System.out.println(new SingletonPattern1().getClass().getClassLoader());
        System.out.println(new SingletonPattern1().getClass().getClassLoader());
    }
}
