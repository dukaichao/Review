package com.dkc.design_pattern_08_04.Simplefactorypattern;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/4
 * Time:15:04
 */
public class CarFactory {
    public static Car getCarType(String carName){
        if(carName.equals("五菱")){
            return new WuLing();
        }else if(carName.equals("宝马")){
            return new BaoMa();
        }else if(carName.equals("奔驰")){
            return new BenChi();
        }
        return null;
    }
}
