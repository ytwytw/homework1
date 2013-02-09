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
 * @author ytwytw
 */
public class InvoiceItemTest {
    
    public InvoiceItemTest() {
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
     * Test of getPartNum method, of class InvoiceItem.
     */
    @Test
    public void testGetPartNum() {
        System.out.println("getPartNum");
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        String expResult = "653";
        String result = instance.getPartNum();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDesc method, of class InvoiceItem.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        String expResult = "iMad";
        String result = instance.getDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantity method, of class InvoiceItem.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        int expResult = 233;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class InvoiceItem.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        double expResult = 9.99;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }


    /**
     * Test of setQuantity method, of class InvoiceItem.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        instance.setQuantity(quantity);
    }

    /**
     * Test of setPrice method, of class InvoiceItem.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        instance.setPrice(price);
    }

    /**
     * Test of getTotal method, of class InvoiceItem.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int price = 10;
        int quantity = 233;
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        double expResult = 2330;
        double result = instance.getTotal(price, quantity);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of toString method, of class InvoiceItem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        InvoiceItem instance = new InvoiceItem("653","iMad",233,9.99);
        String expResult = "653, iMad, 9.99, 233";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
