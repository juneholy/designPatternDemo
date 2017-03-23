package com.holy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by houlin.jiang on 17-1-20.
 */
public class SortUtil {

    public static int[] maopaoSort(int[] originList) {
        if (originList == null || originList.length < 2) {
            return originList;
        }
        int size = originList.length;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                if (originList[j] < originList[j - 1]) {
                    Integer temp = originList[j];
                    originList[j]=originList[j - 1];
                    originList[j - 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "次冒泡排序结果" + printInt(originList));
        }
        return originList;
    }

    public static int[] charuSort(int[] originList) {
        if (originList == null || originList.length < 2) {
            return originList;
        }
        int size = originList.length;
        int[] list = new int[size];
        for (int i = 0; i < size - 1; i++) {
            list[0] = originList[i];
            if (list.length < 2) {
                continue;
            }
            for (int j = i; j >= 1; j--) {
                if (list[j] < list[j - 1]) {
                    Integer temp = list[j];
                    list[j] =  list[j - 1];
                    list[j - 1] =  temp;
                } else {
                    break;
                }
            }
            System.out.println("第" + (i + 1) + "次插入排序结果" +printInt(list));
        }
        return originList;
    }

    public static void kuaisuSort(int[] originList, int low, int hight) {
        if (low < hight) {
            int i = low, j = hight, key = originList[low];
            while (i < j) {

                while (i < j && originList[j] >= key) { // 从右向左找第一个小于x的数
                    j--;
                }
                if (i < j) {
                    originList[i] =  originList[j];
                    i++;
                }
                while (i < j && originList[j] < key) { // 从左向右找第一个大于等于x的数
                    i++;
                }
                if (i < j) {
                    originList[j]= originList[i];
                    j--;
                }
            }
            originList[i] = key;
            System.out.println("快速排序k=" + key + "  结果" + printInt(originList));
            kuaisuSort(originList, low, i - 1); // 递归调用
            kuaisuSort(originList, i + 1, hight);
        }
    }


    private static String printInt(int[] list){
        String s = "{";
        for(int i = 0;i<list.length;i++) {
            s+=list[i]+" , ";
        }
        return s+"}";
    }

    public static void main(String[] args) {
        int[] list = new int[]{34,54,25,65,14,98,21,5,58,21,6,32,9,45};
        charuSort(list);

    }
}
