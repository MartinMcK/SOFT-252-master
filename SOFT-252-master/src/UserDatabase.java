/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marti
 */

import java.util.*;

public class UserDatabase
{
    public static UserDatabase instance;
            
        public UserDatabase()
        {
            instance = this;
        }
        public static UserDatabase GetInstance()
        {
            return instance;
        }
    
        public ArrayList<User> users = new ArrayList<User>();
        public ArrayList<User> pendingUsers = new ArrayList<User>();
        
        
        public String TryLogin(String code, String password)
        {
            for(int i = 0; i < users.size(); i++)
            {
                User tryUser = users.get(i);
                if(tryUser.userCode.equalsIgnoreCase(code))
                {
                    if(tryUser.GetPassword().equals(password))
                    {
                        return tryUser.userCode;
                    }
                }                
            }
            System.out.println("CANNOT FIND USER (" + code + " , " + password + ")");
            return "";
        }
        public void CreateAccount()
        {
            
        }
        
        public void CreatePatient()
        {
            UserPatient newPatient = new UserPatient();
            newPatient.userCode = "P6969";
            newPatient.SetPassword("123");
            newPatient.firstName = "John";
            newPatient.secondName = "Smith";            
            users.add(newPatient);
            users.get(0).ShowUserUi();
        }
        
        public void CreatePlaceholderUsers()
        {
            CreatePatient();
        
            
        }
}
