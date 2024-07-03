<%@page import="dao.ClassProductoImp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="model.TblProductocl3" %>
    
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de productos</title>
</head>

<body  bgcolor="#c5dec9">
<h1  align="center"> Listado de producto </h1>
<% ClassProductoImp  crud = new  ClassProductoImp();%>

<table  border= "2"  align="center">

<tr>
<td>id</td>
<td>Nombre</td>
<td>precio</td>
<td>Precioven</td>
<td>estado</td>
<td>descrip</td>
</tr>
<%
List<TblProductocl3> Listado=crud.Listadoproducto();

if (Listado!=null) {
	for(TblProductocl3 lis:Listado){
		
		%>
		<tr>
		
		<td> <%=lis.getIdproductoscl3() %></td>
		<td> <%=lis.getNombrecl3() %> </td>
		<td>    <%=lis.getPreciocompcl3() %></td>
		<td> <%=lis.getPrecioventacl3() %></td>
		<td>  <%=lis.getEstadocl3() %></td>
		<td> <%=lis.getDescripcl3() %>
		</tr>
		<% 
	}
	%>
	<% 
}





%>


</table>




</body>
</html>