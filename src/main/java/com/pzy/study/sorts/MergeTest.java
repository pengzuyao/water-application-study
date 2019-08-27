package com.pzy.study.sorts;

import java.util.Arrays;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/26
 */
public class MergeTest {

    public static void mergeSort(Integer[] integers , int left , int right){
        if (left < right){
            int mid = (left + right)/2;
            mergeSort(integers ,left , mid);
            mergeSort(integers ,mid+1 , right);
            sort(integers , left , mid , right);
        }

    }

    private static void sort(Integer[] integers , int left , int mid , int right){
        Integer[] arr = new Integer[integers.length];
        int point1 = left;
        int temp = left;
        int point2 = mid +1;
        while (point1 <= mid && point2 <= right){
            if (integers[point1] < integers[point2]){
                arr[temp] = integers[point1];
                temp++;
                point1++;
            }else {
                arr[temp] = integers[point2];
                temp++;
                point2++;
            }
        }
        while (point1 <= mid){
            arr[temp++] = integers[point1++];
        }
        while (point2 <= right){
            arr[temp++] = integers[point2++];
        }
        for (int i = left; i <= right ; i++) {
            integers[i] = arr[i];
        }
    }


    public static void main(String[] args) {
        Integer[] integers = new Integer[]{2 , 1 , 5 , 7 , 3 , 6 ,4};
        mergeSort(integers , 0 , integers.length-1);
        System.out.println(Arrays.toString(integers));
    }
}
