<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="koreaIt.memo.dto.Memo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
   List<Memo> memos = (List<Memo>)request.getAttribute("memos");
%>
</head>
<body>
<h1>메모목록 (<%=memos.size() %>)</h1>
    <table>
    <%for(Memo memo : memos){ %>
        <tr>
        <td><%=memo.getId() %></td>
        <td><%=memo.getRegDateString() %></td>
        <td><%=memo.getContent() %></td>
        </tr>
    <%}%>
    </table>

</body>
</html>