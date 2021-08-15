package org.romit.learning.data.structure.array;

public class PersonArrayApp {
    public static void main(String[] args) {
        PersonArray dataStore = new PersonArray(100);
        dataStore.insert(Person.builder().firstName("Romit1").lastName("Romit1").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit2").lastName("Romit2").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit3").lastName("Romit3").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit4").lastName("Romit4").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit5").lastName("Romit5").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit6").lastName("Romit6").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit7").lastName("Romit7").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit8").lastName("Romit8").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit9").lastName("Romit9").age(32).build());
        dataStore.insert(Person.builder().firstName("Romit10").lastName("Romit10").age(32).build());

        dataStore.show();
        System.out.println();

        int index = dataStore.find(Person.builder().firstName("Romit1").lastName("Romit1").age(32).build());
        if (index > -1) {
            System.out.println("DataItem found at index " + index);
        } else {
            System.out.println("DataItem not found");
        }

        if (dataStore.delete(Person.builder().firstName("Romit10").lastName("Romit10").age(32).build())) {
            System.out.println("DataItem delete Successfully");
        } else {
            System.out.println("DataItem deletion failed, due to non availability of Data");
        }

        dataStore.show();
    }
}
