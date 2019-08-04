package com.dkc.design_pattern_08_04.abstractFactoryPattern;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:15:08
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        Client client = new Client();
        ProductFactory factory = new MacFactory();
        Computer mac = factory.getComputer();
        OperateSystem os = factory.getOS();
        client.buyComputer(mac);
        client.useSystem(os);
    }
}
