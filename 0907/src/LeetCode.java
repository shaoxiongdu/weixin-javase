/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

import java.util.Objects;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月07日 | 8:05
 * @description: 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
 * <p>
 * 给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * <p>
 * 注意：分割得到的每个字符串都必须是平衡字符串。
 * <p>
 * 返回可以通过分割得到的平衡字符串的 最大数量 。
 */
public class LeetCode {

    public static void main(String[] args) {

        System.out.println(balancedStringSplit("RLLLLRRRLR"));

    }


    public static int balancedStringSplit(String s) {

        //临界判断
        if (Objects.isNull(s) || s.trim().length() <= 1) return 0;

        int count = 0, balance = 0;
        //迭代字符串
        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) == 'R' ? balance++ : balance--) == 0) count++;

        }
        //返回累加值
        return count;

    }

}
