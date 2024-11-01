package com.ldu.bgd.firstSevice.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {
    String name;
    String email;
}
