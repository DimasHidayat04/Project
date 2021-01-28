package Project1;

import Project1.account;
import Project1.loginForm;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class accountTest {
    
    public accountTest() {
    }
    loginForm obj;
    @Before
    public void setUp() {
        obj = new loginForm();
    }
    
    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void testAdminacc_String() {
        System.out.println("Account Username");
        String username = "admin@gmail.com";
        account instance = new account();
        String expResult = "admin@gmail.com";
        String result = instance.adminacc(username);
        assertEquals(expResult, result);
        assertThat(username, is(notNullValue()));
        assertThat(username, allOf(startsWith("not admin"), containsString("@gmail.com")));
    }

    @Test
    public void testAdminacc_int() {
        System.out.println("Account Password");
        int password = 121314;
        account instance = new account();
        int expResult = 121314;
        int result = instance.adminacc(password);
        assertEquals(expResult, result);
        assertThat(password, is(notNullValue()));
        assertThat(password, is(equalTo(expResult)));
    }
}
