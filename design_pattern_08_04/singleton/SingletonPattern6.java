package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:.懒汉式（双重检查）[推荐用]
 *
 * Double-Check概念对于多线程开发者来说不会陌生，如代码中所示，我们进行了两次if (singleton == null)检查，
 * 这样就可以保证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，
 * 直接return实例化对象。
 *
 * 优点：线程安全；延迟加载；效率较高。
 *
 * User:Mr.Du
 * Date:2019/8/4
 * Time:12:21
 */
public class SingletonPattern6 {
    private static SingletonPattern6 singletonPattern6;
    private SingletonPattern6(){}
    public static SingletonPattern6 getInstance(){
        if(singletonPattern6 == null){
            synchronized (SingletonPattern5.class){
                if(singletonPattern6 == null)
                    singletonPattern6 = new SingletonPattern6();
            }
        }
        return singletonPattern6;
    }

}
