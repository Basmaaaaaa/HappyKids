<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Modification d'une actualité</h4>
			</div>
			<div class="box-body">
					<form:form method="post"  action="editActualite" modelAttribute="ACTUALITE">
							<div class="box-body">
							<form:input type="hidden" path="id_actualite"  value="${INFOA.id_actualite}"/>
							<div class="form-group">
								<label>Nom actualité: </label>
								<form:input type="text" class="form-control" path="nom_actualite" value="${INFOA.nom_actualite}" required="true"/>
							</div>
 
							<div class="form-group">
								<label>Date actualité: </label>
								<form:input type="date" class="form-control"  path="date_actualite" value="${INFOA.date_actualite}" required="true"/>
							</div>
							<div class="form-group">
								<label>Type actualité: </label>
								<form:input type="text" class="form-control" path="type_actualite" value="${INFOA.type_actualite}"  required="true"/>
							</div>
							<div class="form-group">
								<label>Description: </label>
								<textarea type="text" class="form-control" name="desc" rows="5"   required="true">${INFOA.description}</textarea>
							</div>
							 <div align="right">
									<input type="submit" class="btn btn-success mb-5" value="Enregistrer"> 
							</div>
						</div>	
					</form:form>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
<%@include file="footer.jsp" %>		  
		