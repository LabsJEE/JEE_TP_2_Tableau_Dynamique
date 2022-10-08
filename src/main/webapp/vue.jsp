<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        int nbLig = Integer.parseInt(request.getParameter("nbLig"));
        int nbCol = Integer.parseInt(request.getParameter("nbCol"));
    %>
    <body>
        <table style="border: 1px solid blue; width: 100%">
            <% for (int i = 0; i < nbLig; i++) {%>
            <tr style="border: 1px solid blue">
                <% for (int j = 0; j < nbCol; j++) {%>
                    <td style="border: 2px solid blue" height="20"></td>
                <% } %>
            </tr>
            <% } %>
        </table>
    </body>
</html>