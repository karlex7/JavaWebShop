/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.*;
import java.util.List;

/**
 *
 * @author FRIDAY
 */
public interface IRepo {
    //-------------CUSTOMER--------------
    void insertCustomer(Customer c);
    List<Customer> getAllCustomers();
    Customer getCustomer(int id);
    boolean checkCustomer(String email, String password);
    //-------------CATEGORY--------------
    List<Category> getAllCategory();
    //-------------PRODUCT---------------
    List<Product> getAllProducts();
    Product getProduct(int id);
    //----------PAYMENT-METHOD-----------
    List<PaymentMethod> getAllPaymentMethods();
    //---------------BILL----------------
    List<Bill> getAllBills();
    void insertBill(Bill b);
    Bill getBill(int id);
    List<Bill> getBillsForCustomer(int id);
    //---------------ITEM----------------
    List<Item> getItemsForBill(int id);
    void insertItem(Item i);
    //-------------LOG-ITEM--------------
    List<LogInfo> getAllLogInfos();
    void insertLogInfo(LogInfo logInfo);
}
