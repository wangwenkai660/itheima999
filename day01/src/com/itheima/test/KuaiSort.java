package com.itheima.test;

import java.util.Arrays;

/*快速排序之双边循坏法*/
public class KuaiSort {
    public static void main(String[] args) {
        int[] arr = {4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /*双边循坏法
    * arr:待交换的数组
    * startIndex:起始下标
    * endIndex:结束下标
    * */
    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        //递归结束条件:startIndex大于等于endIndex时
        if (startIndex >= endIndex) {
            return;
        }

        //得到基准元素位置
        int pivotIndex = partition(arr, startIndex, endIndex);

        //根据基准元素,分成两部分进行递归排序
        quickSort(arr,startIndex,pivotIndex-1);
        quickSort(arr,pivotIndex+1,endIndex);

    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        //取第一个位置的元素作为基准元素
        int pivot = arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left != right) {

            //控制right指针比较并左移
            while (left < right &&arr[right]>pivot){
                right--;

            }
            //控制left指针比较并右移
            while (left < right &&arr[left]<=pivot){
                left++;

            }
            //交换left和rihgt指针所指向的元素
            if (left<right) {
                int p = arr[left];
                arr[left] = arr[right];
                arr[right] = p;
            }


        }
        //pivot与指针重合点交换位置
        arr[startIndex] = arr[left];
        arr[left] = pivot;
        return left;


    }
}
