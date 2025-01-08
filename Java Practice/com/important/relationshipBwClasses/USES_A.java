package com.important.relationshipBwClasses;


class Teacher{
    void teach(){
        System.out.println("Teacher teaches");
    }
}

class Student{
    Teacher teacher;
    Student(Teacher teacher){
        this.teacher = teacher;
    }
    void learn(){
        teacher.teach();
        System.out.println("Student learns");

    }
}

public class USES_A {
    public static void main(String[] args) {

        Student st = new Student(new Teacher());
        st.learn();
    }
}
