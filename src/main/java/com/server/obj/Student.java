package com.server.obj;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private String name;
    private String sex;
    private int age;
    private int id;
    private int tid;
}
