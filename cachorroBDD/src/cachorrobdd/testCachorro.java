package cachorrobdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testCachorro {
    
    public testCachorro() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetEspecie() {
        System.out.println("getEspecie");
        cachorro instance = new cachorro();
        String expResult = "";
        String result = instance.getEspecie();
        assertEquals(expResult, result); 
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNome() {
        System.out.println("getNome");
        cachorro instance = new cachorro();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}