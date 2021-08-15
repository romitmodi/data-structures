package org.romit.learning.data.structure.array.search;

/**
 * In this Data Structure we will be storing Data in ordered manner.
 * - Before Insertion is done, index is needed to be identified where data needs to be inserted, then we insert the data.
 * - deletion will not have any major impact, But search operation will get optimized, since we are using ordered datastore and using Binary search to find the dataItem.
 * - Search operation will be most efficient are number steps required to find the correct value will be very less using Binary Search. If we compare it will Linear Search.
 */
public class OrderedArray {

    private long[] dataStore;
    private int numberOfElements;

    public OrderedArray(int size) {
        dataStore = new long[size];
        numberOfElements = 0;
    }

    public boolean insert(long dataItem) {
        int insertionIndex;
        if (numberOfElements < dataStore.length) {
            insertionIndex = findInsertionIndexUsingBinarySearch(dataItem);
            for (int i = numberOfElements; i > insertionIndex; i--) {
                dataStore[i] = dataStore[i - 1];
            }
            dataStore[insertionIndex] = dataItem;
            numberOfElements++;
            System.out.println("Data inserted successfully");
            return true;
        }
        System.out.println("Data inserted failed as dataStore is Full");
        return false;
    }

    private int findInsertionIndexUsingBinarySearch(long dataItem) {
        int currentIndex, lowerBound = 0, upperBound = numberOfElements - 1;
        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (dataItem < dataStore[currentIndex]) {
                if (dataItem > dataStore[currentIndex - 1]) {
                    return currentIndex;
                }
                upperBound = currentIndex - 1;
            } else if (lowerBound > upperBound) {
                return numberOfElements;
            } else {
                if (dataItem < dataStore[currentIndex + 1]) {
                    return currentIndex+1;
                }
                lowerBound = currentIndex + 1;
            }
        }
    }

    public int find(long dataItem) {
        int currentIndex;
        int lowerBound = 0, upperBound = numberOfElements - 1;
        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (dataItem == dataStore[currentIndex]) {
                return currentIndex;
            } else if (lowerBound > upperBound) {
                return numberOfElements;
            } else {
                if (dataItem > dataStore[currentIndex]) {
                    lowerBound = currentIndex + 1;
                } else {
                    upperBound = currentIndex - 1;
                }
            }
        }
    }

    public boolean delete(long dataItem) {
        int index = find(dataItem);
        if (index > -1) {
            for (int i = index; i < numberOfElements - 1; i++) {
                dataStore[i] = dataStore[i + 1];
            }
            numberOfElements--;
            return true;
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(dataStore[i] + " ");
        }
    }
}
