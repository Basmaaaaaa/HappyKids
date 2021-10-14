<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Liste des Groupes</h4>
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
									    <th>Action</th>
									</tr>
								</thead>
								<tbody>
								<c:forEach  var="G" items="${Groupe}">
									<tr>
										<td>${G.nom_groupe}</td>
									        <td><a href="showGroupe?id=${G.id_groupe }"><span  class="btn btn-circle btn-warning btn-sm mb-5"><i class="fa fa-edit"></i></span></a>
											<a href="deleteGroupe?id=${G.id_groupe }" OnClick="return confirm('Voulez-vous vraiment supprimer ?');"><span class="btn btn-circle btn-danger btn-sm mb-5"><i class="fa fa-trash"></i></span></a>
											 </td>
									</tr> 
									</c:forEach>
								</tbody>
								<tfoot>
								<tr>
										<th>Nom</th>
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
		