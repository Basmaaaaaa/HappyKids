<%@ include file="header.jsp"%>
		  <div class="box">
			<div class="box-header with-border">
			  <h4 class="box-title">Menu Principale</h4>
			</div>
			<div class="box-body">
				<div align="center">
					 Bienvenue ${USER.nom } ${USER.prenom }<br>
					 <img src="<c:url value="/resources/images/blog.png" />"  width="170" alt="" >
					</div>
			</div>
			<!-- /.box-body -->
			<div class="box-footer">
			   
			</div>
			<!-- /.box-footer-->
		  </div> 	
 <%@include file="footer.jsp" %> 	  
		