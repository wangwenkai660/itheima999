package com.itheima.test;


import java.util.Arrays;

/*冒泡排序 相邻元素比较
* 第一轮 最大数肯定在最后*/
public class paixu {
    public static void main(String[] args) {
        int[] array = {5, 8, 6, 3, 9, 2, 1, 7};
        sorts(array);
        System.out.println(Arrays.toString(array));

    }

    private static void sorts(int[] array) {
        for (int i = 0; i < array.length-1; i++) {//外层控制轮数 轮数=长度-1次
            for (int j = 0; j < array.length-1-i; j++) {//内层开始两两比较
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;

                }

            }


        }


    }

}
