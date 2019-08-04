package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:单例饿汉静态代码块
 *
 * 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静
 * 态代码块中的代码，初始化类的实例。
 * 优缺点和单例饿汉是一样的。
 * User:Mr.Du
 * Date:2019/8/4
 * Time:12:10
 */
public class SingletonPattern3 {

    private static SingletonPattern3 singletonPattern3;
    static{
        singletonPattern3 = new SingletonPattern3();
    }
    private SingletonPattern3(){}
    public static SingletonPattern3 getInstance(){
        return singletonPattern3;
    }


}
