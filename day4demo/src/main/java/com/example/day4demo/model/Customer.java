
package com.example.day4demo.model;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Customer
{
    @Id
    //@GeneratedValue
    int customerId;
    String customerName;
    String typeOfEvent;
    String theme;
    String mobile_No;
    String date;
    String day;
    int price;
    public Customer()
    {
    }
    public Customer(int customerId, String customerName, String typeOfEvent, String theme, String mobile_No,
            String date, String day, int price) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.typeOfEvent = typeOfEvent;
        this.theme = theme;
        this.mobile_No = mobile_No;
        this.date = date;
        this.day = day;
        this.price = price;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getTypeOfEvent() {
        return typeOfEvent;
    }
    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String getMobile_No() {
        return mobile_No;
    }
    public void setMobile_No(String mobile_No) {
        this.mobile_No = mobile_No;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

