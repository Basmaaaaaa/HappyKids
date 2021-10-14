<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'une actualité</h4>
			</div>
			<div class="box-body">
					<form:form method="post"  action="addActualite" modelAttribute="ACTUALITE">
							<div class="box-body">
							<div class="form-group">
								<label>Nom actualité: </label>
								<form:input type="text" class="form-control"  path="nom_actualite" required="true"/>
							</div>
 							<div class="form-group">
								<label>Date actualité: </label>
								<form:input type="date" class="form-control"  path="date_actualite"  required="true"/>
							</div>
							
							<div class="form-group">
								<label>Type actualité: </label>
								<form:input type="text" class="form-control"  path="type_actualite"  required="true"/>
							</div>
							
							<div class="form-group">
								<label>Description: </label>
								<form:textarea type="text" class="form-control"  path="description"  rows="4" required="true"/>
							</div>
							 <div align="right">
									<input type="submit" class="btn btn-success mb-5" value="Valider"> 
							</div>
						</div>	
					</form:form>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
<%@include file="footer.jsp" %>		  
		