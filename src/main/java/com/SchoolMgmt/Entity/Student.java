package com.SchoolMgmt.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long studId;
    private String fName;
    private String mName;
    private String lName;
    private int age;

}
