package com.dkc.reflex;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/17
 * Time:14:46
 */
public class User implements Serializable {
    private String name;

    public void say(String name){
        System.out.println(name+",你好!");
    }

    private void mmp(){
        System.out.println("你就是弟弟");
    }

    public static void mmp1(){
        System.out.println("mmp,nxp");
    }
}
