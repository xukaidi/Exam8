<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.hand.jdbc.*"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">
<script src="jquery-2.1.1.min.js"></script>
<script src="bootstrap.min.js"></script>
</head>
<script type="text/javascript">
	var page = 2;
	var mmid = 0;

	function getCustomer(curPage1) {
		//var value = $(val).text();
		var urlGet = "ShowAction!show.action?curPage=" + curPage1;
		//$("#customer").html("");

		$
				.getJSON(
						urlGet,
						function(data) {
							var row = "<tr><td>操作</td><td>删除</td><td>first_name</td><td>last_name</td><td>email</td><td>customer_id</td><td>address</td><td>last_update</td></tr>";

							$
									.each(
											data,
											function(entryIndex, entry) {//遍历JSON

												row += "<tr><td><button type='button' class='btn btn-default' onclick='mod(this)' id="
														+ entry.customer_id
														+ "><a>编辑</a></button><td><a class='btn btn-info'  href='DeleteAction!delete.action?id="
														+ entry.customer_id+ "'>删除</a><td>"
														+ entry.first_name
														+ "</td><td>"
														+ entry.last_name
														+ "</td><td>"
														+ entry.email
														+ "</td><td>"
														+ entry.customer_id
														+ "</td><td>"
														+ entry.address
														+ "</td><td>"
														+ entry.last_update
														+ "</td></tr>";

											});

							$("#customer").html(row);

						});

	}

	function mod(even) {
		mmid = even.getAttribute("id");
		$("#dd").attr("value", mmid);
		
		$("#model6").modal();
	}
</script>




<body>

	<nav class="navbar navbar-inverse" role="navigation">
	<div class="head navbar-header col-lg-1"
		style="width: 1500px; height: 60px; margin: 0 auto">
		<div class="">
			<div class=" " style="float: left; margin-left: 50px">
				<a class="" style="color: red"><h1>8831 许凯迪</h1> </a>
			</div>
		</div>
		<div class="admin navbar-right ">
			<a href="LoginAction!out.action"><h1 style="color: darkgreen"><%=request.getParameter("username")%></h1>
			</a>
			<%
				session.setAttribute("username", request.getParameter("username"));
			%>
		</div>
	</div>
	</nav>
	<div class="container">
		<div class="left">
			<div class="ul">
				<ul class="nav nav-pills nav-stacked " style="width: 300px">
					<li style="text-align: center" role="presentation" class="active"><a
						href="#" onclick="getCustomer(1)"><h3>Customer管理</h3> </a></li>
					<li style="text-align: center" role="presentation" class=""><a
						href="FilmIndex.jsp">
							<h3>Film管理</h3> </a></li>
				</ul>
			</div>
		</div>
		<div class="right">
			<div>
				<h1>客户管理</h1>
			</div>
			<div style="float: left; margin-left: 10px">
				<h4>客户列表</h4>
			</div>
			<div>
				<input type="button" class="btn btn-success "
					style="margin-left:30px" value="新建"
					onclick="window.location='<%=request.getContextPath()%>/01/addCustomer.jsp'">
			</div>
			<div class="form" style="float:left">

				<table class="table table-bordered" border="0" spacing="2"
					height="600px" id="customer">

				</table>
				<div style="text-align: center">

					<div class="btn-group " style="float: right" id="btn-g">
						<a class="btn btn-success" onclick="getCustomer(1)">首页</a> <a
							class="btn btn-success" onclick="getCustomer(--page)">上一页</a> <a
							class="btn btn-success" onclick="getCustomer(++page)">下一页</a> <a
							class="btn btn-success" onclick="getCustomer(60)">尾页</a>
					</div>

				</div>

			</div>
		</div>
	</div>


	<script>
		$("#exam").on("show.bs.modal", function(event) {
			var button = $(event.relatedTarget);
			var recipient = button.data("whatever");
			var modal = $(this);
			modal.find(".modal-title").text("new message" + recipient);
			modal.find(".modal-body input").val(recipient);
		})
	</script>
	<div class="modal fade myModal2" id="model6" tabindex="-1" role="dialog"
								aria-hidden="true">
								<div class="modal-dialog modal-lg">
									<div class="modal-content" >
										<div class="modal-header" >
											<Strong>进入编辑</Strong>
										</div>
										<div class="modal-body">
											<form
												action="EditAction!update.action?eid=mmid" >
												<div class="form-group">
													<input type="hidden" name="eid" id="dd" />
													<div class="row form-group">
														<div class="row">
															<div class="col-md-2" style="margin-left:120px">firstname</div>
															<input class="col-md-4" type="text" name="firstname">
														</div>
													</div>
													<div class="row form-group">
														<div class="row">
															<div class="col-md-2" style="margin-left:120px">lastname</div>
															<input class="col-md-4" type="text" name="lastname">
														</div>
													</div>
													
													<div class="row form-group">
														<div class="row">
															<div class="col-md-2" style="margin-left:120px">email</div>
															<input class="col-md-4" type="text" name="email">
														</div>
													</div>
													
													<div class="row form-group">
														<div class="row">
															<div class="col-md-2" style="margin-left:120px">address</div>

													<select name="address_id" style="width:310px;heigth:120"  >
														<%
															Connection conn = ConnectionFactory.getInstance()
																			.getConnection();
																	String sql1 = "SELECT address_id,address FROM address";
																	PreparedStatement stat1 = conn.prepareStatement(sql1,
																			ResultSet.TYPE_FORWARD_ONLY,
																			ResultSet.CONCUR_READ_ONLY);
																	ResultSet rs1 = stat1.executeQuery();
																	while (rs1.next()) {
																		int addressid = rs1.getInt(1);
																		String address = rs1.getString(2);
														%>
														<option value="<%=rs1.getString(1)%>">
															<%=rs1.getString(2)%></option>
														<%
															}
														%>
													</select>
												</div>
												
												<div class="row form-group">
													<div class="row col-md-2">
														<input type="submit" class="btn btn-success "
					style="margin-left: 530px;margin-top:20px" value="提交">
					
												</div>
												
												</div>
												</div>
										</div>
										</form>
									</div>
								</div>
							</div>

</body>
</html>