/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Creamos la clase que nos va a permitir loggearnos para acceder a la página.
//El usuario lo aportamos como String, pero se podría hacer de otra forma.
package com.javatutoriales.interceptores.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author inmaculada.garcia
 */
public class LoginAction extends ActionSupport {
    
    //Variables necesarias para el usuario:
    private String username, password;
    
    //Métodos set para almacenar el nombre de usuario y contraseña:
    public void setUsername(String username){
        this.username=username;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
    //Agregamos al usuario la sesión. En principio habría que comparar con una base 
    //de datos o algo así.
    @Override
    public String execute() throws Exception{
        
        HttpServletRequest request=ServletActionContext.getRequest();
        HttpSession sesion = request.getSession();
        
        sesion.setAttribute("usuario", username);
        
        return SUCCESS;
    }
}
