/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-02-27 06:27:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\" data-bs-theme=\"auto\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"assets/js/color-modes.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("document.addEventListener('DOMContentLoaded', function() {\r\n");
      out.write("    // 페이지 로드 시, 쿠키에 저장된 아이디가 있는지 확인하고 입력 필드에 설정\r\n");
      out.write("    var rememberedId = getCookie(\"rememberedId\");\r\n");
      out.write("    if (rememberedId) {\r\n");
      out.write("        document.querySelector(\"input[name='id']\").value = rememberedId;\r\n");
      out.write("        document.getElementById(\"flexCheckDefault\").checked = true; // 체크박스 체크 상태로 설정\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 체크박스 상태에 따라 쿠키 설정 및 해제\r\n");
      out.write("    document.getElementById(\"flexCheckDefault\").addEventListener('change', function() {\r\n");
      out.write("        if (this.checked) {\r\n");
      out.write("            // 체크박스가 체크되면 아이디를 쿠키에 저장\r\n");
      out.write("            setCookie(\"rememberedId\", document.querySelector(\"input[name='id']\").value, 30);\r\n");
      out.write("        } else {\r\n");
      out.write("            // 체크박스가 해제되면 쿠키 삭제\r\n");
      out.write("            deleteCookie(\"rememberedId\");\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 쿠키 설정 함수\r\n");
      out.write("    function setCookie(name, value, days) {\r\n");
      out.write("        var expires = \"\";\r\n");
      out.write("        if (days) {\r\n");
      out.write("            var date = new Date();\r\n");
      out.write("            date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));\r\n");
      out.write("            expires = \"; expires=\" + date.toUTCString();\r\n");
      out.write("        }\r\n");
      out.write("        document.cookie = name + \"=\" + value + expires + \"; path=/\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 쿠키 가져오기 함수\r\n");
      out.write("    function getCookie(name) {\r\n");
      out.write("        var nameEQ = name + \"=\";\r\n");
      out.write("        var ca = document.cookie.split(';');\r\n");
      out.write("        for (var i = 0; i < ca.length; i++) {\r\n");
      out.write("            var c = ca[i];\r\n");
      out.write("            while (c.charAt(0) == ' ') c = c.substring(1, c.length);\r\n");
      out.write("            if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length, c.length);\r\n");
      out.write("        }\r\n");
      out.write("        return null;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 쿠키 삭제 함수\r\n");
      out.write("    function deleteCookie(name) {\r\n");
      out.write("        setCookie(name, \"\", -1);\r\n");
      out.write("    }\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.115.4\">\r\n");
      out.write("<title>Signin Template · Bootstrap v5.3</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("	href=\"https://getbootstrap.com/docs/5.3/examples/sign-in/\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/@docsearch/css@3\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".bd-placeholder-img {\r\n");
      out.write("	font-size: 1.125rem;\r\n");
      out.write("	text-anchor: middle;\r\n");
      out.write("	-webkit-user-select: none;\r\n");
      out.write("	-moz-user-select: none;\r\n");
      out.write("	user-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("	.bd-placeholder-img-lg {\r\n");
      out.write("		font-size: 3.5rem;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b-example-divider {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 3rem;\r\n");
      out.write("	background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("	border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("	border-width: 1px 0;\r\n");
      out.write("	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em\r\n");
      out.write("		rgba(0, 0, 0, .15);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".b-example-vr {\r\n");
      out.write("	flex-shrink: 0;\r\n");
      out.write("	width: 1.5rem;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bi {\r\n");
      out.write("	vertical-align: -.125em;\r\n");
      out.write("	fill: currentColor;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-scroller {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	z-index: 2;\r\n");
      out.write("	height: 2.75rem;\r\n");
      out.write("	overflow-y: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-scroller .nav {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-wrap: nowrap;\r\n");
      out.write("	padding-bottom: 1rem;\r\n");
      out.write("	margin-top: -1px;\r\n");
      out.write("	overflow-x: auto;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	white-space: nowrap;\r\n");
      out.write("	-webkit-overflow-scrolling: touch;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-bd-primary {\r\n");
      out.write("	--bd-violet-bg: #712cf9;\r\n");
      out.write("	--bd-violet-rgb: 112.520718, 44.062154, 249.437846;\r\n");
      out.write("	--bs-btn-font-weight: 600;\r\n");
      out.write("	--bs-btn-color: var(--bs-white);\r\n");
      out.write("	--bs-btn-bg: var(--bd-violet-bg);\r\n");
      out.write("	--bs-btn-border-color: var(--bd-violet-bg);\r\n");
      out.write("	--bs-btn-hover-color: var(--bs-white);\r\n");
      out.write("	--bs-btn-hover-bg: #6528e0;\r\n");
      out.write("	--bs-btn-hover-border-color: #6528e0;\r\n");
      out.write("	--bs-btn-focus-shadow-rgb: var(--bd-violet-rgb);\r\n");
      out.write("	--bs-btn-active-color: var(--bs-btn-hover-color);\r\n");
      out.write("	--bs-btn-active-bg: #5a23c8;\r\n");
      out.write("	--bs-btn-active-border-color: #5a23c8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bd-mode-toggle {\r\n");
      out.write("	z-index: 1500;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"css/sign-in.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"d-flex align-items-center py-4 bg-body-tertiary\">\r\n");
      out.write("	<svg xmlns=\"http://www.w3.org/2000/svg\" class=\"d-none\">\r\n");
      out.write("      <symbol id=\"check2\" viewBox=\"0 0 16 16\">\r\n");
      out.write("        <path\r\n");
      out.write("			d=\"M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z\" />\r\n");
      out.write("      </symbol>\r\n");
      out.write("      <symbol id=\"circle-half\" viewBox=\"0 0 16 16\">\r\n");
      out.write("        <path\r\n");
      out.write("			d=\"M8 15A7 7 0 1 0 8 1v14zm0 1A8 8 0 1 1 8 0a8 8 0 0 1 0 16z\" />\r\n");
      out.write("      </symbol>\r\n");
      out.write("      <symbol id=\"moon-stars-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("        <path\r\n");
      out.write("			d=\"M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z\" />\r\n");
      out.write("        <path\r\n");
      out.write("			d=\"M10.794 3.148a.217.217 0 0 1 .412 0l.387 1.162c.173.518.579.924 1.097 1.097l1.162.387a.217.217 0 0 1 0 .412l-1.162.387a1.734 1.734 0 0 0-1.097 1.097l-.387 1.162a.217.217 0 0 1-.412 0l-.387-1.162A1.734 1.734 0 0 0 9.31 6.593l-1.162-.387a.217.217 0 0 1 0-.412l1.162-.387a1.734 1.734 0 0 0 1.097-1.097l.387-1.162zM13.863.099a.145.145 0 0 1 .274 0l.258.774c.115.346.386.617.732.732l.774.258a.145.145 0 0 1 0 .274l-.774.258a1.156 1.156 0 0 0-.732.732l-.258.774a.145.145 0 0 1-.274 0l-.258-.774a1.156 1.156 0 0 0-.732-.732l-.774-.258a.145.145 0 0 1 0-.274l.774-.258c.346-.115.617-.386.732-.732L13.863.1z\" />\r\n");
      out.write("      </symbol>\r\n");
      out.write("      <symbol id=\"sun-fill\" viewBox=\"0 0 16 16\">\r\n");
      out.write("        <path\r\n");
      out.write("			d=\"M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z\" />\r\n");
      out.write("      </symbol>\r\n");
      out.write("    </svg>\r\n");
      out.write("\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"dropdown position-fixed bottom-0 end-0 mb-3 me-3 bd-mode-toggle\">\r\n");
      out.write("		<button\r\n");
      out.write("			class=\"btn btn-bd-primary py-2 dropdown-toggle d-flex align-items-center\"\r\n");
      out.write("			id=\"bd-theme\" type=\"button\" aria-expanded=\"false\"\r\n");
      out.write("			data-bs-toggle=\"dropdown\" aria-label=\"Toggle theme (auto)\">\r\n");
      out.write("			<svg class=\"bi my-1 theme-icon-active\" width=\"1em\" height=\"1em\">\r\n");
      out.write("				<use href=\"#circle-half\"></use></svg>\r\n");
      out.write("			<span class=\"visually-hidden\" id=\"bd-theme-text\">Toggle theme</span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<ul class=\"dropdown-menu dropdown-menu-end shadow\"\r\n");
      out.write("			aria-labelledby=\"bd-theme-text\">\r\n");
      out.write("			<li>\r\n");
      out.write("				<button type=\"button\"\r\n");
      out.write("					class=\"dropdown-item d-flex align-items-center\"\r\n");
      out.write("					data-bs-theme-value=\"light\" aria-pressed=\"false\">\r\n");
      out.write("					<svg class=\"bi me-2 opacity-50 theme-icon\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#sun-fill\"></use></svg>\r\n");
      out.write("					Light\r\n");
      out.write("					<svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#check2\"></use></svg>\r\n");
      out.write("				</button>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<button type=\"button\"\r\n");
      out.write("					class=\"dropdown-item d-flex align-items-center\"\r\n");
      out.write("					data-bs-theme-value=\"dark\" aria-pressed=\"false\">\r\n");
      out.write("					<svg class=\"bi me-2 opacity-50 theme-icon\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#moon-stars-fill\"></use></svg>\r\n");
      out.write("					Dark\r\n");
      out.write("					<svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#check2\"></use></svg>\r\n");
      out.write("				</button>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li>\r\n");
      out.write("				<button type=\"button\"\r\n");
      out.write("					class=\"dropdown-item d-flex align-items-center active\"\r\n");
      out.write("					data-bs-theme-value=\"auto\" aria-pressed=\"true\">\r\n");
      out.write("					<svg class=\"bi me-2 opacity-50 theme-icon\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#circle-half\"></use></svg>\r\n");
      out.write("					Auto\r\n");
      out.write("					<svg class=\"bi ms-auto d-none\" width=\"1em\" height=\"1em\">\r\n");
      out.write("						<use href=\"#check2\"></use></svg>\r\n");
      out.write("				</button>\r\n");
      out.write("			</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<main class=\"form-signin w-100 m-auto\">\r\n");
      out.write("		<form action=\"member/login.jsp\" method=\"post\">\r\n");
      out.write("			<img class=\"mb-4\" src=\"assets/brand/house-door.svg\" alt=\"\" width=\"72\"\r\n");
      out.write("				height=\"57\">\r\n");
      out.write("			<h1 class=\"h3 mb-3 fw-normal\">로그인</h1>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input type=\"text\" class=\"form-control\" id=\"floatingInput\" name=\"id\"\r\n");
      out.write("					placeholder=\"아이디\"> <label for=\"floatingInput\">아이디</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input type=\"text\" class=\"form-control\" id=\"floatingPassword\" name=\"pw\"\r\n");
      out.write("					placeholder=\"이메일\"> <label for=\"floatingPassword\">이메일</label>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-check text-start my-3\">\r\n");
      out.write("				<input class=\"form-check-input\" type=\"checkbox\" value=\"remember-me\"\r\n");
      out.write("					id=\"flexCheckDefault\"> <label class=\"form-check-label\"\r\n");
      out.write("					for=\"flexCheckDefault\"> 아이디 기억하기 </label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<button class=\"btn btn-primary w-100 py-2\" type=\"submit\">로그인</button>\r\n");
      out.write("			<p class=\"mt-5 mb-3 text-body-secondary\">&copy; 2017–2023</p>\r\n");
      out.write("		</form>\r\n");
      out.write("	</main>\r\n");
      out.write("	<script src=\"assets/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
