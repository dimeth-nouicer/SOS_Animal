/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
    
    
}
