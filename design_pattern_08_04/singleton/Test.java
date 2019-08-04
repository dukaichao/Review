package com.dkc.design_pattern_08_04.singleton;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:11:53
 */
public class Test implements Runnable{
    @Override
    public void run() {
        System.out.println(SingletonPattern5.getInstance());
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();
        new Thread(new Test()).start();

    }
}
