<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Cliente</title>
</head>
<body>

<h1 align="center">Registrar Cliente </h1>
<form action="ControladorCliente" method="post">
<table align="center">
<tr>
<td>nombre</td>
<td> <input type="text" name="nombre"></td>
</tr>
<tr>
<td>Apellido</td>
<td> <input type="text" name="apellido"></td>
</tr>
<tr>
<td>dni</td>
<td> <input type="text" name="dni"></td>
</tr>
<tr>
<td>Email</td>
<td> <input type="text" name="email"></td>
</tr>
<tr>
<td>Telefono</td>
<td> <input type="text" name="Telefono"></td>
</tr>
<tr>
<td>Sexo</td>
<td> <input type="text" name="Sexo"></td>
</tr>
<tr>
<td>Nacionalidad</td>
<td> <input type="text" name="Nacionalidad"></td>
</tr>
<tr>
<td colspan="2" style ="text-aling:center"> <input type="submit"  value="Registrar"></td>
</tr>
</table>

</form>
</body>
</html>