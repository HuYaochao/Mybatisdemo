package org.company.mybatisdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private  Integer id;
    private String name;
    private Integer age;
    private String loveColor;
}
