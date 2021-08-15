package org.romit.learning.data.structure.array;

public class LowArrayApp {
    public static void main(String[] args) {
        //TODO: create Data Structures
        LowArray dataStore = new LowArray(100);
        int numberOfElement;

        //TODO: Perform insert operation
        dataStore.addElement(0, 10);
        dataStore.addElement(1, 20);
        dataStore.addElement(2, 30);
        dataStore.addElement(3, 40);
        dataStore.addElement(4, 50);
        dataStore.addElement(5, 60);
        dataStore.addElement(6, 70);
        dataStore.addElement(7, 80);
        dataStore.addElement(8, 90);
        dataStore.addElement(9, 100);
        numberOfElement = 10;

        //TODO: Display Data stored inside data structured.
        int i;
        for (i = 0; i < numberOfElement; i++) {
            System.out.println("Element present at index " + i + " is: " + dataStore.getData(i));
        }

        //TODO: Find Data from Data Structure
        long searchData = 80;
        boolean dataFound = false;
        for (i = 0; i < numberOfElement; i++) {
            if (dataStore.getData(i) == searchData) {
                dataFound = true;
                break;
            }
        }
        if (dataFound) {
            System.out.println(searchData + " found at index: " + i);
        }

        //TODO: Delete Item from Data Structure
        long deleteData = 90;
        dataFound = false;
        for (i = 0; i < numberOfElement; i++) {
            if (dataStore.getData(i) == deleteData) {
                dataFound = true;
                break;
            }
        }
        if (dataFound) {
            for (; i < numberOfElement - 1; i++) {
                dataStore.addElement(i, dataStore.getData(i + 1));
            }
            numberOfElement--;
            System.out.println("Data deleted successfully");
        } else {
            System.out.println("Delete operation failed as data is not present in DataStore");
        }

        //TODO: Display Final state of Data Structure
        for (i = 0; i < numberOfElement; i++) {
            System.out.println("Element present at index " + i + " is: " + dataStore.getData(i));
        }
        System.out.println("All operation got completed. Thus exiting");
    }

}
