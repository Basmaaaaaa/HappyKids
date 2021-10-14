<%@include file="header.jsp" %>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Ajout d'un Groupe</h4>
			</div>
			<div class="box-body">
					<form method="post"  action="addGroupe">
							<div class="box-body">
							<div class="form-group">
								<label>Nom : </label>
								<input type="text" class="form-control"  name="nom" required="true">
							</div>
                               
							
							 <div align="right">
									<input type="submit" class="btn btn-success mb-5" value="Valider">
							</div>
						</div>	
					</form>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div>
 <%@include file="footer.jsp" %> 	  
		