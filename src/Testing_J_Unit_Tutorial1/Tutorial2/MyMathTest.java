package Testing_J_Unit_Tutorial1.Tutorial2;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class) // forces to run with parameters
public class MyMathTest {

    private int a, b, expResult;

    // it is possible to hardcode var in the Test body or set it through Constructor
    // and get it from @Parameterized.Parameters
//    public MyMathTest() {
//    }

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    // set general rule for the whole test class
    @Rule
    public TestRule timeout = new Timeout(250);

    @Parameterized.Parameters
    public static Collection numbers(){
//        List<List<Integer>> objects = new ArrayList<>();
//        List<Integer> i1 = Arrays.asList(1, 2, 3);
//        List<Integer> i2 = Arrays.asList(2, 9, 11);
//        List<Integer> i3 = Arrays.asList(3, 3, 6);
//        objects.add(i1);
//        objects.add(i2);
//        objects.add(i3);
//        return objects;
        return Arrays.asList(new Object[][]{{1, 2, 3}, {2, 9, 11}, {3, 3, 7}});
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

   // @Test(timeout = 100)
    @Test
    public void testAdd() throws InterruptedException {
        System.out.println("Add");
//        int a = 2;
//        int b = 3;
//        int expResult = 5;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype");
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDiv() throws InterruptedException {
        System.out.println("Div");
        int a = 8;
        int b = 0;
        int expResult = 4;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

}