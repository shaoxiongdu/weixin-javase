/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

package test;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月07日 | 9:43
 * @description:
 */
public class User {

    private String name = name();

    public User() {
        System.out.println(2);
    }

    private String name() {
        System.out.println(1);
        return "1";
    }
}
