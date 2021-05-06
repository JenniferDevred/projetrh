<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulter la liste des employés</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container-fluid">
		<h2>Liste des employés</h2>
		
		<table class="table table-light" border="3">
			<thead>
				<tr>
					<th>Code Employé</th>
					<th>Salaire</th>
					<th>Tél</th>
					<th>Nom</th>
					<th>Prénom</th>
					<th>Adresse</th>
					<th>Suppression</th>
					<th>Modification</th>
				</tr>
			</thead>
			<tbody>
				
					<c:forEach var="e" items="${emp}">
				<tr>
					<td>${e.code}</td>
					<td>${e.salaire}</td>
					<td>${e.numtel}</td>
					<td>${e.nom}</td>
					<td>${e.prenom}</td>
					<td>${e.adresse}</td>
					<td><a href="deleteEmp?code=${e.code}">Supprimer</a></td>
					<td><a href="modifyEmp?code=${e.code}">Editer</a></td>
				</tr>
			</c:forEach>
				
			
			</tbody>
		</table>
	</div>



	<div class="jumbotron text-center"
		style="margin-bottom: 0; margin-top: 300px">
		<p>By Yoshette 2021</p>
	</div>

</body>
</html>