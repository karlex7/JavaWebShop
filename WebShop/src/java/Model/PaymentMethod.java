/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FRIDAY
 */
public class PaymentMethod {
    private int IDPaymentMethod;
    private String PaymentMethodName;

    public PaymentMethod(String PaymentMethodName) {
        this.PaymentMethodName = PaymentMethodName;
    }

    public PaymentMethod(int IDPaymentMethod, String PaymentMethodName) {
        this.IDPaymentMethod = IDPaymentMethod;
        this.PaymentMethodName = PaymentMethodName;
    }

    public int getIDPaymentMethod() {
        return IDPaymentMethod;
    }

    public void setIDPaymentMethod(int IDPaymentMethod) {
        this.IDPaymentMethod = IDPaymentMethod;
    }

    public String getPaymentMethodName() {
        return PaymentMethodName;
    }

    public void setPaymentMethodName(String PaymentMethodName) {
        this.PaymentMethodName = PaymentMethodName;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" + "PaymentMethodName=" + PaymentMethodName + '}';
    }
    
    
    
}
