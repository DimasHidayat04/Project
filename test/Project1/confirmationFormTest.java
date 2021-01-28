package Project1;

import Project1.confirmationForm;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class confirmationFormTest {
    
    public confirmationFormTest() {
    }
        
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testData() {
        System.out.println("data");
        List ls = null;
        confirmationForm instance = new confirmationForm();
        instance.data(ls);
        
    }

    @Test
    public void testConfirmationForm() {
        System.out.println("Confirmation Form");
        confirmationForm instance = new confirmationForm();
        instance.confirmationForm();
        
    }

    @Test
    public void testGoback_List() {
        System.out.println("goback");
        List ls = null;
        confirmationForm instance = new confirmationForm();
        
    }
    
}
