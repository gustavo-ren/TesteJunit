/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class NumerosTest {
    
    private Numeros n;
    
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n=new Numeros();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Par method, of class Numeros.
     */
    @Test
    public void testPar() {
        
        assertTrue(n.Par(6));
    }

    /**
     * Test of Square method, of class Numeros.
     */
    @Test
    public void testSquare() {
        
        assertEquals(25, n.Square(5), 0.1);
    }
    
}
