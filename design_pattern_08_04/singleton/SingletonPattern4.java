package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:懒汉式（线程安全，同步方法，不建议使用）
 *
 *
 * 解决上面第三种实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
 *
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行
 * 一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 * User:Mr.Du
 * Date:2019/8/4
 * Time:12:14
 */
public class SingletonPattern4 {
    private static SingletonPattern4 singletonPattern4;
    private SingletonPattern4(){}
    public static synchronized SingletonPattern4 getInstance(){
        if(singletonPattern4 == null)
            singletonPattern4 = new SingletonPattern4();
        return singletonPattern4;
    }


}
