/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author davidchiu
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of getradius method, of class Circle.
     */
    @Test
    public void testGetradius() {
        System.out.println("getradius");
        Circle instance = new Circle(10,10,2.33);
        double expResult = 2.33;
        double result = instance.getradius();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class Circle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circle instance = new Circle(10,10,2.33);
        String expResult = "2.33 ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of scale method, of class Circle.
     */
    @Test
    public void testScale() {
        System.out.println("scale");
        double factor = 1.0;
        Circle instance = new Circle(10,10,2.33);
        instance.scale(factor);
    }
}
