<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification des sanctions</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/popper.js/1.16.0/umd/popper.min.js"></script>
 <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script> 
  
  <script>
  $( function() {
    $( "#datepicker1" ).datepicker();
    $( "#datepicker2" ).datepicker();
    $( "#datepicker3" ).datepicker();
  } );
  </script>
  
</head>
<body>
<h2>Formulaire de modification des sanctions</h2>


<form:form action="update"  modelAttribute="conges">

<form:hidden path="refConges" ></form:hidden><br>

<form:label path="employeweb">NomEmployé</form:label>
<form:input path="employeweb" /><br>

<form:label  path="dateDebut">Départ</form:label>

<form:input type="date" path="dateDebut" id="datepicker1" /><br>

<form:label path="dateFin">Retour</form:label>
<form:input type="date"  path="dateFin"  id="datepicker2" /><br>

<form:label path="dateDemande">Date de demande</form:label>
<form:input type="date"  path="dateDemande"  id="datepicker3" /><br>

<form:label path="soldeConges">Solde restant</form:label>
<form:input path="soldeConges" /><br>

<input type="submit" value="Valider">
</form:form>

<div class="jumbotron text-center"
		style="margin-bottom: 0; margin-top: 300px">
		<p>By Yoshette 2021</p>
	</div>

</body>
</html>