package src.classClassObject;

import java.lang.reflect.*;

class Demo{

    private String name;
    private int rollNO;


    public String getName() {
        return this.name;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }
}

class Example{

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("Demo");

        Method[] method = c.getDeclaredMethods();

        for(Method m : method){
            System.out.println(m);
        }

        Field[] field = c.getFields();

        for (Field f : field){
            System.out.println(f);
        }
    }

}
