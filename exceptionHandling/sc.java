package src.exceptionHandling;

//class Test {
//    public static void main(String[] args)
//    {
//        System.out.println("111");
//        try {
//            System.out.println("222");
//            double y = 1.0/0;
//        }
//        catch(ArithmeticException e)
//        {
//            try {
//                System.out.println("Hello");
//                int x = 20/0;
//            }
//            catch(NullPointerException np)
//            {
//                System.out.println("333");
//            }
//        }
//        System.out.println("444");
//    }
//}

//class Test {
//    public static void main(String[] args)
//    {
//        System.out.println("111");
//        try {
//            System.out.println("222");
//            int y = 1/0;
//        }
//        catch(ArithmeticException e)
//        {
//            try {
//                System.out.println("Hello");
//                double x = 2.5/0;
//                System.out.println("Java");
//            }
//            catch(NullPointerException np)
//            {
//                System.out.println("333");
//            }
//        }
//        System.out.println("444");
//    }
//}


//class Test {
//    public static void main(String[] args)
//    {
//        try {
//            method();
//            System.out.println("After the method call");
//        }
//        catch (StringIndexOutOfBoundsException se) {
//            System.out.println("StringIndexOutOfBoundsException");
//        }
//        catch (RuntimeException ex) {
//            System.out.println("RuntimeException");
//        }
//        catch (Exception e) {
//            System.out.println("Exception");
//        }
//    }
//    static void method() throws Exception {
//        String str = "Hello";
//        char ch = str.charAt(5);
//        System.out.println(ch);
//    }
//}

//class Test {
//    public static void main(String[] args) throws Exception
//    {
//        try {
//            System.out.println("ABC");
//            int a  = 5, b = 10, c = 5;
//            a += 5;
//            b -= a + c;
//            int x = (a + b)/(b + c);
//            System.out.println(x);
//            System.exit(0);
//        }
//        catch(ArithmeticException ae) {
//            System.out.println("PQR");
//        }
//        finally {
//            System.out.println("XYZ");
//        }
//    }
//}



class Test {
    int m1(){
        try {
            System.out.println("ABC");
            return 50;
        }
        catch(Exception e) {
            System.out.println("I am in catch block");
        }
        return 0;
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}

