package cachorrobdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testPessoa {
    
    public testPessoa() {
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
    public void testGetNome() {
        System.out.println("getNome");
        pessoa instance = new pessoa();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDog() {
        System.out.println("getDog");
        pessoa instance = new pessoa();
        cachorro expResult = null;
        cachorro result = instance.getDog();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}