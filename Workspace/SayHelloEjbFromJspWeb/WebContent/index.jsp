<%@ page import="ejb3.bean.HelloEjb" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.Context" %>
<html>
<head><title>Hello EJB 3 !</title></head>
<body>
<%!
HelloEjb helloEjb;
%>
<%
try {
Context context = new InitialContext();
helloEjb = (HelloEjb) context.lookup(HelloEjb.class.getName());
}
catch(Exception e) {
// exception code here
throw e;
}
%>
<p>
Object HelloEjb Directly : <%= helloEjb %><br>
Print Hello : <%= helloEjb.printHello("Mohammed") %>

<p>
Object HeloEjb from Servlet : <%= request.getAttribute("helloEjb") %><br>
Print Hello : <%= request.getAttribute("printHello") %>
</body>
</html>