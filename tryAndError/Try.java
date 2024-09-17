package src.tryAndError;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student{

    int id;
    String name;


    Student(){

    }

    Student(int id, String name){
        this.id = id;
        this.name = name;

    }


    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }


}




public class Try {

    public static void main(String[] args) {
        Student st = new Student();
        Student std = new Student();

        Student st1 = new Student(25,"Khan");
        Student st2 = new Student(30,"Singh");

        System.out.println(st.hashCode());
        System.out.println(std.hashCode());
        System.out.println();

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());



    }


}

