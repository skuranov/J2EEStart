<%--
  Created by IntelliJ IDEA.
  User: zivert
  Date: 23.08.2015
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h1>The first and the last name is</h1>
  <%
    String firstName = (String) request.getAttribute("firstname");
    String lastName = (String) request.getAttribute("lastname");
  %>

  <table>
    <tr>
      <td>First name is</td><td><%=firstName%></td>
    </tr>
    <tr>
      <td>Last name is</td><td><%=lastName%></td>
    </tr>
  </table>
</body>
</html>
