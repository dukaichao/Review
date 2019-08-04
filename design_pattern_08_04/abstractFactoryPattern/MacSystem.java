package com.dkc.design_pattern_08_04.abstractFactoryPattern;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:15:11
 */
public class MacSystem implements OperateSystem {
    @Override
    public void system() {
        System.out.println("苹果流畅度高");
    }
}
