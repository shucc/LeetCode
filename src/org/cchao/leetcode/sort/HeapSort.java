package org.cchao.leetcode.sort;

import java.util.Arrays;

public class HeapSort {

    /**
     * 创建k个节点的小根堆
     *
     * @param a
     * @param k
     * @return
     */
    int[] createHeap(int a[], int k) {
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = a[i];
        }
        for (int i = 1; i < k; i++) {
            int child = i;
            int parent = (i - 1) / 2;
            int temp = a[i];
            while (parent >= 0 && child != 0 && result[parent] > temp) {
                result[child] = result[parent];
                child = parent;
                parent = (parent - 1) / 2;
            }
            result[child] = temp;
        }
        return result;

    }

    void insert(int a[], int value) {
        a[0] = value;
        int parent = 0;

        while (parent < a.length) {
            int lchild = 2 * parent + 1;
            int rchild = 2 * parent + 2;
            int minIndex = parent;
            if (lchild < a.length && a[parent] > a[lchild]) {
                minIndex = lchild;
            }
            if (rchild < a.length && a[minIndex] > a[rchild]) {
                minIndex = rchild;
            }
            if (minIndex == parent) {
                break;
            } else {
                int temp = a[parent];
                a[parent] = a[minIndex];
                a[minIndex] = temp;
                parent = minIndex;
            }
        }
    }

    int[] getTopKByHeap(int input[], int k) {
        int heap[] = this.createHeap(input, k);
        for (int i = k; i < input.length; i++) {
            if (input[i] > heap[0]) {
                this.insert(heap, input[i]);
            }
        }
        return heap;
    }

    public static void main(String[] args) {
        int a[] = {42, 33, 5, 1, 2, 8, 9, 10};
        System.out.println(Arrays.toString(a));
        new HeapSort().quickSort(a, 0, a.length - 1, 3);
        System.out.println(Arrays.toString(a));
    }

    private void quickSort(int[] data, int low, int hight, int k) {
        if (low < hight) {
            int middle = getMiddle(data, low, hight);
            if (data.length - middle == k) {
                return;
            } else if (data.length - middle > k) {
                quickSort(data, middle + 1, hight, k);
            } else {
               quickSort(data, 0, middle - 1, k);
            }
        }
    }

    private int getMiddle(int[] data, int low, int high) {
        int key = data[low];
        while (low < high) {
            while (low < high && data[high] >= key) {
                high--;
            }
            data[low] = data[high];
            while (low < high && data[low] < key) {
                low++;
            }
            data[high] = data[low];
        }
        data[low] = key;
        return low;
    }
}