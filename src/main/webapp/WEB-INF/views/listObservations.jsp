<%@include file="header.jsp"%>
<div class="box">
	<div class="box-header with-border">
		<h4 class="box-title">Liste des observations</h4>
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
					<th>Message</th>
					<th>Date d'observation</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="O" items="${OBSERVATION}">
					<tr>
						<td>${O.message}</td>
						<td>${O.date_observation}</td>
						<td><a href="showObservation?id=${O.idObservation }"><span
								class="btn btn-circle btn-warning btn-sm mb-5"><i
									class="fa fa-edit"></i></span></a>
									 <a
							href="deleteObservation?id=${O.idObservation }"  OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span
								class="btn btn-circle btn-danger btn-sm mb-5"><i
									class="fa fa-trash"></i></span></a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
			<tr>
					<th>Message</th>
					<th>Date d'observation</th>
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
