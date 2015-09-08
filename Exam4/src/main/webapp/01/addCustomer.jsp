<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.hand.jdbc.*"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加客户</title>
<link href="../bootstrap.min.css" rel="stylesheet">
<link href="index.css" rel="stylesheet">
<script src="../jquery-2.1.1.min.js"></script>
<script src="../bootstrap.min.js"></script>
</head>
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
			<a href="<%=request.getContextPath() %>/LoginAction!out.action"><h1 style="color: darkgreen"><%=session.getAttribute("username")%></h1></a>
		</div>
	</div>
	</nav>
	<div class="container">
		<div class="left">
			<div>
				<ul class="nav nav-pills nav-stacked">
					<li style="text-align: center"><a href="index.jsp"><h3>Donbord</h3>
					</a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>应用设置</h3> </a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>管理设置</h3> </a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>数据配置</h3> </a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>主数据管理</h3> </a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>客户订单管理</h3> </a></li>
					<li style="text-align: center"><a href="FilmIndex.jsp">
							<h3>发货单管理</h3> </a></li>
				</ul>
			</div>
		</div>
		<div class="right">
			<div>
				<h1>创建Customer</h1>
			</div>
			<div class="conten-text">
				<form method="post"
					action="<%=request.getContextPath()%>/AddAction!add.action">
					<div style="float: left">
						<h4>基本信息</h4>
					</div>
					<div
						style="width: 200px; height: 100px; margin: 0px auto; text-align: center">
					</div>
					<div class="row form-group">
						<div class="row"">
							<div class="col-md-2">First Name*</div>
							<input class="col-md-4" type="text" name="firstname">
						</div>
						<br>
						<div class="row">
							<div class="col-md-2">Last Name*</div>
							<input class="col-md-4" type="text" name="lastname">
						</div>
						<br>
						<div class="row">
							<div class="col-md-2">Email</div>
							<input class="col-md-4" type="text" name="email">
						</div>
						<br>
						<div class="row">
							<div class="col-md-2">Address*</div>
							<select name="address_id" style="width:350px;heigth:120">
								<%
									Connection con = ConnectionFactory.getInstance().getConnection();
									String sql = "SELECT address_id,address FROM address";
									PreparedStatement stat = con.prepareStatement(sql,
											ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
									ResultSet rs = stat.executeQuery();
									while (rs.next()) {
										int addressid = rs.getInt(1);
										String address = rs.getString(2);
								%>
								<option value="<%=rs.getString(1)%>"> <%=rs.getString(2) %></option>
									<%
										}
									%>
								
							</select> 
						</div>
					</div>
					<br>
					<div class="row">
						<button type="submit" style="margin-left: 400px"
							class="btn btn-success">提交</button>
						<button type="reset" class="btn btn-success">取消</button>
					</div>
				</form>
			</div>
		</div>

	</div>


</body>
</html>