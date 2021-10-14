<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'un Enseignant</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="addEnseignant">
							<div class="box-body">
							<div class="form-group">
								<label>Nom : </label>
								<input type="text" class="form-control"  name="nom" required="true">
							</div>
								<div class="form-group">
								<label>Prénom : </label>
								<input type="text" class="form-control"  name="prenom"  required="true">
							</div>
								<div class="form-group">
								<label>Adresse: </label>
								<input type="text" class="form-control"  name="adresse"  required="true">
							</div>
							<div class="form-group">
								<label>Numéro télephone : </label>
								<input type="text" class="form-control"  name="tel" name="numTel" pattern="[0-9]{8}" title="8 chiffres" required="true"> 
							</div>   
							<div class="form-group">
								<label>Spécialité: </label>
								<input type="text" class="form-control"  name="spec"  required="true">
							</div>
							<div class="form-group">
								  <label>Groupe</label>
								  <select class="form-control" path="groupe">
								  <option value="">Choisir un groupe</option> 
										 <c:forEach var="G" items="${LG}">
									 		<option value="${G.id_groupe}">${G.nom_groupe} </option> 
									 </c:forEach>
								  </select>
							</div>
							<div class="form-group">
								<label>Login : </label>
								<input type="text" class="form-control"  name="login"  required="true">
							</div>
							<div class="form-group">
								<label>Mot de passe : </label>
								<input type="password" class="form-control"  name="pass"  name="mdp" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  required="true">
							</div>
							 <div align="right">
									<input type="submit" class="btn btn-success mb-5" value="Valider"> 
							</div>
						</div>	
					</form>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div>
<%@include file="footer.jsp" %>		  
		