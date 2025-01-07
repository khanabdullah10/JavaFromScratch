package Introduction;

//Cresting Student class datatype
class Student{
//    creating objects/class attributes
    int roll;
    String name ;
    float marks;

//    Parameterized constructor
//    here, this is replace with the the reference variable of an object
    Student(String name ,int id){
        this.name = name;
        this.roll = id;
    }
}


public class OOps {
    public static void main(String[] args) {
//        refernce variable = object intantiated
//        stores in the stack memory = stores in the heap memory
//        with the new keyword dynamic memory allocation is done
//        Student st = new Student();

//        Modifying the class property using the dot operator
        /* st.roll = 15;
        st.name =  "Khan Abdullah";
        st.marks = 70.0f;
        System.out.println("----------------------------------------");

        System.out.println(st.roll+", "+st.name +", "+ st.marks );*/

        System.out.println("----------------------------------------");
        Student st = new Student("Khan Abdullah",25);
        System.out.println(st.name+" "+st.roll);





    }
}
