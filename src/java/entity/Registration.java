package entity;
// Generated Aug 14, 2017 10:51:51 AM by Hibernate Tools 4.3.1



/**
 * Registration generated by hbm2java
 */
public class Registration  implements java.io.Serializable {


     private String username;
     private String password;
     private String lastname;
     private Boolean isAdmin;
     

    public Registration() {
    }

    public Registration(String username, String password, String lastname, Boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.lastname = lastname;
        this.isAdmin = isAdmin;
    }

	
    

   
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
  




}


