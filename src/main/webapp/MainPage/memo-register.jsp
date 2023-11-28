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
        textarea {
            width: 100%;
            height: 6.25em;
            border: none;
            resize: none;
        }

        .fullScreen{
            background: #f3f3f3;
            height: 100vh;

        }

        .fullScreen .web-so{
            width: 25%;
            margin: 9rem auto;
            padding: 0;

        }

        .fullScreen .web-so .so-register{
            display: flex;
            flex-flow: row wrap; justify-content: center;
        }

        .fullScreen .web-so .so-register .px-4{
            width: 80%;
            margin: 2.5rem 0;

        }
        .fullScreen .web-so .so-register .px-4 .mb-3 {
            padding-bottom: 5%;
        }

        .fullScreen .web-so .so-register .px-4 .mb-3:last-child{
            display: flex; flex-flow: row wrap;
            justify-content: center;
        }

        /*.fullScreen .web-so .so-register .cnsu-logo{*/
        /*    background: url("https://i.namu.wiki/i/8-appfHuJ_E2TrT83RDobLOh7O0dhLeFVvsC-1C_i9-mcycmpnFkDw_LBp-u5PsLO4G-n9NezdM1aDIB-e2YgQ.svg") no-repeat center/contain;*/

        /*    width: 15vw; height: 10vh;*/
        /*    margin: auto;*/
        /*}*/

    </style>

    <title>jsp study</title>
</head>
<body>
<%
    System.out.println(session.getAttribute("id"));

%>
<div class="fullScreen p-3 m-0 border-0 bd-example m-0 border-0">
    <div class="dropdown-menu web-so">
        <div class="so-register">
            <form method="post" action="AddMemo" class="px-4 py-3">
                <div class="mb-3">
                    <label for="date" class="form-label">날짜</label>
                    <input type="date" class="form-control" id="date" name="date">
                </div>
                <div class="mb-3">
                    <label for="memo" class="form-label">메모내용</label>
                    <textarea type="text" class="form-control" id="memo" name="memo"></textarea>
                </div>
                <input type="submit"  value="추가" class="btn btn-primary">
            </form>
        </div>
    </div>
</div>
</body>
</html>