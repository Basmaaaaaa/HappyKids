<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'un Elève</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="addEleve">
							<div class="box-body">
							<div class="form-group">
								<label>QrCode : </label>
								<input type="text" class="form-control"  name="qr" required="true">
							</div>
							<div class="form-group">
								<label>Nom : </label>
								<input type="text" class="form-control"  name="nom" required="true">
							</div>
							
							<div class="form-group">
								<label>Prénom : </label>
								<input type="text" class="form-control"  name="prenom"  required="true">
							</div>
							<div class="form-group">
								<label>Date de naissance : </label>
								<input type="date" class="form-control"  name="date_naissance"  required="true">
							</div>
							<div class="form-group">
								<label>Type Sanguin : </label>
								<input type="text" class="form-control"  name="typeS"  required="true">
							</div>
							<div class="form-group">
								  <label>Groupe</label>
								  <select class="form-control" name="groupe" >
								  		<option value="">Choisir Groupe</option> 
									 <c:forEach var="G" items="${LG}">
									 		<option value="${G.id_groupe}">${G.nom_groupe }</option> 
									 </c:forEach>
								  </select>
							</div>
							<div class="form-group">
								  <label>Parent</label>
								  <select class="form-control" name="parent">
								  <option value="">Choisir Parent</option>
										 <c:forEach var="P" items="${LP}">
									 		<option value="${P.id}">${P.nom} ${P.prenom}</option> 
									 </c:forEach>
								  </select>
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
		