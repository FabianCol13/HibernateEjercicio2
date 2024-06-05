/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.sena.dao.UserDAO;
import com.sena.domain.User;

/**
 *
 * @author FabianCol
 */
public class OperacionesJPA {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        userDAO.listar();
        /*
        User user = new User();
        user.setNameUser("Maria");
        user.setLastnameUser("Gonzales");
        user.setPhoneUser("3224559876");
        user.setEmailUser("marialabandida@mail.com");
        
        userDAO.insertar(user);
        */
        /*
        User user = new User();
        user.setIdUser(3);
        user = userDAO.consultarUserID(user);
        System.out.println("Persona encontrada: " +user);
        user.setNameUser("Maria");
        //user.setLastnameUser("Gonzales");
        //user.setPhoneUser("3224559876");
        user.setEmailUser("marialabandid@mail.com");
        
        userDAO.modificar(user);
*/
        
        User user = new User();
        user.setIdUser(3);
        user = userDAO.consultarUserID(user);
        System.out.println("Persona a eliminar: " +user);
        userDAO.eliminar(user);
        userDAO.listar();

    }
    
}
