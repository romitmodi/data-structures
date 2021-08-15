package org.romit.learning.data.structure.array;

/**
 * Scope of this data structure is:-
 * - abstract data structure used for data storage from end user of this class.
 * - provide features like, insert,find & delete for end user which can be used directly just by providing dataItem.
 * - by using this end user doesn't need to maintain index or number element present inside the data store.
 * - this Data store will give boolean result in case of success or failure operation.
 */
public class HighArray {
    private long[] dataStore;
    private int numberOfElements;

    public HighArray(int size) {
        dataStore = new long[size];
        numberOfElements = 0;
    }

    public boolean insert(long dataItem) {
        if (numberOfElements < dataStore.length) {
            dataStore[numberOfElements] = dataItem;
            numberOfElements++;
            System.out.println("Data inserted successfully");
            return true;
        }
        System.out.println("Data inserted failed as dataStore is Full");
        return false;
    }

    public int find(long dataItem) {
        for (int i = 0; i < numberOfElements; i++) {
            if (dataItem == dataStore[i]) {
                return i;
            }
        }
        return -1;
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
