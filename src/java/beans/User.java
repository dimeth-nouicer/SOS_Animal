/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import database.Db_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class User {
    private String id;
    private String password;
    private String email;
    private boolean isAdmin;
    private int searchAnimal;
    private int searchProp;
    private int hasAnimal;
    
    public User(){
        this.id="";
        this.password="";
        this.email="";
        this.isAdmin=false;
        this.searchAnimal=0;
        this.searchProp=0;
        this.hasAnimal=0;
        
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public int getSearchAnimal() {
        return searchAnimal;
    }

    public int getSearchProp() {
        return searchProp;
    }

    public int getHasAnimal() {
        return hasAnimal;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setSearchAnimal(int searchAnimal) {
        this.searchAnimal = searchAnimal;
    }

    public void setSearchProp(int searchProp) {
        this.searchProp = searchProp;
    }

    public void setHasAnimal(int hasAnimal) {
        this.hasAnimal = hasAnimal;
    }
    
    public static boolean LoginUser(String email,String password) 
    {
            boolean check =false;
            try 
            {      
                Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
                
                PreparedStatement ps1 =myconnection.prepareStatement("select * from users where email=? and password=?");

                ps1.setString(1, email);
                ps1.setString(2, password);
                ResultSet rs1 =ps1.executeQuery();
                check = rs1.next();

                myconnection.close();        
            }catch(Exception e){e.printStackTrace();}
            
            return check;    
    }
    
    
    public void GetUser()
    {
            try 
            {      
                Db_Connection dbconn=new Db_Connection();
                Connection myconnection= dbconn.Connection();
                
                String sqlString = "SELECT * FROM users WHERE username = '"+id+"'";
                Statement myStatement = myconnection.createStatement();
                ResultSet rs=myStatement.executeQuery(sqlString);

                while(rs.next())
                {
                    id= rs.getString("id");
                    password = rs.getString("password");
                    email= rs.getString("email");
                    //isAdmin = rs.getString("");
                }
                
                myStatement.close();
                myconnection.close();
                
            } catch (SQLException ex) {Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);} 
            
    }
}
