package com.dkc.design_pattern_08_04.abstractFactoryPattern;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:15:24
 */
public class Client {

    public void buyComputer(Computer computer){
        computer.computer();
    }

    public void useSystem(OperateSystem sys){
        sys.system();
    }
}
