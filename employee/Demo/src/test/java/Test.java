

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class Test {

    Calculation c = new Calculation();


    @BeforeClass
    public static void before() {
        System.out.println("classs");
    }


    @Before
    public void bef() {
        System.out.println("before test");
    }

    @After
    public void af() {
        System.out.println("after test");
    }
    Process p = mock(Process.class);

    @org.junit.Test
    public void testingg() {
        int s;
        s = c.sum(1, 2);
        System.out.println("11");
        assertEquals(3, s);

    }

    @org.junit.Test
    public void testExcept() {

        assertThrows(ArithmeticException.class, () ->
                c.sum(0, 5));
    }


//    @org.junit.Test
//    public void test2() {
//        int q;
//        q = c.sub(5, 7);
//        System.out.println("22");
//        assertEquals(35, q);
//    }
}
