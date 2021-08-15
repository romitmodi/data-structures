package org.romit.learning.data.structure.array;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
