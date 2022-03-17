<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome here</h1>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<ArrayList<String>> ans= new ArrayList<ArrayList<String> >();
Object result = session.getAttribute("daolist");
out.println(result);
ans = (ArrayList<ArrayList<String> >)result;
for(int i=0;i<ans.size();i++){

    %>
    <p><%= ans.get(i).get(0) %></p>
    <p><%= ans.get(i).get(1) %></p>
    <%
}
%>
</body>
</html>