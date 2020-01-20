/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

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
}
