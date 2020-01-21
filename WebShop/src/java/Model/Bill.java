/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author FRIDAY
 */
public class Bill {
    private int IDBill;
    private Date BillDate;
    private int CustomerID;
    private int PaymentMethodID;

    public Bill(Date BillDate, int CustomerID, int PaymentMethodID) {
        this.BillDate = BillDate;
        this.CustomerID = CustomerID;
        this.PaymentMethodID = PaymentMethodID;
    }

    public Bill(int IDBill, Date BillDate, int CustomerID, int PaymentMethodID) {
        this.IDBill = IDBill;
        this.BillDate = BillDate;
        this.CustomerID = CustomerID;
        this.PaymentMethodID = PaymentMethodID;
    }

    public int getIDBill() {
        return IDBill;
    }

    public void setIDBill(int IDBill) {
        this.IDBill = IDBill;
    }

    public Date getBillDate() {
        return BillDate;
    }

    public void setBillDate(Date BillDate) {
        this.BillDate = BillDate;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public int getPaymentMethodID() {
        return PaymentMethodID;
    }

    public void setPaymentMethodID(int PaymentMethodID) {
        this.PaymentMethodID = PaymentMethodID;
    }
    
    public String toStringBill(){
        String s="";
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(BillDate);
        
        String year=String.valueOf(calendar.get(Calendar.YEAR));
        String month=String.valueOf(calendar.get(Calendar.MONTH));
        String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        
        s=year+"-"+month+"-"+day;
        
        return s;
    }


    @Override
    public String toString() {
        return "Bill{" + "BillDate=" + BillDate + ", CustomerID=" + CustomerID + ", PaymentMethodID=" + PaymentMethodID + '}';
    }
    
    
}
