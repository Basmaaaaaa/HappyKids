<%@include file="header.jsp"%>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Détails Message</h4>
			</div>
			<div class="box-body"> 
					<table class="table table-striped table-bordered display"  >
							 
									<tr>
										<td width="200">Date : </td>
										<td width="200">${IME.date_envoie }</td> 
									</tr> 
									<tr>
										<td>Sujet : </td>
										<td>${IME.sujet }</td> 
									</tr> 
									<tr>
										<td>Contenue : </td>
										<td>${IME.contenue }</td> 
									</tr> 
							 
							</table>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div>
 <%@include file="footer.jsp" %> 		  
		