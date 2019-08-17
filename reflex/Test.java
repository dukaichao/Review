package com.dkc.reflex;

import java.lang.reflect.Method;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/17
 * Time:17:35
 */
public class Test {

    public void method3() throws ClassNotFoundException {
        //1.类名.class
        Class clz = User.class;

        //2.对象名.getClass()
        User user = new User();
        clz = user.getClass();

        //3.forName();
        clz = Class.forName("com.dkc.reflex.User");
    }

    public static void main(String[] args) throws Exception {
        Class clz = Class.forName("com.dkc.reflex.User");
        Object o = clz.newInstance();
        Method say = clz.getMethod("say", String.class);
        say.invoke(o,"弟弟");

        /*say = clz.getMethod("mmp");
        say.invoke(o);*/

        say = clz.getMethod("mmp1");
        say.invoke(o);

    }
}
