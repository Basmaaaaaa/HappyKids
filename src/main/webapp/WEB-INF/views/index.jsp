 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<!DOCTYPE html>
<html lang="en">

<!-- Mirrored from crmx-admin-template.multipurposethemes.com/main-horizontal-ltr/pages/auth_login2.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 08 Mar 2019 12:34:32 GMT -->
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
	
	<!-- Bootstrap extend-->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-extend.css" />">
	
	<!-- Theme style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/master_style.css" />">

	<!-- CrmX Admin skins -->
	<link rel="stylesheet" href="<c:url value="/resources/css/skin-color.css" />">	
 

</head>
<body class="hold-transition theme-fruit bg-img" style="background-image: url(<c:url value="/resources/images/auth-bg/bg.jpg" />)" data-overlay="3">
	
	<div class="auth-2-outer row align-items-center h-p100 m-0">
		<div class="auth-2 bg-gradient-fruit">
		  <div class="auth-logo font-size-30">
		  	  <img src="<c:url value="/resources/images/blog.png" />"  width="120" alt="" ><br>
			<a href="#" class="text-white"><b>Happy</b>Kids</a>
		  </div>
		  <!-- /.login-logo -->
		  <div class="auth-body">
			<p class="auth-msg text-white-50">Connexion</p>
				<c:if test="${not empty error}">
					<div class="alert alert-danger" role="alert">${error }</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="alert alert-primary" role="alert">${msg }</div>
				</c:if>
			
			<form action='j_spring_security_check' method="post" class="form-element">
			  <div class="form-group has-feedback">
				<input type="text" class="form-control text-white plc-white" name="j_username" placeholder="Username">
				<span class="ion ion-email form-control-feedback text-white"></span>
			  </div>
			  <div class="form-group has-feedback">
				<input type="password" class="form-control text-white plc-white" name="j_password" placeholder="Mot de passe">
				<span class="ion ion-locked form-control-feedback text-white"></span>
			  </div>
			  <div class="row"> 
				<!-- /.col -->
				<div class="col-12 text-center">
				  <button type="submit" class="btn btn-rounded mt-10 btn-success">Se Connecter</button>
				</div>
				<!-- /.col -->
			  </div>
			</form>

		 
		  </div>
		</div>
	
	</div>
	

	<!-- jQuery 3 -->
	<script src="<c:url value="/resources/assets/vendor_components/jquery-3.3.1/jquery-3.3.1.js" />"></script>
	
	<!-- fullscreen -->
	<script src="<c:url value="/resources/assets/vendor_components/screenfull/screenfull.js" />"></script>
	
	<!-- popper -->
	<script src="<c:url value="/resources/assets/vendor_components/popper/dist/popper.min.js" />"></script>
	
	<!-- Bootstrap 4.0-->
	<script src="<c:url value="/resources/assets/vendor_components/bootstrap/dist/js/bootstrap.min.js" />"></script>

</body>

 </html>
