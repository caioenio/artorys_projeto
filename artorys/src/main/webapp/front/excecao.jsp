<!DOCTYPE html>
<%
    String mensagem = (String) request.getAttribute("mensagem");
%>
<% if (mensagem == null) {%>
    <p> <%= mensagem %> </p>
<% }%>

