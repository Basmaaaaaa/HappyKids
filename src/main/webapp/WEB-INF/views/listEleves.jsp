<%@include file="header.jsp"%>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des Elèves</h4>
			</div>
			<div class="box-body">
				<c:if test="${not empty msg}">
					<div class="alert alert-primary" role="alert">${msg }</div>
				</c:if>
		<br>
					<table id="complex_header" class="table table-striped table-bordered display" style="width:100%">
								<thead> 
									<tr>
										<th>Nom</th>
										<th>Prénom</th>
										<th>Date de naissance</th> 
										<th>Action</th> 
									</tr>
								</thead>
								<tbody>
								<c:forEach var="E" items="${ELEVE}">
									<tr>
										<td>${E.nomEleve} </td>
										<td>${E.prenomEleve}</td>
										<td>${E.date_naissance}</td> 
									<td><a href="showEleve?id=${E.qr_code}"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
									<a href="deleteEleve?id=${E.qr_code}" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
									</td>
									</tr> 
									</c:forEach>
								</tbody>
								<tfoot>
								<tr>
										<th>Nom</th>
										<th>Prénom</th>
										<th>Date de naissance</th>
										<th>Action</th> 
									</tr>
								</tfoot>
							</table>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div>
 <%@include file="footer.jsp" %> 		  
		