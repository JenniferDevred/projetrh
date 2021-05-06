<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification données des employés</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
 <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script> 
</head>
<body>
<h2>Formulaire de modification d'employé</h2>


<form:form action="update"  modelAttribute="employeweb">

<form:hidden path="code" ></form:hidden><br>

<form:label path="salaire">Salaire</form:label>
<form:input path="salaire" /><br>

<form:label path="numtel">Numero de tel</form:label>
<form:input path="numtel" /><br>

<form:label path="nom">Nom</form:label>
<form:input path="nom" /><br>

<form:label path="prenom">Prenom</form:label>
<form:input path="prenom" /><br>

<form:label path="adresse">Adresse</form:label>
<form:input path="adresse" /><br>

<input type="submit" value="Valider">
</form:form>

<div class="jumbotron text-center"
		style="margin-bottom: 0; margin-top: 300px">
		<p>By Yoshette 2021</p>
	</div>

</body>
</html>