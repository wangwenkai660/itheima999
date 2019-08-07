package com.itheima.test;


import java.util.Arrays;

/*选择排序 依次选中每个元素不动,其他元素来比较
* 数组长度为n,需要n-1轮
* 每一轮选中一个元素*/
public class ChoosePaixu {
    public static void main(String[] args) {
        int[] array = {5, 8, 6, 3, 9, 2, 1, 7};
        sorts(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sorts(int[] array) {
        for (int i = 0; i < array.length-1; i++) {//外层控制轮数 轮数=长度-1次
            for (int j = i+1; j < array.length; j++) {//内层从i后面依次取出元素和i比较
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j ] = temp;

                }

            }


        }


    }

}