/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marti
 */
public class User {
    
    public String userCode;
    private String userPassword;
    public String firstName;
    public String secondName;    
    public Address address;  
    
    public String GetPassword(){return userPassword;}
    public void SetPassword(String newPass){userPassword = newPass;};
    public void ShowUserUi(){};
}
