<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'une Observation</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="addObservation">
							<div class="box-body">
							
							<div class="form-group">
								  <label>Eleve</label>
								  <select class="form-control" name="eleve">
								   <option value="">Choisir un élève</option>
									 <c:forEach var="E" items="${LE}">
									 		<option value="${E.qr_code}">${E.nomEleve} ${E.prenomEleve}</option> 
									 </c:forEach>
								  </select>
							</div>
							
							<div class="form-group">
								<label>Message : </label>
								<input type="text" class="form-control"  name="message" required="true">
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
		