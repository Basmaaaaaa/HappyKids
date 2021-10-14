<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Modification d'une Activité</h4>
	</div>
	<div class="box-body">
		<form:form method="post" action="editActivite" modelAttribute="ACTIVITE">
			<div class="box-body">
				<form:input type="hidden" path="idActivite" value="${AC.idActivite}"/>
				<input type="hidden"    name="idG"   value="${AC.groupe.id_groupe }">
				<div class="form-group">
					<label>Nom : </label> <form:input type="text"
						class="form-control" path="nom"  value="${AC.nom}" 
						required="true"/>
				</div>
				<div class="form-group">
								<label>Date : </label>
								<form:input type="date" class="form-control"  path="dateActivite"  value="${AC.dateActivite}"   required="true"/>
							</div>
			<div class="form-group">
					<label>Description : </label> <textarea type="text"
						class="form-control" name="desc"   rows="4"
						required="true">${AC.description}</textarea>
				</div>
				
				 
				<div align="right">
					<input type="submit" class="btn btn-success mb-5"
						value="Enregistrer">
				</div>
			</div>
		</form:form>
	</div>
	<!-- /.box-body -->
	<div class="box-footer"></div>
	<!-- /.box-footer-->
</div>
<%@include file="footer.jsp"%>
