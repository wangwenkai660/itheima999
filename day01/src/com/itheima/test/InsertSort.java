package com.itheima.test;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {

        int[] list = {5, 6, 4, 1, 2};
         int[]array=insertSort(list);
        System.out.println(Arrays.toString(array));

    }

    /*public static void insertSort(int[] list) {

        // 第1个数肯定是有序的，从第2个数开始遍历，依次插入有序序列
        for (int i = 1; i < list.length; i++) {
            int j = 0;
            int temp = list[i]; // 取出第i个数，和前i-1个数比较后，插入合适位置

            // 因为前i-1个数都是从小到大的有序序列，所以只要当前比较的数(list[j])比temp大，就把这个数后移一位
            for (j = i - 1; j >= 0 && temp < list[j]; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = temp;


        }
    }*/
    /**
     * 插入排序法<br>
     * <font color="red">时间复杂度: n²</font>
     * @param array
     * @return
     */
    public static int[] insertSort(int[] array){

        //直接插入排序
        //在排序之前我们需要搞清一个思路，新插入一个数据的时候，排序过后的数组都是
        //从小到大排列好的，所以我们需要从后往前查找，直到找到比我们要插入的数字还小的
        //值。这个时候我们需要一个变量j作为标识
        for(int i = 1;i<array.length;i++){
            int temp = array[i];
            int j;
            for(j = i-1;j>=0;j--){
                //将大于temp的数向后移动一步
                if(array[j]>temp){
                    array[j+1] = array[j];//记录j的值也就是temp要插入的位置
                }else{
                    break;
                }
            }
            array[j+1] = temp;
        }


        return array;
    }
}
