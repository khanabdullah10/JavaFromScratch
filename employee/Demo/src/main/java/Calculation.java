public class Calculation {

    public int sum( int a, int b)
    {
        if(a==0)
        {
            throw new ArithmeticException() ;
        }
        String process = Process.process();
        System.out.println(process);
        return a+b;
    }
    public int sub( int a, int b)
    {
        return a-b;
    }
}