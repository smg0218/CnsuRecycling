<%@ page import="db.DBRepository" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/MainPage.css?after">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css">
    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">

    <title>Title</title>
</head>
<body>
<%
    String isLogin="로그아웃";
    String name;
    String loginInfo="님 반갑습니다!";

    String id = DBRepository.userInfo.get("id");

//    System.out.println(session.getAttribute("name"));
//    System.out.println(session.getAttribute("id"));
//    System.out.println(session.getAttribute("room_Number"));

    try{
        name= session.getAttribute("name").toString();
        if(name==null){
            loginInfo="로그인이 필요해요!";
            isLogin="로그인";
        }else{
            loginInfo=name+"님 반갑습니다!";
        }

    }catch (Exception e){
        e.printStackTrace();
    }



%>
<div class="wrap">
    <div class="header">
        <jsp:include page="../ps_young/top-menu.jsp"/>
    </div>
    <div class="main">
        <div class="main-1">
            <div class="pro">
                <div class="leftpro">
                    <div class="column">
                        <div class="program">
                            <div class="calender">
                                <jsp:include page="../ps_young/calendar.jsp"/>
                            </div>
                            <div class="schedule">
                                <div class="soregister">
                                    <a href="./so-register.jsp?id=${id}&room_Number=${room_Number}" class="sor">외박신청</a>
                                    <a href="./memo-register.jsp" class="sor">메모추가</a>
                                </div>
                            </div>
                        </div>
                        <div class="bus-schedule">
                            <div class="bus-am" style="background-image: url('../img/bus-am.jpg');"></div>
                            <div class="bus-pm" style="background-image: url('../img/bus-pm.jpg');"></div>
                        </div>
                    </div>
                </div>
                <div class="rightpro">
                    <div class="right-column">
                        <div class="logoutpro">
                            <div class="logout-column">
                                <a class="welcome"><%=loginInfo%></a>
                                <a class="logout-button" href="logout" ><%=isLogin%></a>
                            </div>
                        </div>
                        <div class="college-meal">
                            <div class="food" style="background-image: url('../img/food.jpg');"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">

    </div>
</div>


</body>
</html>