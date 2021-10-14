
<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Modification d'un Paiement</h4>
	</div>
	<div class="box-body">
		<form method="post" action="editPaiement">
			<div class="box-body">
				<input type="hidden" name="id" value="${INFOP.num_paiement }">

				<div class="form-group">
					<label>Eleve</label> <select class="form-control" name="eleve">
						<c:forEach var="E" items="${LE}">
							<option value="${E.qr_code}"
								${INFOP.eleve.qr_code == E.qr_code ? 'selected' : ' '}>${E.nomEleve}
								${E.prenomEleve}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label>Mois : </label> <input type="text" class="form-control"
						name="mois" value="${INFOP.mois}" required="true">
				</div>
				<div class="form-group">
					<label>Année : </label> <input type="text" class="form-control"
						name="annee" value="${INFOP.annee}" required="true">
				</div>
				<div class="form-group">
					<label>Montant : </label> <input type="text" class="form-control"
						name="montant" value="${INFOP.montant}" required="true">
				</div>
				<div class="form-group">
					<label>Remarque: </label> <input type="text" class="form-control"
						name="remarques" value="${INFOP.remarque}" required="true">
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
