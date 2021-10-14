
<%@include file="header.jsp" %> 
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des Enseignants</h4>
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
										<th>Enseignant</th>
										<th>Téléphone</th>
										<th>Spécialité</th>
										<th>Adresse</th>
										<th>Login</th> 
										<th>Action</th> 
									</tr>
								</thead>
								<tbody>
									<c:forEach var="E" items="${LES }"> 
										<tr>
											<td>${E.nom } ${E.prenom }</td>
											<td>${E.numTel }</td>
											<td>${E.specialite }</td>
											<td>${E.adresse }</td>
											<td>${E.login }</td>
											<td><a href="showEnseignant?id=${E.id }"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
												<a href="deleteEnseignant?id=${E.id }" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
												</td>
										</tr> 
									</c:forEach>
								</tbody>
								<tfoot>
									<tr>
										<th>Enseignant</th>
										<th>Téléphone</th>
										<th>Spécialité</th>
										<th>Adresse</th>
										<th>Login</th> 
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
		