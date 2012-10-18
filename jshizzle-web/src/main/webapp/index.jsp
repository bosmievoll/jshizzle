<%@ page language="java"
         contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"
         session="true"
         isErrorPage="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>

    <title>JS &amp; Cloud bling™ Web</title>

    <link rel="stylesheet" type="text/css" href="styles/styles.css">
</head>

<body class="body">

    <a href="${pageContext.request.contextPath}/hello">Hello</a>
    <a href="${pageContext.request.contextPath}/resources/foo">Foo</a>
    <a href="${pageContext.request.contextPath}/resources/stuff">Stuff</a>
    <a href="${pageContext.request.contextPath}/stuff.xhtml">Stuff JSF</a>

</body>
</html>
