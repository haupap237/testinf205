/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;

import com.opensymphony.xwork2.ActionSupport;
import entity.Registration;
import java.util.List;

/**
 *
 * @author Kai Nguyen
 */
public class SearchLikeAction extends ActionSupport {
    private String nameSearch;
    private List<Registration> list;
    public SearchLikeAction() {
    }
    
    public String execute() throws Exception {
         RegisterDaoHibernate regis = new RegisterDaoHibernate();
         list=regis.searchLikeLastname(nameSearch);
        return "success";
    }

    public String getNameSearch() {
        return nameSearch;
    }

    public void setNameSearch(String nameSearch) {
        this.nameSearch = nameSearch;
    }

    public List<Registration> getList() {
        return list;
    }

    public void setList(List<Registration> list) {
        this.list = list;
    }
    
    
}
