<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Liste des paiements</h4>
	</div>
	<div class="box-body">
		<c:if test="${not empty msg}">
			<div class="alert alert-primary" role="alert">${msg }</div>
		</c:if>
		<br>
		<table id="complex_header"
			class="table table-striped table-bordered display"
			style="width: 100%">
			<thead>
				<tr>

					<th>Mois</th>
					<th>annee</th>
					<th>montant</th>
					<th>remarque</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Pa" items="${PAIEMENT}">
					<tr>

						<th>${Pa.mois}</th>
						<th>${Pa.annee}</th>
						<th><span class="badge badge-info">${Pa.montant}</span></th>
						<th>${Pa.remarque}</th>

						<td>
						
		<a href="showPaiement?id=${Pa.num_paiement}">
		<span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
					</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>

					<th>mois</th>
					<th>annee</th>
					<th>montant</th>
					<th>remarque</th>
					<th>Action</th>
				</tr>
			</tfoot>
		</table>
	</div>
	<!-- /.box-body -->
	<div class="box-footer"></div>
	<!-- /.box-footer-->
</div>
<%@include file="footer.jsp"%>

