/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.domain;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 *
 * @author FabianCol
 */
@Entity
@Table(name="users")
public class User implements Serializable{
 
@Column(name="idUser")
@Id
private int idUser;

private String nameUser;
private String lastnameUser;
private String phoneUser;
private String emailUser;


public User(){}

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", lastnameUser='" + lastnameUser + '\'' +
                ", phoneUser='" + phoneUser + '\'' +
                ", emailUser='" + emailUser + '\'' +
                '}';
    }
}
