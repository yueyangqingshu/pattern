package com.lh.algorithm;

import java.util.HashMap;

public class twoSumCode {

//    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两整数，并返回它们的数组下标。
//
//    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//    你可以按任意顺序返回答案。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/two-sum
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

    public static int[] twoSum(int[] nums, int target) {

        int[] indexs = new int[2];
        //k-v
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;

            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target - nums[i], i);
        }
        return indexs;
    }
}
