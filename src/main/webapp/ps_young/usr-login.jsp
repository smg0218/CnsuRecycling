<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">


    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css">

    <link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <link href="../css/Common.css">

    <style>

        .fullScreen{
            background: #f3f3f3;

            height: 100vh;
        }

        .fullScreen .web-login{
            width: 30%;
            height: 60vh;
            margin: 6rem auto 9rem;
            padding: 0;

        }

        .fullScreen .web-login .login-child{

            display: flex; flex-flow: column wrap;
            margin: 3.6rem auto;

        }

        .fullScreen .web-login .login-child .px-4 {

            margin: 3.5rem 1.2rem;

        }

        .fullScreen .web-login .login-child .cnsu-logo{
            background: url("https://i.namu.wiki/i/8-appfHuJ_E2TrT83RDobLOh7O0dhLeFVvsC-1C_i9-mcycmpnFkDw_LBp-u5PsLO4G-n9NezdM1aDIB-e2YgQ.svg") no-repeat center/contain;

            width: 15vw; height: 10vh;
            margin: auto;
        }

    </style>

    <title>jsp study</title>
</head>
<body>
<div class="fullScreen p-3 m-0 border-0 bd-example m-0 border-0">
    <div class="dropdown-menu web-login">
        <div class="login-child">
            <div class="cnsu-logo"></div>
            <form method="post" action="loginPro" class="px-4 py-3">
                <div class="mb-3">
                    <label for="exampleDropdownFormEmail1" class="form-label">아이디</label>
                    <input type="text" class="form-control" id="exampleDropdownFormEmail1" name="id">
                </div>
                <div class="mb-3">
                    <label for="exampleDropdownFormPassword1" class="form-label">패스워드</label>
                    <input type="password" class="form-control" id="exampleDropdownFormPassword1" name="password" >
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
</div>
</body>
</html>