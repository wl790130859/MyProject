package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class live_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/common/base.jsp");
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
      out.write("<html lang=\"zh-cn\">\r\n");
      out.write("<head>\r\n");
      out.write("    <title>WebSocket/SockJS Echo Sample (Adapted from Tomcat's echo sample)</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #connect-container {\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 400px\r\n");
      out.write("        }\r\n");
      out.write("        #connect-container div {\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        #console-container {\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("        }\r\n");
      out.write("        #console {\r\n");
      out.write("            border:1px solid #CCCCCC;\r\n");
      out.write("            border-right-color:#33333333;\r\n");
      out.write("            border-bottom-color:#999999;\r\n");
      out.write("            height: 170px;\r\n");
      out.write("            overflow-y: scroll;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        #console p {\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"http://cdn.sockjs.org/sockjs-0.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var ws = null;\r\n");
      out.write("        var url = null;\r\n");
      out.write("        var transports = [];\r\n");
      out.write("        function setConnected(connected) {\r\n");
      out.write("            document.getElementById('connect').disabled = connected;\r\n");
      out.write("            document.getElementById('disconnect').disabled = !connected;\r\n");
      out.write("            document.getElementById('echo').disabled = !connected;\r\n");
      out.write("        }\r\n");
      out.write("        function connect() {\r\n");
      out.write("            if (!url) {\r\n");
      out.write("                log('Select whether to use W3C WebSocket or SockJS');\r\n");
      out.write("                return;\r\n");
      out.write("            }\r\n");
      out.write("            //ws = (url.indexOf('sockjs') != -1) ?new SockJS(url, undefined, {protocols_whitelist: transports}) : new WebSocket(url);\r\n");
      out.write("//            if ('WebSocket'in window) {\r\n");
      out.write("//                ws= new WebSocket(\"ws://localhost:8080/websck\");\r\n");
      out.write("//            }else {\r\n");
      out.write("            ws = new SockJS(\"http://localhost:8080/sockjs/websck\");\r\n");
      out.write("//            }\r\n");
      out.write("            ws.onopen = function () {\r\n");
      out.write("                setConnected(true);\r\n");
      out.write("                log('Info: connection opened.');\r\n");
      out.write("            };\r\n");
      out.write("            ws.onmessage = function (event) {\r\n");
      out.write("                log('Received: ' + event.data);\r\n");
      out.write("            };\r\n");
      out.write("            ws.onclose = function (event) {\r\n");
      out.write("                setConnected(false);\r\n");
      out.write("                log('Info: connection closed.');\r\n");
      out.write("                log(event);\r\n");
      out.write("            };\r\n");
      out.write("        }\r\n");
      out.write("        function disconnect() {\r\n");
      out.write("            if (ws != null) {\r\n");
      out.write("                ws.close();\r\n");
      out.write("                ws = null;\r\n");
      out.write("            }\r\n");
      out.write("            setConnected(false);\r\n");
      out.write("        }\r\n");
      out.write("        function echo() {\r\n");
      out.write("            if (ws != null) {\r\n");
      out.write("                var message = document.getElementById('message').value;\r\n");
      out.write("                log('Sent: ' + message);\r\n");
      out.write("                ws.send(message);\r\n");
      out.write("            } else {\r\n");
      out.write("                alert('connection not established, please connect.');\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function updateUrl(urlPath) {\r\n");
      out.write("            if (urlPath.indexOf('sockjs') != -1) {\r\n");
      out.write("                url = urlPath;\r\n");
      out.write("                document.getElementById('sockJsTransportSelect').style.visibility ='visible';\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("                if (window.location.protocol =='http:') {\r\n");
      out.write("                    url = 'ws://' + window.location.host + urlPath;\r\n");
      out.write("                } else {\r\n");
      out.write("                    url = 'wss://' + window.location.host + urlPath;\r\n");
      out.write("                }\r\n");
      out.write("                document.getElementById('sockJsTransportSelect').style.visibility ='hidden';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function updateTransport(transport) {\r\n");
      out.write("            transports = (transport == 'all') ?  [] : [transport];\r\n");
      out.write("        }\r\n");
      out.write("        function log(message) {\r\n");
      out.write("            var console = document.getElementById('console');\r\n");
      out.write("            var p = document.createElement('p');\r\n");
      out.write("            p.style.wordWrap = 'break-word';\r\n");
      out.write("            p.appendChild(document.createTextNode(message));\r\n");
      out.write("            console.appendChild(p);\r\n");
      out.write("            while (console.childNodes.length > 25) {\r\n");
      out.write("                console.removeChild(console.firstChild);\r\n");
      out.write("            }\r\n");
      out.write("            console.scrollTop = console.scrollHeight;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<noscript><h2 style=\"color:#ff0000\">Seems your browser doesn't supportJavascript!Websockets\r\n");
      out.write("    rely on Javascript being enabled. Please enable\r\n");
      out.write("    Javascript and reload this page!</h2></noscript>\r\n");
      out.write("<div>\r\n");
      out.write("    <div id=\"connect-container\">\r\n");
      out.write("        <input id=\"radio1\"type=\"radio\"name=\"group1\"onclick=\"updateUrl('/sockjs/websck');\">\r\n");
      out.write("        <label for=\"radio1\">W3C WebSocket</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input id=\"radio2\"type=\"radio\"name=\"group1\"onclick=\"updateUrl('/sockjs/websck');\">\r\n");
      out.write("        <label for=\"radio2\">SockJS</label>\r\n");
      out.write("        <div id=\"sockJsTransportSelect\" style=\"visibility:hidden;\">\r\n");
      out.write("            <span>SockJS transport:</span>\r\n");
      out.write("            <select onchange=\"updateTransport(this.value)\">\r\n");
      out.write("                <option value=\"all\">all</option>\r\n");
      out.write("                <option value=\"websocket\">websocket</option>\r\n");
      out.write("                <option value=\"xhr-polling\">xhr-polling</option>\r\n");
      out.write("                <option value=\"jsonp-polling\">jsonp-polling</option>\r\n");
      out.write("                <option value=\"xhr-streaming\">xhr-streaming</option>\r\n");
      out.write("                <option value=\"iframe-eventsource\">iframe-eventsource</option>\r\n");
      out.write("                <option value=\"iframe-htmlfile\">iframe-htmlfile</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <button id=\"connect\"onclick=\"connect();\">Connect</button>\r\n");
      out.write("            <button id=\"disconnect\"disabled=\"disabled\"onclick=\"disconnect();\">Disconnect</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <textarea id=\"message\"style=\"width:350px\">Here is a message!</textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <button id=\"echo\"onclick=\"echo();\"disabled=\"disabled\">Echo message</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"console-container\">\r\n");
      out.write("        <div id=\"console\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
