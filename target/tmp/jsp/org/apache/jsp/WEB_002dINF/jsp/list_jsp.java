package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jsp/common/base.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/common/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.release();
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
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>秒杀列表页</title>\r\n");
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
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    \t<div class=\"panel panel-default\">\r\n");
      out.write("    \t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("    \t\t\t<h2>秒杀产品列表</h2>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t\t<div class=\"panel-body\">\r\n");
      out.write("    \t\t\t<table class=\"table table-hover\">\r\n");
      out.write("    \t\t\t\t<thead>\r\n");
      out.write("    \t\t\t\t\t<tr>\r\n");
      out.write("    \t\t\t\t\t\t<th>名称</th>\r\n");
      out.write("    \t\t\t\t\t\t<th>库存</th>\r\n");
      out.write("    \t\t\t\t\t\t<th>开始时间</th>\r\n");
      out.write("    \t\t\t\t\t\t<th>结束时间</th>\r\n");
      out.write("    \t\t\t\t\t\t<th>创建时间</th>\r\n");
      out.write("    \t\t\t\t\t\t<th>详情页</th>\r\n");
      out.write("    \t\t\t\t\t</tr>\r\n");
      out.write("    \t\t\t\t</thead>\r\n");
      out.write("    \t\t\t\t<tbody>\r\n");
      out.write("    \t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t    \t\t\t\t\t\r\n");
      out.write("    \t\t\t\t</tbody>\r\n");
      out.write("    \t\t\t</table>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/js/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("sk");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    \t\t\t\t\t\t<tr>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>\r\n");
          out.write("\t    \t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t    \t\t\t\t\t\t</td>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>\r\n");
          out.write("\t    \t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t    \t\t\t\t\t\t</td>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>\r\n");
          out.write("\t    \t\t\t\t\t\t\t");
          if (_jspx_meth_fmt_formatDate_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\t    \t\t\t\t\t\t</td>\r\n");
          out.write("\t    \t\t\t\t\t\t<td>\r\n");
          out.write("\t    \t\t\t\t\t\t\t<a href=\"/seckill/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.seckillId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/detail\" target=\"_blank\" class=\"btn btn-info\">Link</a>\r\n");
          out.write("\t    \t\t\t\t\t\t</td>\r\n");
          out.write("\t    \t\t\t\t\t</tr>\r\n");
          out.write("    \t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.startTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.endTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sk.createTime}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setPattern("yyyy-MM-dd HH:mm:ss");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_pattern_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }
}
