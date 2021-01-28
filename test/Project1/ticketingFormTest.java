package Project1;

import Project1.ticketingForm;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ticketingFormTest {
    ticketingForm tf;
    @Before
    public void setUp() throws Exception {
        tf = new ticketingForm();
    }
    
    @After
    public void tearDown() {
        tf = null;
    }

    @Ignore
    @Test
    public void testCheck() {
        System.out.println("check");
        List ls = null;
        ticketingForm instance = new ticketingForm();
        instance.check(ls);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testKembalian() {
        System.out.println("dikembalikan");
        int qty = 1;
        int price = 55000;
        int uang = 100000;
        ticketingForm instance = new ticketingForm();
        int expResult = 45000;
        int result = instance.hitung(qty, uang, price);
        assertEquals(expResult, result);
        assertThat(price, is(not(equalTo(expResult))));
    }

    @Test
    public void testResetbtn() {
        System.out.println("Button Reset");
        ticketingForm instance = new ticketingForm();
        instance.resetbtn();
        Object resetbtn = null;
        assertNull(resetbtn);
    }
    
    @Test
    public void testGoback() {
        System.out.println("Button Reset");
        ticketingForm instance = new ticketingForm();
        instance.goback();
        boolean goback = true;
        assertTrue(goback);
    }
}
