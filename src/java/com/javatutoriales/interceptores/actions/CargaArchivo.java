/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javatutoriales.interceptores.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;

/**
 *
 * @author inmaculada.garcia
 */
public class CargaArchivo extends ActionSupport{
    
    //Declaramos dos parámetros, uno para almacenar el archivo cargado y otro 
    // para contener el tipo de archivo.
    private File archivo;
    private String archivoContentType;
    
    //Declaramos el set de los dos objetos y el get del Content:
    
    public void setFile(File archivo){
        this.archivo=archivo;
    }
    
    public void setArchivoContentType(String archivoContentType){
        this.archivoContentType=archivoContentType;
    }
    
    public String getArchivoContentType(){
        return archivoContentType;
    }
    
    //Método execute:
    @Override
    public String execute() throws Exception{
        return SUCCESS;
    }
    
}
