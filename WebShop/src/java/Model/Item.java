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
public class Item {
    private int IDItem;
    private int ProductID;
    private int BillID;
    private int Quantity;

    public Item(int ProductID, int BillID, int Quantity) {
        this.ProductID = ProductID;
        this.BillID = BillID;
        this.Quantity = Quantity;
    }

    public Item(int IDItem, int ProductID, int BillID, int Quantity) {
        this.IDItem = IDItem;
        this.ProductID = ProductID;
        this.BillID = BillID;
        this.Quantity = Quantity;
    }

    public int getIDItem() {
        return IDItem;
    }

    public void setIDItem(int IDItem) {
        this.IDItem = IDItem;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public int getBillID() {
        return BillID;
    }

    public void setBillID(int BillID) {
        this.BillID = BillID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "ProductID=" + ProductID + ", BillID=" + BillID + ", Quantity=" + Quantity + '}';
    }
    
}
