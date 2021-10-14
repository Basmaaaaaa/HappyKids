<%@include file="header.jsp"%>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des visites</h4>
			</div>
			<div class="box-body">
			<c:if test="${not empty msg}">
			<div class="alert alert-primary" role="alert">${msg }</div>
		</c:if>
		<br>
					<table id="complex_header" class="table table-striped table-bordered display" style="width:100%">
								<thead> 
									<tr>
										<th>Eleve</th>
										<th>Date_visite</th>
										
										<th>taille</th>
										<th>poids</th>
										<th>Type Sanguin</th>
										<th>remarques</th>
										<th>Action</th> 
									</tr>
								</thead>
								<tbody>
								<c:forEach var="V" items="${VISITE}">
									<tr>
										<td>${V.eleve.nomEleve} ${V.eleve.prenomEleve} </td>
										<td>${V.date_visite} </td>
										
										<td>${V.taille}</td>
										<td>${V.poids}</td> 
										<td>${V.eleve.typeSanguin}</td>
										<td>${V.remarques}</td>
									<td>
									<!-- <a href="showVisite?id=${V.id_visite}"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a> -->
									<a href="deleteVisite?id=${V.id_visite}" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
									</td>
									</tr> 
									</c:forEach>
								</tbody>
								<tfoot>
								<tr><th>Eleve</th>
										<th>date_visite</th>
										
										<th>taille</th>
										<th>poids</th>
										<th>Type Sanguin</th>
										<th>remarques</th>
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
		