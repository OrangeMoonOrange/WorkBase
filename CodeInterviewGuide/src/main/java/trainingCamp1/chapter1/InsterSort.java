package trainingCamp1.chapter1;

/**
 * @Author: xk
 * @Date: 2021/7/26 8:53
 * @Desc: 插入排序
 */
public class InsterSort {

    //流程:
    //0-0有 0-1有序 0-2有序...

    public static void insterSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j-1 >= 0 && arr[j-1] > arr[j]; j--) {
                swap(arr, j, j-1);
            }
        }
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // 0~0 有序的
        // 0~i 想有序
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] list = {6, 5, 4, 3,34,68,22,845,13,67,35,979};
//        insertionSort(list);
        insterSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
