<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Ajout d'un Paiement</h4>
	</div>
	<div class="box-body">
		<form method="post" action="addPaiement">

			<div class="form-group">
				<label>Eleve</label> <select class="form-control" name="eleve" required="">
					<option value="">Choisir un élève</option>
					<c:forEach var="E" items="${LE}">
						<option value="${E.qr_code}">${E.nomEleve}
							${E.prenomEleve}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label>Mois : </label> <input type="text" class="form-control"
					name="mois" required="true">
			</div>
			<div class="form-group">
				<label>Année : </label> <input type="text" class="form-control"
					name="annee" required="true">
			</div>
			<div class="form-group">
				<label>Montant: </label> <input type="text" class="form-control"
					name="montant" required="true">
			</div>
			<div class="form-group">
				<label>Remarque: </label> <input type="text" class="form-control"
					name="remarque" required="true">
			</div>


			<div align="right">
				<input type="submit" class="btn btn-success mb-5" value="Vaider">
			</div>
	</div>
	</form>
</div>
<!-- /.box-body -->
<div class="box-footer"></div>
<!-- /.box-footer-->
</div>
<%@include file="footer.jsp"%>
