package com.dkc.design_pattern_08_04.abstractFactoryPattern;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:15:23
 */
public class SurFactory implements ProductFactory {
    @Override
    public Computer getComputer() {
        return new Sur();
    }

    @Override
    public OperateSystem getOS() {
        return new SurSystem();
    }
}
