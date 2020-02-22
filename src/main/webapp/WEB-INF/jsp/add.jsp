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
    <title>添加工单</title>
</head>
<body>
    <h1>
        添加工单
    </h1>
    <div>
        <form action="/workorder/add.html" method="post">
            <div>
                <div style="display: inline-block;background-color: #99488a">执行人(*)</div>
                <div style="display: inline-block;">
                    <input name="executor" >
                </div>
            </div>
            <div>
                <div style="display: inline-block;background-color: #99488a">任务描述(*)</div>
                <div style="display: inline-block;">
                    <input name="description"  >
                </div>
            </div>
            <div>
                <div style="display: inline-block;background-color: #99488a">级别(*)</div>
                <div style="display: inline-block;">
                    <select name="orderLevel">
                        <option value="1">1级</option>
                        <option value="2">2级</option>
                        <option value="3">3级</option>
                    </select>
                </div>
            </div>
            <input type="hidden" value="${projectId}" name="projectId">
            <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
