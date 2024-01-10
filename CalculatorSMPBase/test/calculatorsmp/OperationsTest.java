/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nathaly
 */
public class OperationsTest {
    
    public OperationsTest() {
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

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertNotNull(result);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Prueba con formula de la suma");
        String formula = "5+5";
        String expResult = "5+5=10";
        String result = Operations.Solve(formula);
        assertNotEquals(expResult, result);
        
    }
    @Test
    public void testCompuesta() {
        System.out.println("Prueba con formula compuesta");
        String formula = "2*5+6";
        String expResult = "2*5+6=16";
        String result = Operations.Solve(formula);
        assertNotEquals(expResult, result);
        
    }
}
