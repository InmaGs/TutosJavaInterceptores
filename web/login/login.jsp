<%-- 
    Document   : login
    Created on : 30-jul-2014, 11:27:14
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
        <h1>Página de Login</h1>
        <p>
            <s:actionerror/>
            <s:form action="login">
                <s:textfield name="username" label="Username"/>
                <s:password name="password" label="Password"/>
                <s:submit value="Ingresar"/>
            </s:form>
        </p>
        <p>
            <a href="../index.jsp">Inicio</a>
        </p>
    </body>
</html>
