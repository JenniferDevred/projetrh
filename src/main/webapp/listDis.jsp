<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulter la liste des sanctions</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
 <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script> 

</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">

		<!-- Brand -->
		<a class="navbar-brand" href="#">AFPA</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">Accueil</a></li>


			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Employés</a>
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
				class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Congés</a>
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

<table id="table 1" border="3">
	<caption>Liste des sanctions</caption>
		<thead title="Liste des sanctions employés">
			<tr>
				<th>Référence</th>
				<th>Nom employé</th>
				<th>Description</th>
				<th>Type sanction</th>
				<th>Suppression</th>
				<th>Modification</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach  var="s" items="${sc}">
				<tr>
					<td>${s.refSanction}</td>
					<td>${s.employeweb.nom}</td>
					<td>${s.description}</td>
					<td>${s.typeSanction}</td>
					<td><a href="delete?id=${s.refSanction}">Supprimer</a></td>
					<td><a href="edit?id=${s.refSanction}">Editer</a></td>
				</tr>
			</c:forEach>

		</tbody>
		
	
	</table>
	
	<div class="jumbotron text-center"
		style="margin-bottom: 0; margin-top: 300px">
		<p>By Yoshette 2021</p>
	</div>

</body>
</html>