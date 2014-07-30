/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.interceptores.interceptores;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author inmaculada.garcia
 */

//La clase extiende de AbstractInterceptor, ya que sólo escribimos el método
//intercept

public class InterceptorAcceso extends AbstractInterceptor {
    
    @Override
    public String intercept(ActionInvocation ai) throws Exception{
        
        String result = Action.LOGIN;
        //Variable que recibe los datos de las acciones que no necesitan un login
        String actionActual=(String)ActionContext.getContext().get(ActionContext.ACTION_NAME);
        
        if(ai.getInvocationContext().getSession().containsKey("usuario")||
                //Se añade al if la excepcion de los actions sin filtrar 
                actionsSinFiltrar.contains(actionActual)){
            result = ai.invoke();
        }
        return result;
    }
    
    //Aplicamos un 'filtro' al interceptor para decir cuáles accesos son libres
    //sin tener que iniciar sesión:
    private String actionsPublicos;
    
    public void setActionsPublicos(String actionsPublicos){
        this.actionsPublicos=actionsPublicos;
    }
    
    //El método anterior recibe una lista de actions (separadas por comas), 
    //determinada por:
    private List<String> actionsSinFiltrar = new ArrayList<String>();
    
    @Override
    public void init(){
        actionsSinFiltrar=Arrays.asList(actionsPublicos.split(","));
    }
}
