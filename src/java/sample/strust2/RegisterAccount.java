/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ValidationAware;
import com.opensymphony.xwork2.validator.annotations.Validation;
import entity.Registration;
import java.io.Serializable;
import java.util.Map;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author Kai Nguyen
 */

public class RegisterAccount extends ActionSupport implements Serializable{
    private String username;
    private String password;
    private String lastname;
    private boolean isAdmin;
    
    public RegisterAccount() {
    }
    
    public String execute() throws Exception {
        RegisterDaoHibernate regis = new RegisterDaoHibernate();
        Registration acc = new Registration(username, password, lastname, isAdmin);
        boolean result = regis.insert(acc);
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
