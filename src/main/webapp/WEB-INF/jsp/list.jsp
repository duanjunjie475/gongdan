<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/2/4
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <head>
        <title>Title</title>
    </head>
<body>
<div>
    <h1>企业工单列表</h1>
    <table>
        <tr>
            <td>工单编号</td>
            <td>项目名称</td>
            <td>执行人</td>
            <td>任务描述</td>
            <td>级别</td>
            <td>日期</td>
        </tr>
        <c:forEach items="${workorders}" var="workorder">
            <tr>
                <td>${workorder.id}</td>
                <td>${workorder.projectName}</td>
                <td>${workorder.executor}</td>
                <td>${workorder.description}</td>
                <td>
                    <c:choose>
                        <c:when test="${workorder.orderLevel==1}">
                            一级
                        </c:when>
                        <c:when test="${workorder.orderLevel==2}">
                            二级
                        </c:when>
                        <c:otherwise>
                            三级
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <fmt:formatDate value="${workorder.createDate}" pattern="yyyy-MM-dd"/>
                </td>
            </tr>

        </c:forEach>
    </table>
</div>
</body>
</html>
