package com.dubei.sso.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = -1641001335914385507L;
    private String name;
    private int age;
}
