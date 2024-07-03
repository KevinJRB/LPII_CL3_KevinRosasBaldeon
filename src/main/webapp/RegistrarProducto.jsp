<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resgistrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Resgista Producto</h1>

<form   action="controladorproducto" method="post">
<table   border="2"  align="center">

<tr>
<td>nombre</td>
<td><input type="text"  name="nombre"></td>
</tr>

<tr>
<td>precio</td>
<td><input type="text"  name="preciocomp"></td>
</tr>


<tr>
<td>precioven</td>
<td><input type="text"  name="precioventa"></td>
</tr>


<tr>
<td>estado</td>
<td><input type="text"  name="estado"></td>
</tr>


<tr>
<td>descripcion</td>
<td><input type="text"  name="descripcion"></td>
</tr>

<tr>
<td colspan="2"   align="center">

<input type="submit" value="Registrar Producto"
>



</td>

</tr>



</table>

</form>
</body>
</html>