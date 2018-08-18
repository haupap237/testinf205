/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;

import com.opensymphony.xwork2.ActionContext;
import entity.Registration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kai Nguyen
 */
public class LoginAction {
    private String username;
    private String password;
    public LoginAction() {
    }
    
    public String login() throws Exception {
       RegisterDaoHibernate regis = new RegisterDaoHibernate();       
        Registration result = null;
        result = regis.checkLogin(username, password);
//        List<Registration> rg = new ArrayList<Registration>();
//        RegisterDaoHibernate res = null;
                if(result !=null){
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
    
    
    
}
