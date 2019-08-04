package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:懒汉式（线程安全，同步代码块）[不可用]
 *
 * 由于第四种实现方式同步效率太低，所以摒弃同步方法，改为同步产生实例化的的代码块。但是这种同步并不能起到线程同步的
 * 作用。跟第3种实现方式遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。
 *
 * User:Mr.Du
 * Date:2019/8/4
 * Time:12:18
 */
public class SingletonPattern5 {
    private static SingletonPattern5 singletonPattern5;
    private SingletonPattern5(){}
    public static SingletonPattern5 getInstance(){
        if(singletonPattern5 == null){
            synchronized (SingletonPattern5.class){
                singletonPattern5 = new SingletonPattern5();
            }
        }
        return singletonPattern5;
    }


}
