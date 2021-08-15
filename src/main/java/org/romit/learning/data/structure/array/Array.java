package org.romit.learning.data.structure.array;

public class Array {

    public static void main(String[] args) {
        //TODO: create Data Structures
        long[] dataStore = new long[100];
        int numberOfElement;

        //TODO: Perform insert operation
        dataStore[0] = 10;
        dataStore[1] = 20;
        dataStore[2] = 30;
        dataStore[3] = 40;
        dataStore[4] = 50;
        dataStore[5] = 60;
        dataStore[6] = 70;
        dataStore[7] = 80;
        dataStore[8] = 90;
        dataStore[9] = 100;
        numberOfElement = 10;

        //TODO: Display Data stored inside data structured.
        int i;
        for (i = 0; i < numberOfElement; i++) {
            System.out.println("Element present at index " + i + " is: " + dataStore[i]);
        }

        //TODO: Find Data from Data Structure
        long searchData = 80;
        boolean dataFound = false;
        for (i = 0; i < numberOfElement; i++) {
            if (dataStore[i] == searchData) {
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
            if (dataStore[i] == deleteData) {
                dataFound = true;
                break;
            }
        }
        if (dataFound) {
            for (; i < numberOfElement - 1; i++) {
                dataStore[i] = dataStore[i + 1];
            }
            numberOfElement--;
            System.out.println("Data deleted successfully");
        } else {
            System.out.println("Delete operation failed as data is not present in DataStore");
        }

        //TODO: Display Final state of Data Structure
        for (i = 0; i < numberOfElement; i++) {
            System.out.println("Element present at index " + i + " is: " + dataStore[i]);
        }
        System.out.println("All operation got completed. Thus exiting");
    }
}
