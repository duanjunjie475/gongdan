<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/2/4
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>企业工单管理系统</title>
</head>
<body>
    <h1>
        企业工单管理系统
    </h1>
    <div>
        <div style="display: inline-block;background-color: #99488a">选择项目</div>
        <div>
            <form method="get" action="/workorder/add.html">
                <select name="projectId">
                    <c:forEach items="${projectes}" var="project">
                        <option value="${project.id}">${project.projectName}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="确定">
            </form>
        </div>
    </div>
</body>
</html>
