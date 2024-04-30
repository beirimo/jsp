/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-04-30 03:13:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<style>\r\n");
      out.write("	span {width:100px;}\r\n");
      out.write("</style>\r\n");
      out.write("<h1>로그인</h1>\r\n");
      out.write("<div class=\"row my-4 justify-content-center\">\r\n");
      out.write("	<div class=\"col-8 col-md-6 col-lg-4\">\r\n");
      out.write("		<div class=\"card\">\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<form name=\"frm\">\r\n");
      out.write("					<div class=\"input-group mb-3\">\r\n");
      out.write("						<span class=\"input-group-text justify-content-center\">아이디</span>\r\n");
      out.write("						<input name=\"uid\" class=\"form-control\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"input-group mb-3\">\r\n");
      out.write("						<span class=\"input-group-text justify-content-center\">비밀번호</span>\r\n");
      out.write("						<input name=\"upass\" type=\"password\" class=\"form-control\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<button class=\"btn btn-primary w-100\">로그인</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("	$(frm).on(\"submit\", function(e){\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("		const uid=$(frm.uid).val();\r\n");
      out.write("		const upass=$(frm.upass).val();\r\n");
      out.write("		if(uid==\"\"){\r\n");
      out.write("			alert(\"아이디를 입력하세요!\");\r\n");
      out.write("		}else if(upass==\"\"){\r\n");
      out.write("			alert(\"비밀번호를 입력하세요!\");\r\n");
      out.write("		}else{\r\n");
      out.write("			//로그인체크\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"post\",\r\n");
      out.write("				url:\"/user/login\",\r\n");
      out.write("				data:{uid:uid, upass:upass},\r\n");
      out.write("				success:function(data){\r\n");
      out.write("					//alert(data);\r\n");
      out.write("					if(data==1){\r\n");
      out.write("						//alert(\"성공\")\r\n");
      out.write("						location.href=\"/\";\r\n");
      out.write("					}else if(data==2){\r\n");
      out.write("						alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("						$(frm.upass).val(\"\");\r\n");
      out.write("						$(frm.upass).focus();\r\n");
      out.write("					}else if(data==0){\r\n");
      out.write("						alert(\"아이디가 존재하지 않습니다.\");\r\n");
      out.write("						$(frm.uid).val(\"\");\r\n");
      out.write("						$(frm.uid).focus();\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
