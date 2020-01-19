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
public class Product {
    private int IDProduct;
    private String Title;
    private String Brand;
    private String About;
    private float Price;
    private String Img;
    private int CategoryID;

    public Product(String Title, String Brand, String About, float Price, String Img, int CategoryID) {
        this.Title = Title;
        this.Brand = Brand;
        this.About = About;
        this.Price = Price;
        this.Img = Img;
        this.CategoryID = CategoryID;
    }
    
    public Product(int IDProduct, String Title, String Brand, String About, float Price, String Img, int CategoryID) {
        this.IDProduct = IDProduct;
        this.Title = Title;
        this.Brand = Brand;
        this.About = About;
        this.Price = Price;
        this.Img = Img;
        this.CategoryID = CategoryID;
    }

    public int getIDProduct() {
        return IDProduct;
    }

    public void setIDProduct(int IDProduct) {
        this.IDProduct = IDProduct;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    @Override
    public String toString() {
        return "Product{" + "Title=" + Title + ", Brand=" + Brand + ", About=" + About + ", Price=" + Price + ", Img=" + Img + ", CategoryID=" + CategoryID + '}';
    }
    
}
