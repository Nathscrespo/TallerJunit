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
    
    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertNotNull(result);
        assertNotEquals(expResult, result);
        
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
    
    @Test
    public void testMultiplicationByZero() {
        System.out.println("Prueba 0*n");
        String formula1 = "0*2";
        String expResult1 = "0*2=0";
        String result1 = Operations.Solve(formula1);
        assertEquals(expResult1, result1);
        
        System.out.println("Prueba n*0");
        String formula2 = "2*0";
        String expResult2 = "2*0=0";
        String result2 = Operations.Solve(formula2);
        assertEquals(expResult2, result2);
    }
    
    @Test
    public void testNumDivisionWithZero() {
        System.out.println("Prueba n/0");
        String formula1 = "2/0";
        String expResult1 = "2/0=0";
        String result1 = Operations.Solve(formula1);
        assertNotEquals(expResult1, result1);
        
        System.out.println("Prueba 0/n");
        String formula2 = "0/2";
        String expResult2 = "0/2=0";
        String result2 = Operations.Solve(formula2);
        assertEquals(expResult2, result2);
        
    }
    
}
