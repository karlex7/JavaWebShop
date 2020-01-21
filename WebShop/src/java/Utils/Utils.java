/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import DAL.IRepo;
import DAL.RepoFactory;
import Model.BagItem;
import Model.Customer;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author FRIDAY
 */
public class Utils {
    
    public static float calculateTotalSum(List<BagItem> bagItems){
        float sum=0;
        if (bagItems!=null) {
            for (BagItem bagItem : bagItems) {
                sum+=bagItem.getProduct().getPrice()*bagItem.getQuantity();
            }
        }
        return sum;
    }
    public static void createLog(String username,HttpServletRequest request){
        
    }
    public static boolean usernameUnique(String email){
        IRepo repo=RepoFactory.getRepo();
        
        List<Customer> customers=repo.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
    public static Customer getCustomerFromEmail(String emial){
        Customer c=null;
        IRepo repo=RepoFactory.getRepo();
        List<Customer> customers=repo.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getEmail().equals(emial)) {
                return customer;
            }
        }
        c.setFirstName("ime");
        return c;
    }
}
