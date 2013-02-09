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
public class InvoiceTest {
    
    public InvoiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        InvoiceItem item = new InvoiceItem("653","iMad",233,9.99);
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
     * Test of add method, of class Invoice.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        InvoiceItem item = new InvoiceItem("653","iMad",233,9.99);
        Invoice instance = new Invoice();
        instance.add(item);
    }

    /**
     * Test of Refund method, of class Invoice.
     */
    @Test
    public void testRefund() {
        System.out.println("Refund");
        RefundItem item = new RefundItem("653","iMad",233,9.99);
        Invoice instance = new Invoice();
        instance.Refund(item);
    }

    /**
     * Test of getTotal method, of class Invoice.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Invoice instance = new Invoice();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRefundTotal method, of class Invoice.
     */
    @Test
    public void testGetRefundTotal() {
        System.out.println("getRefundTotal");
        Invoice instance = new Invoice();
        double expResult = 0.0;
        double result = instance.getRefundTotal();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getNumItems method, of class Invoice.
     */
    @Test
    public void testGetNumItems() {
        System.out.println("getNumItems");
        Invoice instance = new Invoice();
        int expResult = 5;
        int result = instance.getNumItems();
        assertEquals(expResult, result);
    }
    
    /**
     *
     */
    @Test
    public void TestAnException() {
        System.out.println("TestAnException");
        InvoiceItem item = new InvoiceItem("653","iMad",-233,9.99);
        Invoice instance2 = new Invoice();
        double number = instance2.getTotal();
        
    }
    
    @Test
    public void TestTwoException() {
        System.out.println("TestAnException");
        InvoiceItem item = new InvoiceItem("653","iMad",233,-9.99);
        Invoice instance2 = new Invoice();
        double number = instance2.getTotal();
        
    }
    
    
}
