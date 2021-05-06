<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un employe</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
 <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script> 

<div class="jumbotron text-center" style="margin-bottom: 0">
	<h1>Syst�me d'information de gestion des ressources humaines</h1>

</div>

</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

		<!-- Brand -->
		<a class="navbar-brand" href="#">AFPA</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">Accueil</a></li>


			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Employ�s</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addEmp">Ajouter</a> <a
						class="dropdown-item" href="modifyEmp">Modifier</a> <a
						class="dropdown-item" href="deleteEmp">Supprimer</a> <a
						class="dropdown-item" href="listEmp">Consulter</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Absences</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addAbs">Ajouter</a> <a
						class="dropdown-item" href="editAbs">Modifier</a> <a
						class="dropdown-item" href="deleteAbs">Supprimer</a> <a
						class="dropdown-item" href="listAbs">Consulter</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Sanctions</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addDis">Ajouter</a> <a
						class="dropdown-item" href="modifyDis">Modifier</a> <a
						class="dropdown-item" href="deleteDis">Supprimer</a> <a
						class="dropdown-item" href="listDis">Consulter</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Cong�s</a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="addHol">Ajouter</a> <a
						class="dropdown-item" href="modifyHol">Modifier</a> <a
						class="dropdown-item" href="deleteHol">Supprimer</a> <a
						class="dropdown-item" href="listHol">Consulter</a>
				</div></li>


		</ul>
	</nav>

	<div class="container-fluid" style="margin-top: 20px">
		<div class="row">
			<div class="col-sm-4 bg-secondary">
				<hr class="d-sm-none">
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>


<h2>Formulaire d'ajout des employes</h2>

<form:form action="saveEmp"  modelAttribute="employeweb">

<form:label path="code">Code</form:label>
<form:input path="code" /><br>

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