package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.hand.jdbc.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<link href=\"bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"index.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar page = 2;\r\n");
      out.write("\tvar mmid = 0;\r\n");
      out.write("\r\n");
      out.write("\tfunction getCustomer(curPage1) {\r\n");
      out.write("\t\t//var value = $(val).text();\r\n");
      out.write("\t\tvar urlGet = \"ShowAction!show.action?curPage=\" + curPage1;\r\n");
      out.write("\t\t//$(\"#customer\").html(\"\");\r\n");
      out.write("\r\n");
      out.write("\t\t$\r\n");
      out.write("\t\t\t\t.getJSON(\r\n");
      out.write("\t\t\t\t\t\turlGet,\r\n");
      out.write("\t\t\t\t\t\tfunction(data) {\r\n");
      out.write("\t\t\t\t\t\t\tvar row = \"<tr><td>操作</td><td>删除</td><td>first_name</td><td>last_name</td><td>email</td><td>customer_id</td><td>address</td><td>last_update</td></tr>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(entryIndex, entry) {//遍历JSON\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\trow += \"<tr><td><button type='button' class='btn btn-default' onclick='mod(this)' id=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.customer_id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"><a>编辑</a></button><td><a class='btn btn-info'  href='DeleteAction!delete.action?id=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.customer_id+ \"'>删除</a><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.first_name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.last_name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.email\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.customer_id\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.address\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ entry.last_update\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</td></tr>\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#customer\").html(row);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction mod(even) {\r\n");
      out.write("\t\tmmid = even.getAttribute(\"id\");\r\n");
      out.write("\t\t$(\"#dd\").attr(\"value\", mmid);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#model6\").modal();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("\t<div class=\"head navbar-header col-lg-1\"\r\n");
      out.write("\t\tstyle=\"width: 1500px; height: 60px; margin: 0 auto\">\r\n");
      out.write("\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<div class=\" \" style=\"float: left; margin-left: 50px\">\r\n");
      out.write("\t\t\t\t<a class=\"\" style=\"color: red\"><h1>8831 许凯迪</h1> </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"admin navbar-right \">\r\n");
      out.write("\t\t\t<a href=\"LoginAction!out.action\"><h1 style=\"color: darkgreen\">");
      out.print(request.getParameter("username"));
      out.write("</h1>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t");

				session.setAttribute("username", request.getParameter("username"));
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t<div class=\"ul\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav nav-pills nav-stacked \" style=\"width: 300px\">\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\" role=\"presentation\" class=\"active\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"#\" onclick=\"getCustomer(1)\"><h3>Customer管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t\t<li style=\"text-align: center\" role=\"presentation\" class=\"\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"FilmIndex.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3>Film管理</h3> </a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h1>客户管理</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"float: left; margin-left: 10px\">\r\n");
      out.write("\t\t\t\t<h4>客户列表</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"btn btn-success \"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left:30px\" value=\"新建\"\r\n");
      out.write("\t\t\t\t\tonclick=\"window.location='");
      out.print(request.getContextPath());
      out.write("/01/addCustomer.jsp'\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form\" style=\"float:left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered\" border=\"0\" spacing=\"2\"\r\n");
      out.write("\t\t\t\t\theight=\"600px\" id=\"customer\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div style=\"text-align: center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"btn-group \" style=\"float: right\" id=\"btn-g\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-success\" onclick=\"getCustomer(1)\">首页</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\" onclick=\"getCustomer(--page)\">上一页</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\" onclick=\"getCustomer(++page)\">下一页</a> <a\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-success\" onclick=\"getCustomer(60)\">尾页</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\"#exam\").on(\"show.bs.modal\", function(event) {\r\n");
      out.write("\t\t\tvar button = $(event.relatedTarget);\r\n");
      out.write("\t\t\tvar recipient = button.data(\"whatever\");\r\n");
      out.write("\t\t\tvar modal = $(this);\r\n");
      out.write("\t\t\tmodal.find(\".modal-title\").text(\"new message\" + recipient);\r\n");
      out.write("\t\t\tmodal.find(\".modal-body input\").val(recipient);\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<div class=\"modal fade myModal2\" id=\"model6\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-hidden=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"modal-dialog modal-lg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"modal-content\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-header\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<Strong>进入编辑</Strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\taction=\"EditAction!update.action?eid=mmid\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"eid\" id=\"dd\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\" style=\"margin-left:120px\">firstname</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"firstname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\" style=\"margin-left:120px\">lastname</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"lastname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\" style=\"margin-left:120px\">email</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"col-md-4\" type=\"text\" name=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-2\" style=\"margin-left:120px\">address</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<select name=\"address_id\" style=\"width:310px;heigth:120\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

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
														
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
      out.print(rs1.getString(1));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(rs1.getString(2));
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");

															}
														
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success \"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left: 530px;margin-top:20px\" value=\"提交\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
