package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jsp/common/base.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/common/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setScope("page");
      _jspx_th_c_set_0.setVar("ctx");
      _jspx_th_c_set_0.setValue(request.getContextPath());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>秒杀详情页</title>\r\n");
      out.write("    ");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"panel panel-default text-center\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seckill.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t<div class=\"text-danger\">\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-time\"></span>\r\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon\" id=\"seckill-box\"></span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 登录弹出层，输入电话 -->\r\n");
      out.write("\t<div id=\"killPhoneModal\" class=\"modal fade\">\r\n");
      out.write("\t  <div class=\"modal-dialog\">\r\n");
      out.write("\t    <div class=\"modal-content\">\r\n");
      out.write("\t      <div class=\"modal-header\">\r\n");
      out.write("\t         <h3 class=\"modal-title text-center\">\r\n");
      out.write("\t        \t<span class=\"glyphicon glyphicon-phone\"></span>秒杀电话：\r\n");
      out.write("\t        </h3>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-body\">\r\n");
      out.write("\t        <div class=\"row\">\r\n");
      out.write("\t        \t<div class=\"col-xs-8 col-xs-offset-2\">\r\n");
      out.write("\t        \t\t<input type=\"text\" name=\"killPhone\" id=\"killPhoneKey\" placeholder=\"请输入手机号\" class=\"form-control\"/>\r\n");
      out.write("\t        \t</div>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t      <div class=\"modal-footer\">\r\n");
      out.write("      \t\t<span id=\"killPhoneMessage\" class=\"glyphicon\"></span>\r\n");
      out.write("\t        <button id=\"killPhoneBtn\" class=\"btn btn-success\">\r\n");
      out.write("\t        \t<span class=\"glyphicon glyphicon-phone\"></span> Submit\r\n");
      out.write("\t        </button>\r\n");
      out.write("\t        <!-- <button id=\"killPhoneBtn\" class=\"btn btn-danger\" data-dismiss=\"modal\">\r\n");
      out.write("\t        \t<span class=\"glyphicon glyphicon-remove\"></span> Cancel\r\n");
      out.write("\t        </button> -->\r\n");
      out.write("\t      </div>\r\n");
      out.write("\t    </div><!-- /.modal-content -->\r\n");
      out.write("\t  </div><!-- /.modal-dialog -->\r\n");
      out.write("\t</div><!-- /.modal -->\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery.cookie.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery.countdown.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/seckill.js\"> </script>\r\n");
      out.write("    <script>\r\n");
      out.write("    \t$(function() {\r\n");
      out.write("    \t\t//使用EL表达式传入参数\r\n");
      out.write("    \t\tseckill.detail.init({\r\n");
      out.write("    \t\t\tseckillId: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seckill.seckillId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("    \t\t\tstartTime: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seckill.startTime.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\t//使用EL表达式将日期转成毫秒时间\r\n");
      out.write("    \t\t\tendTime: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${seckill.endTime.time}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t})\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
