"<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des Parents</h4>
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
									    <th>Nom</th>
										<th>Prénom</th>
										<th>Adresse</th>
										<th>Numéro telephone</th>
										<th>Numéro telephone2</th>
										<th>login</th> 
										
										<th>Action</th> 
									</tr>
								</thead>
								<tbody>
								<c:forEach  var="P" items="${PARENT}">
									<tr>
										<td>${P.nom}</td>
										<td>${P.prenom}</td>
										<td>${P.adresse}</td>
										<td>${P.numTel}</td>
										<td>${P.login}</td>
										
										<td>${P.num_tel2}</td>
										<td><a href="showParent?id=${P.id}"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
											<a href="deleteParent?id=${P.id}" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
											 </td>
									</tr> 
									</c:forEach>
								</tbody>
								<tfoot>
								<tr>
										<th>Nom</th>
										<th>Prénom</th>
										<th>Adresse</th>
										<th>Numéro telephone</th>
										<th>Numéro telephone2</th>
										<th>login</th> 
										
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
		