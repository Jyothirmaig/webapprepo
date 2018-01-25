<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloJSPfile</title>
</head>
<body>
<p><h1>Java Source of the hello.jsp JSP</h1></p>
<p><h2>Description of the hello.jsp</h2></p>
<p><h3>The hello.jsp page is a static HTML page embedded with a JSP command.
 A JSP command is an XML-like snippet that encapsulates logic that dynamically generates content within the static HTML. JSP commands can include directives, declarations, expressions, actions, and blocks of Java code, all enclosed within angle-brackets, like XML elements. At compile-time, the JSP is converted into a servlet, which is what tc Runtime instance actually executes at runtime.

The hello.jsp includes the following simple JSP directive:

<%= new String("Hello!") %>
This JSP directive simply prints out a message to the client (browser): Hello!</h3></p>
<table border="0" cellpadding="10">
    <tr>
      <td align=center>
        <img src="images/springsource.png">
      </td>
      <td>
         <h1>Sample Application JSP Page</h1>
      </td>
    </tr>
  </table>

  <br />
  <p>This is the output of a JSP page that is part of the HelloWorld application.</p>

  <%= new String("Hello!") %>
</body>
</html>