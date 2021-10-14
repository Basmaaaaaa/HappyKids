<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Modification d'un eleve</h4>
	</div>
	<div class="box-body">
		<form method="post" action="editEleve">
			<div class="box-body">
				<input type="hidden" name="qr" value="${El.qr_code}">
				<div class="form-group">
					<label>Nom : </label> <input type="text" class="form-control" name="nom"
						value="${El.nomEleve}"  required="true">
				</div>

				<div class="form-group">
					<label>Prénom : </label> <input type="text" class="form-control" name="prenom"
						value="${El.prenomEleve}"  required="true">
				</div>
				<div class="form-group">
					<label>Date de naissance : </label> <input type="date" name="date_naissance"
						class="form-control" value="${El.date_naissance}" required="true">
				</div>
				<div class="form-group">
								<label>Type Sanguin : </label>
								<input type="text" class="form-control"  name="typeS" value="${El.typeSanguin}"  >
							</div>
				<div class="form-group">
					<label>Groupe</label> <select class="form-control" name="groupe">
						<c:forEach var="G" items="${LG}">
							<option value="${G.id_groupe}"
								${El.groupe.id_groupe == G.id_groupe ? 'selected' : ' '}>${G.nom_groupe }</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label>Parent</label> <select class="form-control" name="parent">
						<c:forEach var="P" items="${LP}">
							<option value="${P.id}" ${El.parent.id == P.id ? 'selected' : ' '}>${P.nom}${P.prenom}</option>
						</c:forEach>
					</select>
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
