<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Modification d'une observation</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="editObservation">
							<div class="box-body">
							<input type="hidden" name="id"  value="${OB.idObservation}" >
							</div>

							<div class="form-group">
								<label>Message : </label>
								<input type="text" class="form-control"  name="message" value="${OB.message}"  required="true">
							</div>
						 
							
								<div class="form-group">
								  <label>Eleve</label>
								  <select class="form-control" name="eleve">
										 <c:forEach var="E" items="${LE}">
									 		<option value="${E.qr_code}"
									 		${OB.eleve.qr_code == E.qr_code ? 'selected' : ' '} >${E.nomEleve} ${E.prenomEleve}</option> 
									 </c:forEach>
								  </select>
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
		