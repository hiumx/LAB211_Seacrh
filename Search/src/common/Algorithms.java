/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author Admin
 */
public class Algorithms {

    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] array, int begin, int end, int value) {
        int mid;
        if (end >= begin) {
            mid = (begin + end) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, begin, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, end, value);
            }
        }
        return -1;
    }
}
