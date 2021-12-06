package ec.edu.epn.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;

    @BeforeClass
    public static void setupClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c=new Calculator();
    }

    @Test
    public void given_two_integers_when_add_then_ok(){
        System.out.println("Test 1");
        assertEquals(9,c.addition(3,6));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        System.out.println("Test 2");
        assertEquals(7,c.subtraction(15,8));
    }

    @Test
    public void given_two_integers_when_division_then_ok(){
        System.out.println("Test 3");
        assertEquals(6,c.division(18,3 ),0);
    }

    @Test(timeout = 150)
    public void given_a_time_when_timeout_then_exception(){
        System.out.println("Test 4");
        c.timeout(100);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        c.setAnswer(0);
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass");
    }
}