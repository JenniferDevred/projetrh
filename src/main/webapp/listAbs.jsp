<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulter la liste des absences</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>
<script
	src="webjars/bootstrap-datepicker/jar/1.9.0/bootstrap-datepicker.min.js"></script>
</head>
<body>

	<input type="text" class="form-control datepicker"
		placeholder="sélectionnez une date">

	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>


	<script>
		;(function($){
$.fn.datepicker.dates['fr'] = {
				days : [ "dimanche", "lundi", "mardi", "mercredi", "jeudi",
						"vendredi", "samedi" ],
				daysShort : [ "dim.", "lun.", "mar.", "mer.", "jeu.", "ven.",
						"sam." ],
				daysMin : [ "d", "l", "ma", "me", "j", "v", "s" ],
				months : [ "janvier", "février", "mars", "avril", "mai",
						"juin", "juillet", "août", "septembre", "octobre",
						"novembre", "décembre" ],
				monthsShort : [ "janv.", "févr.", "mars", "avril", "mai",
						"juin", "juil.", "août", "sept.", "oct.", "nov.",
						"déc." ],
				today : "Aujourd'hui",
				monthsTitle : "Mois",
				clear : "Effacer",
				weekStart : 1,
				format : "dd/mm/yyyy"
			};
		}(jQuery));

		$('.datepicker').datepicker({
			language : 'fr',
			autoclose : true,
			todayHighlight : true
		})
	</script>

	<table id="table 1">
		<caption>Liste des absences</caption>
		<thead title="Liste des absences employés">
			<tr>
				<th>idabsence</th>
				<th>employeweb</th>
				<th>nbjours</th>
				<th>motif</th>
				<th>justicatif</th>
				<th>suppression</th>
				<th>modification</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="a" items="${abs}">
				<tr>
					<td>${a.idabsence}</td>
					<td>${a.employeweb.nom}</td>
					<td>${a.nbjours}</td>
					<td>${a.motif}</td>
					<td>${a.justicatif}</td>
					<td><a href="deleteAbs?id=${a.idabsence}">Supprimer</a></td>
					<td><a href="editAbs?id=${a.idabsence}">Editer</a></td>
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