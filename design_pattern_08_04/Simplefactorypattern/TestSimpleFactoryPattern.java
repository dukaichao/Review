package com.dkc.design_pattern_08_04.Simplefactorypattern;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:14:47
 */
public class TestSimpleFactoryPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要买的车：Thanks");
        String carName;
        while(!(carName = sc.nextLine()).equals("end")){
            Car car = CarFactory.getCarType(carName);
            if(car == null) {
                System.out.println("本车行木有你要的车，请重新输入要买的车：Thanks");
                continue;
            }
            car.buyCar();
            System.out.println("请输入要买的车：Thanks");
        }
    }
}

