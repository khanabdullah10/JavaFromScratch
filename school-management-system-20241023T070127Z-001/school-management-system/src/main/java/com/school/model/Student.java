package com.school.model;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int rollNo;

    @NotNull
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @NotNull
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Date of Birth must be in DD-MM-YYYY format")
    private String dateOfBirth;

    private List<String> subjects;


}

