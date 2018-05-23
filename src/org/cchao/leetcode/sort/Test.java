package org.cchao.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shucc on 18/5/16.
 * cc@cchao.org
 */
public class Test {

    public static void main(String args[]) {
        //int[] test = new int[]{23, 43, 1, 324, 54, 13, 545, 3, 6, 1, 45};
        int[] test = new int[]{32, 5, 645, 12, 99, 34234234, 3, 3, 5, 66, 1, 34, 56, 43, 54, 1, 333, 4545, 64, 565, 123, 345, 65, 1, 333, 1, 343254325, 5454, 12, 5456, -1, -43, 53, 0, -23424, 1321, 45, 66, 768, 12, 767, 34, 7687, 3234, 4, 12, 454, 12, 5, 0, -98, 454, 12, 545};
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < test.length; j++) {
                temp.add(test[j]);
            }
        }
        int[] array = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            array[i] = temp.get(i);
        }
        printArray(array);
        System.out.println("");
        long preTime = System.currentTimeMillis();
        //bubbleSort(array);
        //choiceSort(array);
        //choiceSort2(array);
        //Arrays.sort(array);
        quickSort(array, 0, array.length - 1);
        System.out.println(String.valueOf(System.currentTimeMillis() - preTime));
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("-->" + array[i]);
        }
    }

    /**
     * 冒泡排序
     *
     * @param array
     */
    private static void bubbleSort(int[] array) {
        boolean change;
        for (int i = 0; i < array.length - 1; i++) {
            change = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    change = true;
                }
            }
            if (!change) {
                return;
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array
     */
    private static void choiceSort(int[] array) {
        int minIndex;
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }

    /**
     * 选择排序-改进，一次找出一个最小值和最大值
     *
     * @param array
     */
    private static void choiceSort2(int[] array) {
        int size = array.length;
        int minIndex;
        int maxIndex;
        for (int i = 1; i <= size / 2; i++) {
            minIndex = i;
            maxIndex = i;
            for (int j = i + 1; j <= size - i; j++) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                    continue;
                }
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            swap(array, i - 1, minIndex);
            swap(array, size - i, maxIndex);
        }
    }

    /**
     * 快速排序
     *
     * @param array
     * @param low
     * @param high
     */
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = getQuickMiddle(array, low, high);
            quickSort(array, low, middle - 1);
            quickSort(array, middle + 1, high);
        }
    }

    private static int getQuickMiddle(int[] array, int low, int high) {
        int key = array[low];
        while (low < high) {
            while (low < high && array[high] >= key) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] < key) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }

    /**
     * 归并排序
     *
     * @param array
     */
    private static void mergeSort(int[] array) {

    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
