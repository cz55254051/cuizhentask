<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--引入fmt对时间格式化--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>--%>
<%--<%@ page isELIgnored="false"%>--%>


<script type="text/javascript" src=" http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".delete").click(function () {
            var href = $(this).attr("href");
            $("#fromdelete").attr("action", href).submit();
            return false;
        });
    })
</script>

<form id="fromdelete" action="" method="post">
    <input type="hidden" name="_method" value="delete">
</form>


<%--<json:object>--%>
    <%--&lt;%&ndash;<json:property name="itemCount" value="${cart.itemCount}"/>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<json:property name="subtotal" value="${cart.subtotal}"/>&ndash;%&gt;--%>
    <%--<json:array name="student" items="${students}" var="student">--%>
        <%--<json:object>--%>
            <%--<json:property name="id" value="${student.id}"/>--%>
            <%--<json:property name="name" value="${student.name}"/>--%>
            <%--<json:property name="qq" value="${student.qq}"/>--%>
            <%--<json:property name="type" value="${student.type}"/>--%>
            <%--<json:property name="time" value="${student.time}"/>--%>
            <%--<json:property name="graduateInstitutions" value="${student.graduateInstitutions}"/>--%>
            <%--<json:property name="dailyLink" value="${student.dailyLink}"/>--%>
            <%--<json:property name="volunteer" value="${student.volunteer}"/>--%>
            <%--<json:property name="createAt" value="${student.createAt}"/>--%>
            <%--<json:property name="updateAt" value="${student.updateAt}"/>--%>
        <%--</json:object>--%>
    <%--</json:array>--%>
<%--</json:object>--%>


<div style="text-align:center;margin-top:40px">
    <form method="get" action="/student/name">
        模糊查询： <input name="name" value="" type="text"> <br><br>
        <input type="submit" value="查询">
    </form>
</div>

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
    <c:forEach items="${students}" var="student">
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
                    <%--通过<jsp:useBean /> 导入java.util.Date类--%>
                <jsp:useBean id="timestamp" class="java.util.Date"/>
                    <%--通过<jsp:setProperty />为Date实例设置long型 time属性值--%>
                <jsp:setProperty name="timestamp" property="time" value="${student.createAt}"/>
                    <%--通过<fmt:formatDate />格式化Date实例 --%>
                <fmt:formatDate value="${timestamp}" pattern="yyyy/MM/dd/ HH:mm:ss"/></td>
            <td>
                    <jsp:useBean id="update" class="java.util.Date"/>
                    <jsp:setProperty name="update" property="time" value="${student.updateAt}"/>
                    <fmt:formatDate value="${update}" pattern="yyyy/MM/dd/ HH:mm:ss"/></td>


            <td><a href="/students/${student.id}">编辑</a></td>
            <td><a class="delete" href="/students/${student.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<div style="text-align:center">
    <a href="?start=0">首 页</a>
    <c:if test="${page.start-page.count>=0}">
        <a href="?start=${page.start-page.count}">上一页</a>
    </c:if>
    <c:if test="${page.start-page.count<0}">
        <a href="javascript:void(0)">上一页</a>
    </c:if>
    <c:if test="${page.start+page.count<=page.last}">

        <a href="?start=${page.start+page.count}">下一页</a>
    </c:if>
    <c:if test="${page.start+page.count>page.last}">
        <a href="javascript:void(0)">下一页</a>
    </c:if>
    <a href="?start=${page.last}">末 页</a>
</div>
<div style="text-align:center;margin-top:40px">
    <form method="post" action="/students">
        名字： <input name="name" value="" type="text"> <br><br>
        qq: <input name="qq" value="" type="text"> <br><br>
        修真类型：<input name="type" value="" type="text"> <br><br>
        入学时间：<input name="time" value="" type="text"> <br><br>
        毕业院校：<input name="graduateInstitutions" value="" type="text"> <br><br>
        日报链接：<input name="dailyLink" value="" type="text"> <br><br>
        入门誓言：<input name="volunteer" value="" type="text"> <br><br>
        <input name="createAt" value="<%=System.currentTimeMillis()%>" type="hidden"> <br><br>
        <input name="updateAt" value="<%=System.currentTimeMillis()%>" type="hidden"> <br><br>
        <%--创建时间：<input name="createAt" value="" type="text"> <br><br>--%>
        <%--更新时间：<input name="updateAt" value="" type="text"> <br><br>--%>
        <input type="submit" value="增加分类">
    </form>
</div>
<%--<div style="text-align:center;margin-top:40px">--%>
    <%--<form:form method="post"  commandName="student" action="/students">--%>
        <%--name:<form:input path="name"/>--%>
        <%--<form:errors path="name" cssClass="error"/><br><br/>--%>
        <%--qq: <sf:input path="qq"/>--%>
        <%--<sf:errors path="qq" cssClass="error"/><br/>--%>
        <%--type:<sf:input path="type"/>--%>
        <%--<sf:errors path="type" cssClass="error"/><br/>--%>
        <%--time:<sf:input path="time"/>--%>
        <%--<sf:errors path="time" cssClass="error"/><br/>--%>
        <%--school: <sf:input path="graduateInstitutions"/>--%>
        <%--<sf:errors path="graduateInstitutions" cssClass="error"/><br/>--%>
        <%--dailyLink:<sf:input path="dailyLink"/>--%>
        <%--<sf:errors path="dailyLink" cssClass="error"/><br/>--%>
        <%--volunteer:<sf:input path="volunteer"/>--%>
        <%--<sf:errors path="volunteer" cssClass="error"/><br/>--%>
        <%--创建时间:<sf:input path="createAt"/>--%>
        <%--<sf:errors path="createAt" type="hidden" value="<%=System.currentTimeMillis()%>"/>--%>
        <%--更新时间:<sf:input path="updateAt"/>--%>
        <%--<sf:errors path="updateAt" type="hidden" value="<%=System.currentTimeMillis()%>"/>--%>
    <%--</form:form>--%>
<%--</div>--%>
</div>