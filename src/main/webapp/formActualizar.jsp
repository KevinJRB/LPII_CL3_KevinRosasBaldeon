<%@page import="model.TblProductocl3"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Actualizar Producto</h1>
<form action="controladorproducto" method="post"><%
//TblProductocl3 codigo=(TblProductocl3)request.getAttribute("codigo");
String cod=request.getAttribute("codigo").toString();
String nom=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
String precioco=(request.getAttribute("preciocomp")!=null)?request.getAttribute("preciocomp").toString():"";
String preciove = (request.getAttribute("preciove") != null)?request.getAttribute("preciove").toString():"";
String estado = (request.getAttribute("estado") != null)?request.getAttribute("estado").toString():"";
String descrip =(request.getAttribute("descrip") != null)?request.getAttribute("descrip").toString():"";







%>
<table align="center" borde="2">

<tr>
<td>
<input type="text" name="codigo"  value="<%=cod%>">
</td>
</tr>

<tr>
<td>nombre</td>
<td><input type="text"  name="nombre"   value="<%=nom%>"></td>
</tr>

<tr>
<td>precio</td>
<td><input type="text"  name="preciocomp"   value="<%=precioco%>"></td>
</tr>


<tr>
<td>precioven</td>
<td><input type="text"  name="precioven"   value="<%=preciove%>"></td>
</tr>


<tr>
<td>estado</td>
<td><input type="text"  name="estado"   value="<%=estado%>"></td>
</tr>


<tr>
<td>descripcion</td>
<td><input type="text"  name="descrip"   value="<%=descrip%>"></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit"  value="Actualizar Producto"></td>
</tr>











</table>
</form>
</body>
</html>