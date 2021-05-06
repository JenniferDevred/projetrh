<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Accueil</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarScroll">
      <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown"  data-bs-toggle="dropdown" aria-expanded="false" >
            Congés
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
           <a class="dropdown-item" href="addHol">Ajouter</a>
           <a class="dropdown-item" href="modifyHol">Modifier</a>
           <a class="dropdown-item" href="deleteHol">Supprimer</a>
           <a class="dropdown-item" href="listHol">Consultation congés</a>
          </div>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Link</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Rechercher</button>
      </form>
    </div>
  </div>
</nav>



<a href="addEmp"> Ajouter employé</a><br>
<a href="modifyEmp"> Modifier employé</a><br>
<a href="deleteEmp"> Supprimer employé</a><br>
<a href="listEmp"> Liste des employés</a><br><br>

<a href="addAbs">Ajouter des absences</a><br>
<a href="editAbs">Modifier des absences</a><br>
<a href="deleteAbs">Modifier des absences</a><br>
<a href="showAbs"> Liste des absences employés</a><br><br>

<a href="addDis">Ajouter des sanctions</a><br>
<a href="modifyDis"> Modifier sanction</a><br>
<a href="deleteDis"> Supprimer sanction</a><br>
<a href="listDis"> Liste des sanctions</a><br><br>

<a href="addHol">Ajouter des congés</a><br>
<a href="modifyHol"> Modifier congés</a><br>
<a href="deleteHol"> Supprimer congés</a><br>
<a href="listHol"> Consultation congés</a><br><br>

</body>
</html>