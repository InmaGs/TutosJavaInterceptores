<%-- 
    Document   : index
    Created on : 29-jul-2014, 14:04:30
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parametros</title>
    </head>
    <body>
        <h1>Ejercicio 1</h1>
        <p>
            Formulario para parámetros.<br/>
            <!-- Para declarar la subida de archivos es necesario declarar la página 
                como multipart/form-data-->
            <s:form action="carga-archivo" enctype="multipart/form-data">
                <s:file name="archivo" label="Archivo"/>
                <s:submit value="Enviar"/>
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
