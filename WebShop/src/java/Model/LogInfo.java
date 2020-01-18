/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author FRIDAY
 */
public class LogInfo {
    private int IDLogInfo;
    private int CustomerID;
    private Date LogDate;
    private String IPAdress;

    public LogInfo(int CustomerID, Date LogDate, String IPAdress) {
        this.CustomerID = CustomerID;
        this.LogDate = LogDate;
        this.IPAdress = IPAdress;
    }

    public LogInfo(int IDLogInfo, int CustomerID, Date LogDate, String IPAdress) {
        this.IDLogInfo = IDLogInfo;
        this.CustomerID = CustomerID;
        this.LogDate = LogDate;
        this.IPAdress = IPAdress;
    }

    public int getIDLogInfo() {
        return IDLogInfo;
    }

    public void setIDLogInfo(int IDLogInfo) {
        this.IDLogInfo = IDLogInfo;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public Date getLogDate() {
        return LogDate;
    }

    public void setLogDate(Date LogDate) {
        this.LogDate = LogDate;
    }

    public String getIPAdress() {
        return IPAdress;
    }

    public void setIPAdress(String IPAdress) {
        this.IPAdress = IPAdress;
    }

    @Override
    public String toString() {
        return "LogInfo{" + "CustomerID=" + CustomerID + ", LogDate=" + LogDate + ", IPAdress=" + IPAdress + '}';
    }
    
}
