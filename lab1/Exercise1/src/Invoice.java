import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author j43zhang
 */

public class Invoice {
    public int id;
    protected static int SN = 1;
    public int counter = 0;
    protected ArrayList <RefundItem> ItemRefund = new ArrayList(); 
    protected ArrayList <InvoiceItem> ItemInvoice = new ArrayList();
    

    public Invoice() {
        id = SN;
        SN = SN + 1;
    }
    
    public void add(InvoiceItem item) {
        ItemInvoice.add(item);
        counter = counter + 1;
    }
 
    public void Refund(RefundItem item) {
        ItemRefund.add(item);
        counter = counter - 1;
    }

    public double getTotal() {
        int i;
        double temp = 0.0;
        for(i = 0 ; i < counter; i++) {
            temp = temp + ItemInvoice.get(i).getQuantity()*ItemInvoice.get(i).getPrice();
        }
        return temp;
    }

    public double getRefundTotal() {
        int i;
        double temp = 0;
        for(i = 0 ; i < counter ; i++){
            temp = temp + ItemInvoice.get(i).getQuantity()*ItemInvoice.get(i).getPrice()*(-1);
        }
        return temp;
    }

    public int getNumItems() {
        return id;
    }

    public String getItem(int i) {
        if (i< 0){
            throw new IllegalArgumentException("ITEM CAN'T BE NEGATIVE");
        }
        else if (i == 0) {
            return ("ITEM CAN'T BE ZERO!");
        }
        else {
            return ItemInvoice.get(i).toString();
        }
    }
}

