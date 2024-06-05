/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.dao;

import com.sena.domain.User;
import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author FabianCol
 */
public class UserDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDAO() {
        emf = Persistence.createEntityManagerFactory("HibernateEjemplo2");
        em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM User p";
        Query query = em.createQuery(hql);
        List<User> listUsers = query.getResultList();
        for (User u : listUsers) {
            System.out.println("Usuario DAO: " + u);
        }
    }

    public void insertar(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public User consultarUserID (User user){
    return em.find(User.class, user.getIdUser());
    }
    
    public void modificar(User user){
       try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
    }
}
