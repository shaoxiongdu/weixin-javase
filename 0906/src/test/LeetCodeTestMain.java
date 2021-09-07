/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

package test;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月06日 | 8:18
 * @description:
 */
public class LeetCodeTestMain {

    public static int search(int[] nums, int target) {

        if (nums.length < 0) return -1;

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            //中点
            int mind = (start + end) / 2;

            if (nums[mind] == target) {
                return mind;
            } else if (nums[mind] > target) {
                end = mind - 1;
            } else if (nums[mind] < target) {
                start = mind + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(search(new int[]{1, 2, 3, 4, 5, 6, 7}, 12));

    }


}
