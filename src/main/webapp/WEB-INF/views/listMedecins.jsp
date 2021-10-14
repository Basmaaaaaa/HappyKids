<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des Medecins</h4>
			</div>
	<div class="box-body">
			<c:if test="${not empty msg}">
						<div class="alert alert-primary" role="alert">
						  ${msg }
						</div>
					</c:if>
					<br>
			<table id="complex_header" class="table table-striped table-bordered display" style="width:100%">
								<thead> 
									<tr>
										<th>nom</th>
										<th>prenom</th>
										<th>numerotelephone</th>
										<th>adresse</th> 
										<th>Action</th> 
									</tr>
								</thead>
								<tbody>
								<c:forEach var="M" items="${MEDECIN}">
									<tr>
										<td>${M.nom}</td>
										<td>${M.prenom} </td>
										<td>${M.numTel}</td>
										<td>${M.adresse}</td> 
								<td>
								<a href="bloquerMedecin?id=${M.id }"><span  class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-close"></i></span></a>
								<a href="showMedecin?id=${M.id }"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
								<a href="deleteMedecin?id=${M.id }" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"s><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
								 </td>	
									</tr>
									</c:forEach> 
								</tbody>
								<tfoot>
									<tr>
										<th>nom</th>
										<th>prenom</th>
										<th>numerotelephone</th>
										<th>adresse</th> 
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
		