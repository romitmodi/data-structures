package org.romit.learning.data.structure.array;


public class PersonArray {

    private Person[] dataStore;
    private int numberOfElements;

    public PersonArray(int size) {
        dataStore = new Person[size];
        numberOfElements = 0;
    }

    public boolean insert(Person dataItem) {
        if (numberOfElements < dataStore.length) {
            dataStore[numberOfElements] = dataItem;
            numberOfElements++;
            System.out.println("Data inserted successfully");
            return true;
        }
        System.out.println("Data inserted failed as dataStore is Full");
        return false;
    }

    public int find(Person dataItem) {
        for (int i = 0; i < numberOfElements; i++) {
            if (dataItem.equals(dataStore[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean delete(Person dataItem) {
        int index = find(dataItem);
        if (index > -1) {
            for (int i = index; i < numberOfElements - 1; i++) {
                dataStore[i] = dataStore[i + 1];
            }
            dataStore[numberOfElements] = null;
            numberOfElements--;
            return true;
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(dataStore[i] + " ");
        }
    }
}
