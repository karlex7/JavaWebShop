/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Bill;
import Model.Category;
import Model.Customer;
import Model.Item;
import Model.LogInfo;
import Model.PaymentMethod;
import Model.Product;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import java.util.Date;

/**
 *
 * @author FRIDAY
 */
public class DBRepo implements IRepo{
    private static final String INSERT_CUSTOMER="{ CALL  INSERT_CUSTOMER (?,?,?,?,?)}";
    private static final String GET_ALL_CUSTOMERS="{ CALL  GET_ALL_CUSTOMERS ()}";
    private static final String GET_CUSTOMER="{ CALL  GET_CUSTOMER (?)}";
    
    private static final String GET_ALL_CATEGORY="{ CALL  GET_ALL_CATEGORY ()}";
    
    private static final String GET_ALL_PRODUCTS="{ CALL  GET_ALL_PRODUCTS ()}";
    private static final String GET_PRODUCT="{ CALL  GET_PRODUCT (?)}";
    
    private static final String GET_ALL_PAYMENT_METHODS="{ CALL  GET_ALL_PAYMENT_METHODS ()}";
    
    private static final String GET_ALL_BILLS="{ CALL  GET_ALL_BILLS ()}";
    private static final String INSERT_BILL="{ CALL  INSERT_BILL (?,?,?)}";
    private static final String GET_BILL="{ CALL  GET_BILL (?)}";
    
    private static final String GET_ITEMS_FOR_BILL="{ CALL  GET_ITEMS_FOR_BILL (?)}";
    private static final String INSERT_ITEM="{ CALL  INSERT_ITEM (?,?,?)}";
    
    private static final String GET_ALL_LOGINFO="{ CALL  GET_ALL_LOGINFO ()}";
    private static final String INSERT_LOGINFO="{ CALL  INSERT_LOGINFO (?,?,?)}";
    

    @Override
    public void insertCustomer(Customer c) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(INSERT_CUSTOMER)){
                stmt.setString(1, c.getFirstName());
                stmt.setString(2, c.getLastName());
                stmt.setString(3, c.getAdress());
                stmt.setString(4, c.getEmail());
                stmt.setString(5, c.getCustomerPassword());
                
                stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_CUSTOMERS);
            ResultSet resultSet=stmt.executeQuery()){
            
            while (resultSet.next()) {
                customers.add(
                new Customer(
                        resultSet.getInt("IDCustomer"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Adress"),
                        resultSet.getString("Email"),
                        resultSet.getString("CustomerPassword")
                ));
            }
            return customers;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return customers;
    }

    @Override
    public Customer getCustomer(int id) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_CUSTOMER)){
            stmt.setInt(1, id);
            try (ResultSet resultSet=stmt.executeQuery()){
                if (resultSet.next()) {
                    return new Customer(
                        resultSet.getInt("IDCustomer"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("Adress"),
                        resultSet.getString("Email"),
                        resultSet.getString("CustomerPassword")
                );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> getAllCategory() {
        List<Category> categorys=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_CATEGORY);
            ResultSet resultSet=stmt.executeQuery()){
            while (resultSet.next()) {
                categorys.add(
                        new Category( 
                                resultSet.getInt("IDCategory"),
                                resultSet.getString("Title")
                        ));
            }
            return categorys;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return categorys;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_PRODUCTS);
            ResultSet resultSet=stmt.executeQuery()){
            while (resultSet.next()) {
                products.add(
                        new Product(
                                resultSet.getInt("IDProduct"),
                                resultSet.getString("Title"), 
                                resultSet.getString("Brand"), 
                                resultSet.getString("About"), 
                                resultSet.getFloat("Price"),
                                resultSet.getString("Img"), 
                                resultSet.getInt("CatgoryID"))
                );
            }
            return products;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return products;
    }

    @Override
    public Product getProduct(int id) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_PRODUCT);){
            stmt.setInt(1, id);
            try (ResultSet resultSet=stmt.executeQuery()){
                 if (resultSet.next()){
                return new Product(
                        resultSet.getInt("IDProduct"),
                        resultSet.getString("Title"), 
                        resultSet.getString("Brand"), 
                        resultSet.getString("About"), 
                        resultSet.getFloat("Price"),
                        resultSet.getString("Img"), 
                        resultSet.getInt("CatgoryID"));
            }} catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<PaymentMethod> getAllPaymentMethods() {
        List<PaymentMethod> paymentMethods=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_PAYMENT_METHODS);
            ResultSet resultSet=stmt.executeQuery()){
            while (resultSet.next()) {
                paymentMethods.add(
                        new PaymentMethod(
                                resultSet.getInt("IDPaymentMethod"), 
                                resultSet.getString("PaymentMethodName"))
                );
            }
            return paymentMethods;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paymentMethods;
    }

    @Override
    public List<Bill> getAllBills() {
        List<Bill> bills=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_BILLS);
            ResultSet resultSet=stmt.executeQuery()){
            while (resultSet.next()) {
                bills.add(
                        new Bill(
                                resultSet.getInt("IDBill"), 
                                resultSet.getDate("BillDate"), 
                                resultSet.getInt("CustomerID"), 
                                resultSet.getInt("PaymentMethodID"))
                );
            }
            return bills;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bills;
    }

    @Override
    public void insertBill(Bill b) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(INSERT_BILL)){
                stmt.setDate(1, (java.sql.Date) b.getBillDate());
                stmt.setInt(2, b.getCustomerID());
                stmt.setInt(3, b.getPaymentMethodID());
                
                stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Bill getBill(int id) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_BILL)){
            stmt.setInt(1, id);
            try (ResultSet resultSet=stmt.executeQuery()){
                return new Bill(
                        resultSet.getInt("IDBill"), 
                        resultSet.getDate("BillDate"), 
                        resultSet.getInt("CustomerID"), 
                        resultSet.getInt("PaymentMethodID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Item> getItemsForBill(int id) {
        List<Item> items=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ITEMS_FOR_BILL)){
            stmt.setInt(1, id);
            try (ResultSet resultSet=stmt.executeQuery()){
                while (resultSet.next()) {
                    items.add(
                            new Item(
                                    resultSet.getInt("IDItem"), 
                                    resultSet.getInt("ProductID"), 
                                    resultSet.getInt("BillID"), 
                                    resultSet.getInt("Quantity"))
                    );
                }
                return items;
            } catch (Exception e) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void insertItem(Item i) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(INSERT_ITEM)){
                stmt.setInt(1, i.getProductID());
                stmt.setInt(2, i.getBillID());
                stmt.setInt(3, i.getQuantity());
                
                stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<LogInfo> getAllLogInfos() {
        List<LogInfo> logInfos=new ArrayList<>();
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(GET_ALL_LOGINFO);
            ResultSet resultSet=stmt.executeQuery()){
            while (resultSet.next()) {
                logInfos.add(
                        new LogInfo(
                                resultSet.getInt("IDLogInfo"), 
                                resultSet.getInt("CustomerID"), 
                                resultSet.getDate("LogDate"), 
                                resultSet.getString("IPAdress"))
                );
            }
            return logInfos;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logInfos;
    }

    @Override
    public void insertLogInfo(LogInfo logInfo) {
        DataSource dataSource=DataSourceSingleton.getInstance();
        try (Connection con=dataSource.getConnection();
            CallableStatement stmt=con.prepareCall(INSERT_LOGINFO)){
                stmt.setInt(1, logInfo.getCustomerID());
                stmt.setDate(2, (java.sql.Date) logInfo.getLogDate());
                stmt.setString(3, logInfo.getIPAdress());
                
                stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
