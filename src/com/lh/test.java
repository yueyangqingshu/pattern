package com.lh;

import com.lh.algorithm.twoSumCode;

import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
       int [] arr={2,7,11,13,15};

        int[] ints = twoSumCode.twoSum(arr, 15);

        PrimitiveIterator.OfInt iterator1 = Arrays.stream(ints).iterator();
        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            System.out.println("next"+next);
        }

    }
}
