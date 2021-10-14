 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="http://crmx-admin-template.multipurposethemes.com/images/favicon.ico">

    <title>Happy Kids</title>
  
	<!-- Bootstrap 4.0-->
	<link rel="stylesheet" href="<c:url value="/resources/assets/vendor_components/bootstrap/dist/css/bootstrap.min.css" />">		
	<!-- Data Table-->
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/assets/vendor_components/datatable/datatables.min.css" />">		
	
	<!-- Bootstrap extend-->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-extend.css" />">
	
	<!-- Admin main-nav -->
    <link href="<c:url value="/resources/css/main-nav.css" />" rel="stylesheet" >

	<!-- Theme style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/master_style.css" />">	
 

</head>
<body class="layout-top-nav light-skin theme-fruit">
<!-- Site wrapper -->
<div class="wrapper">
	
  <div class="art-bg">
	  <img src="http://crmx-admin-template.multipurposethemes.com/images/art1.svg" alt="" class="art-img light-img">
	  <img src="http://crmx-admin-template.multipurposethemes.com/images/art2.svg" alt="" class="art-img dark-img">
  </div>

  <header class="main-header">
	  <div class="inside-header">
		<!-- Logo -->
		<a href="menu" class="logo">
		  <!-- mini logo 
		  <div class="logo-mini">
			  <span class="light-logo"><img src="<c:url value="/resources/images/blog.png" />" width="60" alt="logo"></span>
			  <span class="dark-logo"><img src="<c:url value="/resources/images/blog.png" />" width="60" alt="logo"></span>
		  </div> 
		  <div class="logo-lg">
			  <span class="light-logo"><img src="<c:url value="/resources/images/blog.png" />" alt="logo"></span>
			  <span class="dark-logo"><img src="<c:url value="/resources/images/blog.png" />" alt="logo"></span>
		  </div>-->
		</a>
		<!-- Header Navbar -->
		<nav class="navbar navbar-static-top">
		  <div>		  
		 

		  </div>

		  <div class="navbar-custom-menu r-side">
			<ul class="nav navbar-nav">
			  <!-- full Screen -->
			  <li class="full-screen-btn">
				<a href="#" data-provide="fullscreen" title="Full Screen">
					<i class="mdi mdi-crop-free"></i>
				</a>
			  </li>			
			  <!-- Messages -->
			  <c:if test="${USER.roleUser=='ROLE_ADMIN'}">
			  <li class="dropdown messages-menu">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" title="Messages">
				  <i class="mdi mdi-email"></i>
				</a>
				<ul class="dropdown-menu animated bounceIn">
		
				  <li class="header">
					<div class="p-20 bg-light">
						<div class="flexbox">
							<div>
								<h4 class="mb-0 mt-0">Messages</h4>
							</div> 
						</div>
					</div>
				  </li>
				  
				  <li>
					<!-- inner menu: contains the actual data -->
					<ul class="menu sm-scrol">
					  <c:forEach var="M" items="${MSGS }">
					  <li><!-- start message -->
						<a href="show?id=${M.id_message }">
						  <div class="pull-left">
							<img src="<c:url value="/resources/msg.png" />" class="rounded-circle" alt="User Image">
						  </div>
						  <div class="mail-contnet">
							 <h4>
							  ${M.userr.nom } ${M.userr.prenom }<br>
							  <p>${M.date_envoie }</p>
							 </h4>
							 <span>${M.sujet }</span>
						  </div>
						</a>
					  </li>
				 	  <!-- end message -->
					    </c:forEach> 
					</ul>
				  </li> 
				</ul>
			  </li>
	 		</c:if>
			  <!-- User Account-->
			  <li class="dropdown user user-menu">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" title="User">
				  <img src="<c:url value="/resources/images/web2.png" />" class="user-image rounded-circle" alt="User Image">
				</a>
				<ul class="dropdown-menu animated flipInX">
				  <!-- User image -->
				  <li class="user-header bg-img" style="background-image: url(images/user-info.jpg)" data-overlay="3">
					  <div class="flexbox align-self-center">					  
						<img src="<c:url value="/resources/images/web2.png" />" class="float-left rounded-circle" alt="User Image">					  
						<h4 class="user-name align-self-center">
						  <span>Bonjour</span>
						  <small>${USER.nom } ${USER.prenom }</small>
						</h4>
					  </div>
				  </li>
				  <!-- Menu Body -->
				  <li class="user-body">
						<a class="dropdown-item" href="javascript:void(0)"><i class="ion ion-person"></i> Mon Profil</a>
						 <div class="dropdown-divider"></div>
						<a class="dropdown-item" href='j_spring_security_logout'><i class="ion-log-out"></i> Déconnecter</a>
						<div class="dropdown-divider"></div> 
				  </li>
				</ul>
			  </li>	 
		 

			</ul>
		  </div>
		</nav>
  	  </div>
  </header>
  
  <nav class="main-nav" role="navigation">

	  <!-- Mobile menu toggle button (hamburger/x icon) -->
	  <input id="main-menu-state" type="checkbox" />
	  <label class="main-menu-btn" for="main-menu-state">
		<span class="main-menu-btn-icon"></span> Toggle main menu visibility
	  </label>

	  <!-- Sample menu definition -->
	  <ul id="main-menu" class="sm sm-blue">
	  
	   
		  <sec:authorize access="hasAnyRole('ROLE_ADMIN')">
	  <li><a href="#"><i class="ti-layout-grid2 mx-5"></i>Gestion Utilisateurs </a>			
		  <ul>
		  
			
			<li><a href="#">Parents</a>
			  <ul>
				<li><a href="ajoutParent">Ajout Parent</a></li>
				<li><a href="listParents">List Parents</a></li> 
			  </ul>			  
			</li>
			<li><a href="#">Enseignants</a>
			  <ul>
				<li><a href="ajoutEnseignant">Ajout Ensiegnant</a></li>
            	<li><a href="listEnseignants">Liste Enseignants</a></li> 
			  </ul>			  
			</li>
			<li><a href="#">Médecins</a>
			  <ul>
				<li><a href="ajoutMedecin">Ajout Médecin</a></li>
				<li><a href="listMedecins">List Médecins</a></li> 
			  </ul>			  
			</li>
		  </ul>		  
		</li>
	   
	   
	   <li><a href="#"><i class="fa fa-user mx-5"></i>Gestion Elèves</a>
			  <ul>
				<li><a href="ajoutEleve">Ajout Elève</a></li>
				<li><a href="listEleves">Liste Eleves</a></li> 
			  </ul>			  
			</li>
		
		<li><a href="#"><i class="ti-files mx-5"></i>Gestion Actualités</a>
			<ul>
				<li><a href="ajoutActualite">Ajout d'un actualité</a></li>
            	<li><a href="listActualites">Liste des actualités</a></li>
			</ul>
		</li>
		
		
		 <li><a href="#"><i class="ti-files mx-5"></i>Gestion des Groupes</a>
			<ul>
				<li><a href="ajoutGroupe">Ajout d'un Groupe </a></li>
            	<li><a href="listGroupes">Liste des Groupes</a></li>
			</ul>
		</li>
		<li><a href="#"><i class="ti-files mx-5"></i>Gestion Paiement</a>
			<ul>
				<li><a href="ajoutPaiement">Ajout d'un paiement</a></li>
            	<li><a href="listPaiement">Liste des paiements</a></li>
			</ul>
		</li>
		
		
		</sec:authorize>
		<sec:authorize access="hasAnyRole('ROLE_MEDECIN')">
		 <li><a href="#"><i class="ti-files mx-5"></i>Gestion des visites médical</a>
			<ul>
				<li><a href="ajoutVisite">Ajout d'une visite </a></li>
            	<li><a href="listVisites">Liste des visites</a></li>
			</ul>
		</li>
		</sec:authorize>
		
		<sec:authorize access="hasAnyRole('ROLE_ENSEIGNANT')">
		<li><a href="#"><i class="ti-files mx-5"></i>Gestion des Activités</a>
			<ul>
				<li><a href="ajoutActivite">Ajout d'une Activité </a></li>
            	<li><a href="listActivites">Liste des Activités</a></li>
			</ul>
		</li>
		
		<li><a href="#"><i class="ti-files mx-5"></i>Gestion des Observations</a>
			<ul>
				<li><a href="ajoutObservation">Ajout d'une Observation </a></li>
            	<li><a href="listObservations">Liste des Observations</a></li>
			</ul>
		</li>
		</sec:authorize>
	  </ul>
	</nav>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
	  <div class="container-full">
		<!-- Content Header (Page header) -->
		<div class="content-header">
			<div class="d-flex align-items-center">
				<div class="mr-auto">
					<h3 class="page-title">Happy Kids</h3> 
				</div> 
			</div>
		</div>

		<!-- Main content -->
		<section class="content">
		  <!-- Default box -->
		  
		 