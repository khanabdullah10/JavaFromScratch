package com.school.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolClass {

    @NotNull
    @Pattern(regexp = "^C\\d+$", message = "Class name should follow the pattern C followed by digits")
    private String className;

    private List<Student> students;


}
