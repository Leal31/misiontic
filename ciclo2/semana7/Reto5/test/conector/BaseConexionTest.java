/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leale
 */
public class BaseConexionTest {
    
    public BaseConexionTest() {
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
     * Test of Conectar method, of class BaseConexion.
     */
    @Test
    public void testConectar() {
        System.out.println("Conectar");
        BaseConexion instance = new BaseConexion();
        instance.Conectar();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Desconectar method, of class BaseConexion.
     */
    @Test
    public void testDesconectar() {
        System.out.println("Desconectar");
        BaseConexion instance = new BaseConexion();
        instance.Desconectar();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
