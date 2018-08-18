/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;

/**
 *
 * @author Kai Nguyen
 */
public class DeleteAccountAction {
    private String username;
    public DeleteAccountAction() {
    }
    
    public String execute() throws Exception {
        RegisterDaoHibernate regis = new RegisterDaoHibernate();
        boolean result = regis.delete(username);
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
    
    
}
