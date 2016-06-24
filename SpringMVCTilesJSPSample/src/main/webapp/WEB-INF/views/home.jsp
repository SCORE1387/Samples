<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="container content">
    <%--@elvariable id="msg" type="java"--%>
    <c:if test="${msg != null}">
        <h2></h2><c:out value="${msg}"/>
    </c:if>

    <%--@elvariable id="points" type="java.util.List"--%>
    <c:forEach var="point" items="${points}">
        <strong>${point}<br></strong>>
    </c:forEach>
</div>
