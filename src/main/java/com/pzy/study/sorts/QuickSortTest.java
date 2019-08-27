package com.pzy.study.sorts;

import java.util.Arrays;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/08/27
 */
public class QuickSortTest {

    public static void quickSort(Integer[] data , int left , int right){
        int base = data[left];
        int ll = left;
        int rr = right;
        while (ll < rr ){
            while (ll < rr && base < data[rr]){
                rr--;
            }
            if (ll < rr){
                data[ll] = data[ll] + data[rr];
                data[rr] = data[ll] - data[rr];
                data[ll] = data[ll] - data [rr];
                ll++;
            }
            while (ll < rr && base > data[ll]){
                ll++;
            }
            if (ll < rr){
                data[ll] = data[ll] + data[rr];
                data[rr] = data[ll] - data[rr];
                data[ll] = data[ll] - data [rr];
                rr--;
            }
            if (left < ll){
                quickSort(data , left , ll);
            }
            if (rr < right){
                quickSort(data ,ll+1 ,right);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] data = new Integer[]{3 ,6 , 5 , 7 , 2 ,4};
        quickSort(data , 0  , data.length -1);
        System.out.println(Arrays.toString(data));
    }
}
