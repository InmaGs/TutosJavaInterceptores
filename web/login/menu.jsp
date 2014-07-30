<%-- 
    Document   : menu
    Created on : 30-jul-2014, 11:27:04
    Author     : inmaculada.garcia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio Login</title>
    </head>
    <body>
        <h1>Página de menú</h1>
        <p>
            Escoge tu opción:
        <ul>
            <li><s:a action="protegido">Action Protegido</s:a></li>
            <li><s:a action="publico">Action Público</s:a></li>
        </ul>
        </p>
        <p>
            <a href="../inicio.jsp">Inicio</a>
        </p>
    </body>
</html>
