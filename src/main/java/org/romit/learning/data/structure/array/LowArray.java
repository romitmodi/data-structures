package org.romit.learning.data.structure.array;

/**
 * By creating this case we have carved out the Data structure which we are using,
 * along with this we have encapsulated task of adding the element and getting .
 * Also achieve isolation with direct data-structured used inside,
 * thus end user is not aware how data is stored.
 */
public class LowArray {

    private long[] dataStore;

    public LowArray(int size) {
        dataStore = new long[size];
    }

    public void addElement(int index, long data) {
        dataStore[index] = data;
    }

    public long getData(int index) {
        return dataStore[index];
    }
}
