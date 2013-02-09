/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j43zhang
 */

public class RefundItem extends InvoiceItem {
    
    public RefundItem (String partNum, String desc, int quantity, double price){
        super(partNum, desc, quantity, price);
    }
 
    public String getpartnumber(){
        return partNum;
    }
    
    public String getpartdescription(){
        return desc; 
    }
    
    public int getquantity(){
        return quantity;
    
    }
    
    public double getprice(){
        return price;
    }
 
@Override 

public void setQuantity(int quantities){
    if (quantities < 0){
        throw new IllegalArgumentException("Negative Quantity ERROR");
    }
    quantity = quantities;
}
 
public double getTotal(){
    if (quantity < 0 || price < 0){
        throw new IllegalArgumentException("Negative Quantity/Price ERROR");
    }
    return quantity*price*(-1);
}
    
@Override
public String toString(){
    return partNum +","+ desc +","+ quantity +","+ price;
}

}  

