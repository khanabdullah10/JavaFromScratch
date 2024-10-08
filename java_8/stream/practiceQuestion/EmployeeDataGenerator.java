package src.java_8.stream.practiceQuestion;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.*;

class Employee {
    private String name;
    private double salary;
    private String department;
    private int age;
    private String gender;
    private LocalDate dateOfJoining;

    public Employee() {

    }

    public Employee(String name, double salary, String department, int age, String gender, LocalDate dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfJoining() { return dateOfJoining; }

    public void setDateOfJoining(LocalDate dateOfJoining) { this.dateOfJoining = dateOfJoining; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                '}';
    }
}




public class EmployeeDataGenerator {
    public static List<Employee> generateSampleData() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("John Doe", 60000.0, "IT", 30, "Male", LocalDate.of(2019, 5, 15)));
        employeeList.add(new Employee("Jane Smith", 70000.0, "HR", 28, "Female", LocalDate.of(2020, 8, 22)));
        employeeList.add(new Employee("Robert Johnson", 80000.0, "Finance", 35, "Male", LocalDate.of(2018, 3, 10)));
        employeeList.add(new Employee("Emily Davis", 55000.0, "Marketing", 25, "Female", LocalDate.of(2021, 1, 5)));
        employeeList.add(new Employee("Michael Brown", 75000.0, "Engineering", 32, "Male", LocalDate.of(2017, 11, 18)));
        employeeList.add(new Employee("Alice Miller", 72000.0, "Sales", 29, "Female", LocalDate.of(2019, 9, 8)));
        employeeList.add(new Employee("David Wilson", 68000.0, "IT", 31, "Male", LocalDate.of(2020, 4, 30)));
        employeeList.add(new Employee("Sophia Davis", 85000.0, "Finance", 28, "Female", LocalDate.of(2018, 7, 12)));
        employeeList.add(new Employee("Henry Johnson", 60000.0, "Engineering", 27, "Male", LocalDate.of(2022, 2, 15)));
        employeeList.add(new Employee("Olivia Brown", 67000.0, "Marketing", 26, "Female", LocalDate.of(2021, 6, 25)));
        employeeList.add(new Employee("Ethan Smith", 78000.0, "Sales", 33, "Male", LocalDate.of(2017, 12, 5)));
        employeeList.add(new Employee("Ava Wilson", 59000.0, "HR", 24, "Female", LocalDate.of(2019, 10, 20)));
        employeeList.add(new Employee("Liam Davis", 71000.0, "Engineering", 30, "Male", LocalDate.of(2018, 1, 8)));
        employeeList.add(new Employee("Mia Johnson", 73000.0, "IT", 34, "Female", LocalDate.of(2020, 3, 22)));
        employeeList.add(new Employee("Noah Miller", 69000.0, "Finance", 32, "Male", LocalDate.of(2017, 8, 14)));

        return employeeList;
    }


}


    class Solution{

        public static void main(String[] args) {

            /***
             * Given a list of `Employee` objects, filter and retrieve all male employees in the “Engineering”
             * department using Java 8 Streams.
             */

            List<Employee> lst = EmployeeDataGenerator.generateSampleData();
//
            List<Employee> l0 = lst.stream().filter(m->"Engineering".equalsIgnoreCase(m.getDepartment()) && "Male".equalsIgnoreCase(m.getGender())).collect(Collectors.toList());
//            for(Employee e : l){
//                System.out.println(e);
//            }


            /***
             * Transform the names of all employees to uppercase using the map operation in streams.
             */




            List<String> l = lst.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
//            l.forEach(System.out::println);

            /***
             * Sort a list of ‘Employee’ objects by their salaries in Ascending order using Java 8 Streams.
             */

            List<Employee> l1 = lst.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
            l1.forEach(System.out::println);


            /**
             * Sort a list of `Employee` objects by their salaries in descending order using Java 8 Streams.
             */

            List<Employee> l2 = lst.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .collect(Collectors.toList());

            l2.forEach(e->System.out.println(e.getName()+" "+e.getSalary()));


            /***
             * Group the employees by their gender and print the result using the groupingBy collector.
             */

            Map<String,List<Employee>> employeeListOutput = lst.stream()
                    .collect(Collectors.groupingBy(s->s.getGender()));

            employeeListOutput.forEach((k,v)->{
                System.out.println("Gender : "+k);
                v.forEach(System.out::println);
                System.out.println("-----------------------------");
            });


            /***
             * Group a list of `Employee` objects by their departments using Java 8 Streams, resulting
             * in a map where keys represent departments and values are lists of employees in that department.
             */

            Map<String,List<Employee>> empDepList = lst.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment));

            empDepList.forEach((department,employee)->{
                System.out.println("Department =" +department);
                employee.forEach(System.out::println);
                System.out.println("---------------------------");
            });


            /***
             * Count the number of employees for each gender using the groupingBy and
             */

            Map<String,Long> employeeList = lst.stream()
                    .collect(Collectors.groupingBy(s->s.getGender(),Collectors.counting()));

            employeeList.forEach((k,v)->{
                System.out.println("Gender : "+k + " and Count : "+v);
            });

            /**
             *
             * Calculate the total salary of all
             * female employees in a list of `Employee` objects using Java 8 Streams.
             */

            List<Employee> emp = EmployeeDataGenerator.generateSampleData();

            Optional<Double> totalSalary = emp.stream().filter(e->"Female".equalsIgnoreCase(e.getGender())).map(e->e.getSalary()).reduce((a, b)->a+b).get().describeConstable();
            System.out.println(totalSalary);


            /**
             * Find the female employee with the highest salary in a list of `Employee`
             * objects using Java 8 Streams.
             */

            Employee empp = emp.stream().filter(e->"Female".equalsIgnoreCase(e.getGender())).sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
            System.out.println(empp);


            /***
             * Create a list of names (Strings) from a list of `Employee` objects using Java 8 Streams.
             */

            List<String> name = emp.stream().map(e->e.getName()).collect(Collectors.toList());
            System.out.println(name);

            /**
             * Create a list of employees’ names who have a salary
             * greater than 20,000 and are in the “Sales” department using Java 8 Streams.
             */

            List<String> emppp = emp.stream().filter(e-> e.getSalary() > 20000 && e.getDepartment().equalsIgnoreCase("Sales")).map(e->e.getName()).collect(Collectors.toUnmodifiableList());
            System.out.println(emppp);


            /**
             * Calculate the average salary for all employees and print it.
             */

            Double sal = emp.stream().mapToDouble(e->e.getSalary()).average().getAsDouble();
            System.out.println(sal);


            /***
             * Calculate the average salary for employees in each department using Java 8 Streams.
             */

            Map<String , Double> emz = emp.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.averagingDouble(e->e.getSalary())));
            emz.forEach((k,v)-> System.out.println(k+" "+v));


            /***
             * Increase the salary of all
             * female employees in the “Engineering” department by 10% using Java 8 Streams.
             */


           List<Double>  feSal = emp.stream().filter(e->e.getGender().equalsIgnoreCase("Female") && e.getDepartment().equalsIgnoreCase("Engineering")).map(s->s.getSalary()+(s.getSalary()*10)/100).collect(Collectors.toUnmodifiableList());
            feSal.forEach(e-> System.out.println(e));

            /**
             * Filter and retrieve all employees who are older than 30 years and have a
             * salary greater than 30,000 using Java 8 Streams.
             */

            List<String > empname = emp.stream().filter(e->e.getAge()>30 && e.getSalary() > 30000).map(e->e.getName()).collect(Collectors.toUnmodifiableList());
            empname.forEach(System.out::println);


            /**
             * Find the employee with the highest salary in each department using Java 8 Streams.
             */

            Map<String, Employee> highestSalaryInEachDepartment = emp.stream()
                    .collect(Collectors.toMap(
                            Employee::getDepartment,
                            e -> e,
                            (e1, e2) -> e1.getSalary() >= e2.getSalary() ? e1 : e2
                    ));

            System.out.println(highestSalaryInEachDepartment);


            /**
             * Calculate the total salary, average salary, and number
             * of female employees in each department using Java 8 Streams.
             */

            Optional<String> numOFEmp = emp.stream().filter(e->e.getName().equalsIgnoreCase("Female")).map(e->e.getName()).reduce((a, b)->a+b);
            System.out.println(numOFEmp);


            /***
             * Determine and print the number of years each employee
             * has been with the company using the ChronoUnit class.
             */




                    List<Employee> employeeeList = EmployeeDataGenerator.generateSampleData();
//
//                    employeeeList.stream()
//                            .forEach(employee -> {
//                                long years = ChronoUnit.YEARS.between(employee.getHireDate(), LocalDate.now());
//                                System.out.println(employee.getName() + " has been with the company for " + years + " years.");
//                            });









        }




    }



