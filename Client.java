package com.mycompany.lasttime;

import java.util.regex.Pattern;
public class Client {
    private String fullName;
    private String phoneNumber;
    private String gmail;
    private String city;
    private String messege;
    private boolean f;
    
    {
        messege = "";
        fullName = "";
        phoneNumber = "";
        gmail = "";
        city = "";
        f = true;
    }
    
    public Client(String fullName,String phoneNumber,String gmail){
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setGmail(gmail);
    }
    
     public Client(String fullName,String phoneNumber,String gmail,String city){
        setFullName(fullName);
        setPhoneNumber(phoneNumber);
        setGmail(gmail);
        setCity(city);
    }

    public String getFullName() {
        return fullName.trim();
    }

    public void setFullName(String fullName) {
        if(!(fullName.isEmpty()|| fullName.trim().length()<10)){
        this.fullName = fullName;
        }
        else {
            messege += "Full Name is invalid\n";
        }
    }
    public String getPhoneNumber() {
        return phoneNumber.trim();
    }
    //phoneNumber.length()==11
//Pattern.matches("((\\+201)|(201)|(010))[0125]\\d{8}$",phoneNumber.trim())
    public void setPhoneNumber(String phoneNumber) {
        if(Pattern.matches("((\\+201)|(201)|(010))[0125]\\d{8}$",phoneNumber.trim())){
        this.phoneNumber = phoneNumber;}
        else
        {
             messege += "Phone Number is invalid\n";
             f = false;

        }
    }

    public String getGmail() {
        return gmail.trim();
    }

    public void setGmail(String gmail) {
        if( Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,6}\\.[a-z]{3,6}$",gmail.trim().toLowerCase())){
        this.gmail = gmail;
    }
        else{
             messege += "Gmail invalid\n";
             f = false;
        }
    }

    public String getCity() {
        return city.trim();
    }

    public void setCity(String city) {
        if(!(city.trim().length() > 20 || city.trim().length() < 3))
        this.city = city;
         else{
             messege += "City invalid\n";
             f = false;
        }
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    
    public boolean flag(){
        
    return f;
    }

     
}
