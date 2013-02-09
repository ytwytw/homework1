/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j43zhang
 */
public class InvoiceItem {
    
    protected String partNum;
    protected String desc;
    protected int quantity;
    protected double price;

    public InvoiceItem(String partNum, String desc, int quantity, double price) {
         if (quantity < 0){
             throw new IllegalArgumentException("Negative Quantity ERROR");
       }
         if (price < 0){
             throw new IllegalArgumentException("Negative Price ERROR");
       }
        this.partNum = partNum;
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNum() {
        return partNum;
    }

    public String getDesc() {
        return desc;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException ("Negative Quantity");
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException ("Negative Price");
        }
        this.price = price;
    }
    
    public double getTotal(int price, int quantity) {
        int total;
        total = price * quantity;
        return total;
    }
        
        
    @Override
    public String toString() {
        return partNum + ", " + desc + ", " + price + ", " + quantity;
    }
    
}
