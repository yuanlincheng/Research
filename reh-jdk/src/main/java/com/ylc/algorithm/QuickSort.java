package com.ylc.algorithm;

import java.util.Arrays;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/4/9 19:55
 * @description: xxx
 * own: Aratek
 */
public class QuickSort {

    /**
     *
     * @param arr 源数组
     * @param lower 开始坐标
     * @param high 终点坐标
     * @return void
     */
    protected static void sort(int arr[], int lower, int high) {
        //校验
        if (lower > high) {
            return;
        }
        //初始化变量
        // 固定切分，设置基准值为数组的首个元素
        int i = lower, j = high, key = arr[lower];
        //从数组的两端交替进行扫描，第一轮排序
        while (i < j) {
            //从后往前扫描
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                //交换高低位的元素,并同时跳过已确定大小位的扫描
                arr[i++] = arr[j];
            }
            //从前往后扫描
            while (i < j && arr[i] < key) {
                i++;
            }
            if (i < j) {
                //交换高低位的元素,并同时跳过已确定大小位的扫描
                arr[j--] = arr[i];
            }
        }
        //将基准元素定位的最后的坐标i处
        arr[i] = key;
        //递归进行排序
        sort(arr,lower,i-1);
        sort(arr,i+1,high);
    }

    protected static void quickSort(int arr[]) {
        sort(arr,0,arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,6,4,1,9,12,10,11};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
