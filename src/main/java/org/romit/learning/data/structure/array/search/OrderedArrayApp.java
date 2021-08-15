package org.romit.learning.data.structure.array.search;

public class OrderedArrayApp {
    public static void main(String[] args) {
        OrderedArray dataStore = new OrderedArray(100);
        dataStore.insert(10);
        dataStore.insert(20);
        dataStore.insert(30);
        dataStore.insert(50);
        dataStore.insert(40);
        dataStore.insert(60);
        dataStore.insert(70);
        dataStore.insert(80);
        dataStore.insert(90);
        dataStore.insert(100);

        dataStore.show();
        System.out.println();

        int index = dataStore.find(70);
        if (index > -1) {
            System.out.println("DataItem found at index " + index);
        } else {
            System.out.println("DataItem not found");
        }

        if (dataStore.delete(70)) {
            System.out.println("DataItem delete Successfully");
        } else {
            System.out.println("DataItem deletion failed, due to non availability of Data");
        }

        dataStore.show();
    }
}
