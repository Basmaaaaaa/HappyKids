<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Modification d'un Parent</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="editParent">
						<div class="box-body">
							<input type="hidden" name="id"  value="${INFOP.id}" >
							<div class="form-group">
								<label>Nom : </label>
								<input type="text" class="form-control"  name="nom" value="${INFOP.nom}" required="true">
							</div>
								<div class="form-group">
								<label>Prénom : </label>
								<input type="text" class="form-control"  name="prenom" value="${INFOP.prenom}"   required="true">
							</div>
								<div class="form-group">
								<label>Adresse: </label>
								<input type="text" class="form-control"  name="adresse" value="${INFOP.adresse }"   required="true">
							</div>
							<div class="form-group">
								<label>Numéro télephone : </label>
								<input type="text" class="form-control"  name="numTel" pattern="[0-9]{8}" title="8 chiffres" value="${INFOP.numTel}"   required="true"> 
							</div>  
							<div class="form-group">
								<label>Numero télephone2: </label>
								<input type="text" class="form-control"  name="numTel2" value="${INFOP.num_tel2}" pattern="[0-9]{8}" title="8 chiffres"  required="true">
							</div>
							<div class="form-group">
								<label>Login : </label>
								<input type="text" class="form-control"  name="login" value="${INFOP.login}"   required="true">
							</div>
							<div class="form-group">
								<label>Mot de passe : </label>
								<input type="password" class="form-control"  name="mdp" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" value="${INFOP.motdepasse}"   required="true">
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
		