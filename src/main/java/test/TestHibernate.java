/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.sena.domain.User;
import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author FabianCol
 */
public class TestHibernate {

    public static void main(String[] args) {
        String hql = "SELECT p FROM User p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();

        Query query = entityManager.createQuery(hql);
        List<User> users = query.getResultList();
        for (User u : users) {
            System.out.println("Usuario: " + u);
        }
    }
}
