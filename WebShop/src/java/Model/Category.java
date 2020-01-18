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
public class Category {
 private int IDCategory;
 private String Title;

    public Category(String Title) {
        this.Title = Title;
    }

    public Category(int IDCategory, String Title) {
        this.IDCategory = IDCategory;
        this.Title = Title;
    }
 
 

    public int getIDCategory() {
        return IDCategory;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public String toString() {
        return Title;
    }

    
}
