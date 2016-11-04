/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenn.user;

import java.io.Serializable;

public class User implements Serializable {

    private String fname;
    private String lname;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String username;
    private String password;
    
    public User() {
        fname = "";
        lname = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipcode = "";
        email = "";
    }
    
    public User(String fname, String lname, String phone, String address,
            String city, String state, String zipcode, String email,
            String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
    public String getFirstName() {
        return fname;
    }
    
    public void setFirstName(String fname) {
        this.fname = fname;
    }
        
    public String getLastName() {
        return lname;
    }
    
    public void setLastName(String lname) {
        this.lname = lname;
    }    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }  
        
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
        
    public String getZipcode() {
        return zipcode;
    }
    
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}