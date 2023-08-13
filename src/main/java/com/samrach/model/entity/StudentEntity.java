package com.samrach.model.entity;

import com.samrach.infrastructure.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class StudentEntity extends BaseEntity {
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private Date dateOfBirth;
    @Column
    private String phoneNumber;
    @Column
    private String studentType;
}
