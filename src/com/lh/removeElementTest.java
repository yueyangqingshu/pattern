package com.lh;

import com.lh.algorithm.removeElement;

public class removeElementTest {
    public static void main(String[] args) {
        removeElement removeElement = new removeElement();
        int[] nums = {3, 2, 2, 9,7,2};
        int i = removeElement.removeElement(nums, 2);
        System.out.println(i);
        System.out.println("修改测试");
    }
}
