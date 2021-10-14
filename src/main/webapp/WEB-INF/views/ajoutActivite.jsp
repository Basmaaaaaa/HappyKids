<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'une Activité</h4>
			</div>
			<div class="box-body">
					<form:form method="post"  action="addActivite" modelAttribute="ACTIVITE">
							<div class="box-body">
							<input type="hidden"    name="idG"   value="${GR }">
							
							<div class="form-group">
								<label>Nom : </label>
								<form:input type="text" class="form-control"  path="nom"    required="true"/>
							</div>
							<div class="form-group">
								<label>Date : </label>
								<form:input type="date" class="form-control"  path="dateActivite"    required="true"/>
							</div>
							 
							
								<div class="form-group">
								<label>Description : </label>
								<form:textarea type="text" class="form-control" rows="4" path="description"  required="true"/>
							</div>
						 
							
							 <div align="right">
									<input type="submit" class="btn btn-success mb-5" value="Valider"/> 
							</div>
						</div>	
					</form:form>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div>
<%@include file="footer.jsp" %>		  
		