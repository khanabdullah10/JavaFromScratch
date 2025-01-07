package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    private final Map<String, SchoolClass> classes = new HashMap<>();

    public List<SchoolClass> getAllClasses() {
        return new ArrayList<>(classes.values());
    }


    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.getAllClasses();

    }
}
