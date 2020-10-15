package com.dk.spring.parsedatacsv.model;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @CsvBindByName
    private long id;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String email;

    @CsvBindByName(column = "country")
    private String countryCode;

    @CsvBindByName
    private int age;
}

