<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<script type="text/javascript" src=" http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
    $(function(){
        $(".delete").click(function(){
            var href = $(this).attr("href");
            $("#fromdelete").attr("action", href).submit();
            return false;
        });
    })
</script>

<form id="fromdelete" action="" method="post">
    <input type="hidden" name="_method" value="delete">
</form>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>qq</td>
        <td>修真类型</td>
        <td>入学时间</td>
        <td>毕业院校</td>
        <td>日报链接</td>
        <td>立愿</td>
        <td>创建时间</td>
        <td>更新时间</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${student}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.qq}</td>
            <td>${student.type}</td>
            <td>${student.time}</td>
            <td>${student.graduateInstitutions}</td>
            <td>${student.dailyLink}</td>
            <td>${student.volunteer}</td>
            <%--<td>${student.createAt}</td>--%>
            <%--<td>${student.updateAt}</td>--%>
            <td>
                <jsp:useBean id="timestamp" class="java.util.Date"/>
                <jsp:setProperty name="timestamp" property="time" value="${student.createAt}"/>
                <fmt:formatDate value="${timestamp}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
            <td>
                <jsp:useBean id="update" class="java.util.Date"/>
                <jsp:setProperty name="update" property="time" value="${student.updateAt}"/>
                <fmt:formatDate value="${update}" pattern="yyyy/MM/dd HH:mm:ss"/></td>

            <td><a href="/students/${student.id}">编辑</a></td>
            <td><a class="delete" href="/students/${student.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
