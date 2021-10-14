
<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Liste des Actualités</h4>
	</div>
	<div class="box-body">
			<c:if test="${not empty msg}">
						<div class="alert alert-primary" role="alert">
						  ${msg }
						</div>
					</c:if>
					<br>
		<table id="complex_header" class="table table-striped table-bordered display" style="width: 100%">
			<thead>

				<tr>
					<th>Nom</th> 
					<th>date</th>
					<th>date Publication</th>
					<th>description</th>
					<th>type</th>
					<th>Action</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach var="Ac" items="${ACTUALITE}">
					<tr>
						
						<th>${Ac.nom_actualite}</th>
					    <th>${Ac.date_actualite}</th>
						<th>${Ac.datePublication}</th>
						<th>${Ac.description}</th>
						<th>${Ac.type_actualite}</th>
						<td>
		<a href="showActualite?id=${Ac.id_actualite}"> <span class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a> 
		<a href="deleteActualite?id=${Ac.id_actualite}" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"> <span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<th>nom</th>
					
					<th>date</th>
					<th>description</th>
					<th>type</th>
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
