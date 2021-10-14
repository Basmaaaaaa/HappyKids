<%@include file="header.jsp" %> 
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'une visite</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="addVisite">
							<div class="box-body">
						<div class="form-group">
								  <label>Eleve</label>
								  <select class="form-control" name="eleve">
								  <option value="">Choisir un élève</option> 
										 <c:forEach var="E" items="${LE}">
									 		<option value="${E.qr_code}">${E.nomEleve}${E.prenomEleve}</option> 
									 </c:forEach>
								  </select>
							</div>
							 
								
								<div class="form-group">
								<label>Taille: </label>
								<input type="text" class="form-control"  name="taille"  required="true">
							</div>
							<div class="form-group">
								<label>Poids: </label>
								<input type="text" class="form-control"  name="poid"  required="true"> 
							</div>  
							  
							
							<div class="form-group">
								<label>Remarque : </label>
								<textarea type="text" class="form-control" rows="4" name="remarque"  required="true"></textarea>
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
		