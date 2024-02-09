/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ud5.cuenta;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author DAW112
 */
public class CuentaTest {
    
    private Cuenta cuenta;
    
    public CuentaTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        cuenta = new Cuenta("ES123456789123465", 100f);
    }
    
    @AfterEach
    public void tearDown() {
        cuenta = null;
    }

    /**
     * Test of getNumero method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cuenta instance = cuenta;
        float expResult = 100F;
        float result = instance.getSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numCta = "";
        Cuenta instance = null;
        instance.setNumero(numCta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSaldo method, of class Cuenta.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        float saldoCta = 100F;
        Cuenta instance = cuenta;
        instance.setSaldo(saldoCta);
        float result = instance.getSaldo();
        float expResult = 100F;
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ingresarDinero method, of class Cuenta.
     */
    @Test
    public void testIngresarDinero() {
        System.out.println("ingresarDinero");
        float importe = 300F;
        Cuenta instance = cuenta;
        instance.ingresarDinero(importe);
        float result = instance.getSaldo();
        float exResult = 400f;
        assertEquals(exResult,result,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of extraerDinero method, of class Cuenta.
     */
    @Test
    public void testExtraerDinero() {
        System.out.println("extraerDinero");
        float importe = 40F;
        Cuenta instance = cuenta;
        instance.extraerDinero(importe);
        float result = instance.getSaldo();
        float exResult = 60f;
        assertEquals(exResult, result,0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of monstrarCuenta method, of class Cuenta.
     */
    @Disabled
    @Test
    public void testMonstrarCuenta() {
        System.out.println("monstrarCuenta");
        Cuenta instance = null;
        instance.monstrarCuenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private short ingresarDinero(float importe) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
