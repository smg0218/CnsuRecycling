<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">

    <%--  css reset  --%>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css">
    <%-- bootsteap --%>
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="../css/login.css" type="text/css" rel="stylesheet">

    <title>jsp study</title>
</head>
<body>
    <div class="fullScreen p-3 m-0 border-0 bd-example m-0 border-0">
        <div class="dropdown-menu web-login">
            <div class="cnsu-logo"></div>
            <form class="px-4 py-3">
                <div class="mb-3">
                    <label for="exampleDropdownFormEmail1" class="form-label">아이디</label>
                    <input type="text" class="form-control" id="exampleDropdownFormEmail1">
                </div>
                <div class="mb-3">
                    <label for="exampleDropdownFormPassword1" class="form-label">패스워드</label>
                    <input type="password" class="form-control" id="exampleDropdownFormPassword1" >
                </div>
                <div class="mb-3">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="dropdownCheck">
                        <label class="form-check-label" for="dropdownCheck">
                            로그인 정보 기억하기
                        </label>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">로그인</button>
            </form>
        </div>
    </div>
</body>
</html>