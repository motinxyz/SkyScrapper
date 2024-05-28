<%--
  Created by IntelliJ IDEA.
  User: pirate
  Date: 25/5/24
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Tenants Info</title>
</head>
<body>



    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>name</th>
            </tr>
        </thead>



        <tbody>
        <c:forEach items="${allTenantsInfo}" var="tenant">
            <tr>
                <td>${tenant.tenantId}</td>
                <td>${tenant.tenantName}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>



</body>
</html>
