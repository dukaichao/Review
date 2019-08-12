package com.dkc.test_equals_hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/12
 * Time:14:03
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("dd",12);
        User user2 = new User("dd",12);
        System.out.println("user1的hash值为: " + user1.hashCode());
        System.out.println("user2的hash值为: " + user2.hashCode());
        Map<User,Integer> mp = new HashMap<>();
        mp.put(user1,1);
        mp.put(user2,2);
        System.out.println(mp.size());


    }
}
