<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'un Medecin</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="editMedecin">
							<div class="box-body">
							<input type="hidden" name="id"  value="${INFOM.id }" >
							<div class="form-group">
								<label>Nom : </label>
								<input type="text" class="form-control"  name="nom" value="${INFOM.nom }"  required="true">
							</div>

							<div class="form-group">
								<label>Prénom : </label>
								<input type="text" class="form-control" name="prenom" value="${INFOM.prenom }"  required="true">
							</div>
							<div class="form-group">
								<label>Adresse: </label>
								<input type="text" class="form-control" name="adresse" value="${INFOM.adresse }"  required="true">
							</div>
							<div class="form-group">
								<label>Numero télephone : </label>
								<input type="text" class="form-control" name="numtel" pattern="[0-9]{8}" title="8 chiffres" value="${INFOM.numTel }"  required="true">
							</div>
							<div class="form-group">
								<label>Login : </label>
								<input type="text" class="form-control"  name="login" value="${INFOM.login }"  required="true">
							</div>
							<div class="form-group">
								<label>Mot de passe : </label>
								<input type="password" class="form-control"  name="pass"  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" value="${INFOM.motdepasse }"  required="true">
							</div>
							
						 <div align="right">
								<input type="submit" class="btn btn-success mb-5" value="Enregistrer"> 
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
		