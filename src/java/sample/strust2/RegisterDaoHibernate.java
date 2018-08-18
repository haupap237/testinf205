/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.strust2;


import entity.Registration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poly.util.HibernateUtil;

/**
 *
 * @author Kai Nguyen
 */
public class RegisterDaoHibernate {
    private Session session;
    public RegisterDaoHibernate(){
        SessionFactory factory = HibernateUtil.getSessionFactory();
        this.session=factory.getCurrentSession();
    }
    public boolean insert(Registration account){
        try{
            session.getTransaction().begin();
            session.save(account);
            session.flush();
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public Registration checkLogin(String username, String password){
        try{
            session.getTransaction().begin();
            String sql="from Registration where Username = ? and Password = ?";
            Query query = session.createQuery(sql);
            query.setString(0, username);
            query.setString(1, password);
            
            Registration result = (Registration)query.uniqueResult();
            session.flush();
            session.getTransaction().commit();
            return  result;
        }catch(Exception e){
            if(session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return null;                
    }
    public List<Registration> searchLikeLastname(String username){
        try{
            List<Registration> resultList = null;
            session.getTransaction().begin();
            String sql="from Registration where username like ?";
            Query query = session.createQuery(sql);
            query.setString(0, "%" + username + "%");
            resultList = query.list();
            session.flush();
            session.getTransaction().commit();
            return resultList;
        }catch(Exception e){
            if(session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean update(Registration newAcc, String id){
        try{
            session.getTransaction().begin();
            Registration acc = (Registration) session.get(Registration.class, id);
            acc.setLastname(newAcc.getLastname());
            acc.setUsername(newAcc.getUsername());
            acc.setPassword(newAcc.getPassword());
            acc.setIsAdmin(newAcc.getIsAdmin());
            session.update(acc);
            session.flush();
            session.getTransaction().commit();
            return true;
        }catch(Exception e){
            if(session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            e.printStackTrace();
            return false;
        }
    }
        public boolean delete(String username){
       try{
           session.getTransaction().begin();
           session.delete(session.get(Registration.class,username));
           session.flush();
           session.getTransaction().commit();
           return true;
       }catch(Exception e){
           if(session.getTransaction().isActive()){
               session.getTransaction().rollback();
           }
           e.printStackTrace();
           return false;
       } 
    }
    
}
