<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px;margin:0px auto;text-align:center">


    <div style="text-align:center;margin-top:40px">

        <form method="post" action="/students/${student.id}">
            <input type="hidden" name="_method" value="PUT">
        <%--<form method="post" action="updateStudent">--%>
            <form method="post" action="/students">
            名字： <input name="name" value="${student.name}" type="text"><br><br>
            qq:<input name="qq" value="${student.qq}" type="text"> <br><br>
            修真类型：<input name="type" value="${student.type}" type="text"> <br><br>
            入学时间：<input name="time" value="${student.time}" type="text"> <br><br>
            毕业院校：<input name="graduateInstitutions" value="${student.graduateInstitutions}" type="text"> <br><br>
            日报链接：<input name="dailyLink" value="${student.dailyLink}" type="text"> <br><br>
            入门誓言：<input name="volunteer" value="${student.volunteer}" type="text"> <br><br>
            创建时间：<input name="createAt" value="${student.createAt}" type="text"> <br><br>
            更新时间：<input name="updateAt" value="${student.updateAt}" type="text"> <br><br>
            <input type="hidden" value="${student.id}" name="id">
            <input type="submit" value="增加分类">
        </form>

    </div>
</div>