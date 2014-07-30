/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.interceptores.interceptores;

//Interfaz que nos va a permitir crear nuestro propio interceptor:
import com.opensymphony.xwork2.interceptor.Interceptor;
//Importamos el resto de interfaces necesarias para el desarrollo del interceptor:
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author inmaculada.garcia
 */

//Creamos el interceptor, con los tres métodos que por defecto tienen todos los
//interceptores. init y destroy se quedarán tal cual están, pero se añadrián 
//las órdenes oportunas en el método intercept.
public class InterceptorSaludo implements Interceptor {
    
    @Override
    public void destroy(){
        
    }
    
    @Override
    public void init(){
        
    }
    
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception{
        //Escribimos un saludo:
        System.out.println("Buenos días");
        
        //El nombre del action que se está ejecutando se obtiene de la siguiente forma:
        String actionName=(String)ActionContext.getContext().get(ActionContext.ACTION_NAME);
        
        //Para obtener la fecha y la hora actual:
        String tiempoActual=DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM).format(new Date());
        
        //Impresión de la información anterior por pantalla:
        System.out.println("Ejecutando la acción "+actionName+" a las "+tiempoActual);
        
        //Ahora, determinamos lo que devuelve el método: el nombre del result, por lo que se hace por medio de
        //return actionInvocation.invoke();
        
        //Si queremos realizar un proceso después de que el Action se haya terminado de ejecutar, debemos
        //almacenar el valor regresado por la llamada invoke, y realizar post-procesamiento después.
        //Para ello comento (elimino) el return anterior y lo cambio por lo siguiente:
        String resultado = actionInvocation.invoke();
        System.out.println("Gracias por todo ;P");
        
        return resultado;
    }
}
