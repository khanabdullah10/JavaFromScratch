package src.java_8.stream.teamLeader;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    Integer id;
    String address;
    Double salary;

    public Employee(String name, Integer id, String address, Double salary) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Name : " + name + '\'' +
                ",Id : " + id +
                ", Address : " + address + '\'' +
                ", Salary" + salary  ;
    }
}




public class Questions {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Khan",25,"GZB",20000.0));
        emp.add(new Employee("Shivam",26,"Noida",30000.0));
        emp.add(new Employee("Anubhav",27,"Noida",40000.0));
        emp.add(new Employee("Ankit",28,"GZB",60000.0));


        List<Employee> l = emp.stream().filter(e->e.getAddress().equals("Noida") && e.getSalary()>2000).collect(Collectors.toUnmodifiableList());

        System.out.println(l);
    }
}
