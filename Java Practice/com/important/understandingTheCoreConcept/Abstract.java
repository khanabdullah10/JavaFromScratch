package com.important.understandingTheCoreConcept;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/***
 *
 * ABSTRACT CLASS
 *
 */
abstract class AbsClass{

// cannot use private static or final
// by default scope is package-private;

    abstract void m1();

    void m2(){
        System.out.println("Method 2");
    }
    static void m3(){
        System.out.println("Method 3");
    }

    public void m4(){
        System.out.println("Method 4");
    }

    protected void m5(){
        System.out.println("Method 5");
    }

    final void m6(){
        System.out.println("Method 6");
    }

    // Cannot access the private
    private void m7(){
        System.out.println("private Method 7");
    }

}


public class Abstract extends  AbsClass{

    // cannot use weaker accessibility
    @Override
    void m1() {
        System.out.println("implemented method m1");
    }

    void example(){
        System.out.println("Example 1");
    }



    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Abstract ex = new Abstract();
        ex.example();
        ex.m1();
        ex.m2();
        m3();
        ex.m4();
        ex.m5();
        ex.m6();


        Class<?> clazz = ex.getClass().getSuperclass();  // Get superclass (AbsClass)

        // Get the private method 'm7' using Reflection
        Method method = clazz.getDeclaredMethod("m7");  // Access private method

        // Set the method accessible (bypasses the access modifier)
        method.setAccessible(true);

        // Invoke the private method on the instance 'ex'
        method.invoke(ex);





    }

}
