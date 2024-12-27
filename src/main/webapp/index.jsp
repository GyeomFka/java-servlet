<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>서블릿 테스트</title>
</head>
<body>
    <h1>Servlet Test</h1>
    <div>
        <form action="/java-servlet/test" method="get">
            GET 이름 : <input type="text" name="name"/>
            <input type="submit" value="확인"/>
        </form>
    </div>
    <div>
        <form action="/java-servlet/test" method="post">
            POST 이름 : <input type="text" name="name"/>
            <input type="submit" value="확인"/>
        </form>
    </div>
</body>
</html>