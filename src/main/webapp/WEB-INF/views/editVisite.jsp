<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Modification d'une visite</h4>
	</div>
	<div class="box-body">
		<form method="post" action="editVisite">
			<div class="box-body">
				<input type="hidden" name="id" value="${VM.id_visite}">
			</div>
			<div class="form-group">
				<label>Eleve</label> <select class="form-control" name="eleve">
					<c:forEach var="E" items="${LE}">
						<option value="${E.qr_code}"
							${VM.eleve.qr_code == E.qr_code ? 'selected' : ' '}>${E.nomEleve}
							${E.prenomEleve}</option>
					</c:forEach>
				</select>
			</div>
			

			<div class="form-group">
				<label>Taille: </label> <input type="text" class="form-control"
					name="taille" value="${VM.taille}" required="true">
			</div>

			

			<div class="form-group">
				<label>Poid: </label> <input type="text" class="form-control"
					name="poid" value="${VM.poids}" required="true">
			</div>
				

			<div class="form-group">
				<label>Remarque: </label> <input type="text" class="form-control"
					name="remarque" value="${VM.remarques}" required="true">
			</div>

		


			<div align="right">
				<input type="submit" class="btn btn-success mb-5"
					value="Enregistrer">
			</div>
	</div>
	</form>
</div>
<!-- /.box-body -->
<div class="box-footer"></div>
<!-- /.box-footer-->
</div>
<%@include file="footer.jsp"%>
