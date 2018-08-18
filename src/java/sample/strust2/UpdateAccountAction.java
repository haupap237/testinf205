/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;

import entity.Registration;

/**
 *
 * @author Kai Nguyen
 */
public class UpdateAccountAction {
    private String username;
    private String password;
    private String lastname;
    private boolean isAdmin;
    public UpdateAccountAction() {
    }
    
    public String update() throws Exception {
        RegisterDaoHibernate regis = new RegisterDaoHibernate();
        Registration acc = new Registration(username, password, lastname, isAdmin);
        boolean result = regis.update(acc, username);
        
        if(result){
            return "success";
        }
        return "fail";
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
   

    
    
}
