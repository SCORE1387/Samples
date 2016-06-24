<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="container content">
    <div class="row">
        <div class="col-md-12">
            <%--@elvariable id="msg" type="java"--%>
            <c:if test="${msg != null}">
                <h2><c:out value="${msg}"/></h2>
            </c:if>
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-md-12">
            <%--@elvariable id="points" type="java.util.List"--%>
            <c:forEach var="point" items="${points}">
                <strong>${point}<br></strong>
            </c:forEach>
        </div>
    </div>
</div>
