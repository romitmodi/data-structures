package org.romit.learning.data.structure.array.sorting;

import java.util.Arrays;
import java.util.Date;

public class SortingApp {
    public static void main(String[] args) {
        DataStructure structure = new DataStructure(34);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(10);
        structure.insert(9);
        structure.insert(8);
        structure.insert(7);
        structure.insert(1);
        structure.insert(6);
        structure.insert(5);
        structure.insert(4);
        structure.insert(3);
        structure.insert(2);
        structure.insert(1);

        structure.show();

        // Date start = new Date();
        //structure.bubbleSort();
        //System.out.println("Time taken by Bubble Sort: " + (new Date().getTime() - start.getTime()));

        Date start = new Date();
        structure.insertionSort();
        System.out.println("Time taken by Selection Sort: " + (new Date().getTime() - start.getTime()));
        structure.show();

    }
}

class DataStructure {
    private int numberOfElements;
    private int[] dataStore;

    public DataStructure(int size) {
        dataStore = new int[size];
        numberOfElements = 0;
    }

    public void insert(int data) {
        dataStore[numberOfElements] = data;
        numberOfElements++;
    }

    public int find(int searchItem) {
        int index = -1;
        for (int i = 0; i < numberOfElements; i++) {
            if (dataStore[i] == searchItem) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void delete(int item) {
        int itemIndex = find(item);
        if (itemIndex > -1) {
            for (int i = itemIndex; i < numberOfElements - 1; i++) {
                dataStore[i] = dataStore[i + 1];
            }
            numberOfElements--;
            System.out.println("Data deleted successfully");
        }
        System.out.println("Data deletion failed, as item not found!");
    }

    public void show() {
        Arrays.stream(dataStore).asLongStream().forEach(value -> {
            System.out.print(value + " ");
        });
        System.out.println();
    }

    /**
     * Bubble sort work in a way where each subsequent item in a data-structure/array is compared and whenever current
     * item is higher than next item swap operation is done. Thus, In approach ech cycle perform multiple comparison and
     * swap due to which this has the worst performance among all sorting algorithm.
     */
    public void bubbleSort() {
        Integer temp = null;
        for (int out = 0; out < numberOfElements - 1; out++) {
            for (int in = 0; in < numberOfElements - 1 - out; in++) {
                if (dataStore[in] > dataStore[in + 1]) {
                    temp = dataStore[in + 1];
                    dataStore[in + 1] = dataStore[in];
                    dataStore[in] = temp;
                }
            }
        }
    }

    /**
     * Selection sort, is better in-terms of overall performance. As number swap operation is less than or equal to size of datastore.
     * Below are steps which needs to follow:-
     * 1) find the smallest object and move it to first position.
     * follow same in next index.
     * In case of large data set its performance is way better the bubble sort, as swap operation are removed.
     * Despite being better than Bubble sort its space complexity is still O(n^2).
     */
    public void selectionSort() {
        int min = 0, temp = 0;
        for (int i = 0; i < numberOfElements - 1; i++) {
            min = i;
            for (int j = i + 1; j < numberOfElements; j++) {
                if (dataStore[j] < dataStore[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = dataStore[min];
                dataStore[min] = dataStore[i];
                dataStore[i] = temp;
            }
        }
    }

    /**
     *
     */
    public void insertionSort() {
        int temp = 0, j = 0;
        for (int i = 1; i < numberOfElements; i++) {
            temp = dataStore[i];
            j = i;
            while (j > 0 && dataStore[j - 1] > temp) {
                dataStore[j] = dataStore[j - 1];
                j--;
            }
            dataStore[j] = temp;
        }
    }
}
