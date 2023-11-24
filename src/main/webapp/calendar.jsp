<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Calendar"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.smg.MemoDAO" %>
<%@ page import="com.jsp.smg.Memo" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
    request.setCharacterEncoding("utf-8");

    Calendar cal = Calendar.getInstance();

    // 시스템 오늘날짜
    int ty = cal.get(Calendar.YEAR);
    int tm = cal.get(Calendar.MONTH)+1;
    int td = cal.get(Calendar.DATE);

    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH)+1;

    // 파라미터 받기
    String sy = request.getParameter("year");
    String sm = request.getParameter("month");

    if(sy!=null) { // 넘어온 파라미터가 있으면
        year = Integer.parseInt(sy);
    }
    if(sm!=null) {
        month = Integer.parseInt(sm);
    }

    cal.set(year, month-1, 1);
    year = cal.get(Calendar.YEAR);
    month = cal.get(Calendar.MONTH)+1;

    int week = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)

    String nowDate = Integer.toString(ty) + Integer.toString(tm) + Integer.toString(td);

    // MemoDAO를 사용하여 데이터베이스에서 memoList를 가져옴
    List<Memo> memoList = MemoDAO.allMemoList();
    request.setAttribute("memoList", memoList);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">
    <style type="text/css">
        *{
            margin: 0; padding: 0;
            box-sizing: border-box;
        }

        body {
            font-size: 14px;
            font-family: "맑은 고딕", 나눔고딕, 돋움, sans-serif;
        }

        a {
            color: #000;
            text-decoration: none;
            cursor: pointer;
        }
        a:active, a:hover {
            text-decoration: underline;
            color: #F28011;
        }

        .calendar {
            width: 280px;
            margin: 30px auto;
        }
        .calendar .title{
            height: 37px;
            line-height: 37px;
            text-align: center;
            font-weight: 600;
        }

        .calendar .selectField {
            border: 1px solid #999;
            padding: 2px 7px;
            border-radius: 3px;
            font-family: "맑은 고딕", 나눔고딕, 돋움, sans-serif;
            vertical-align: baseline;
        }

        .calendar table {
            width: 100%;
            border-collapse: collapse;
            border-spacing: 0;
        }

        .calendar table thead tr:first-child{
            background: #f6f6f6;
        }

        .calendar table td{
            padding: 10px;
            text-align: center;
            border: 1px solid #ccc;
        }

        .calendar table td:nth-child(7n+1){
            color: red;
        }
        .calendar table td:nth-child(7n){
            color: blue;
        }

        .calendar table tbody td:hover{
            background: #919191;
        }

        .calendar table td:hover {

        }

        .calendar table td.gray {
            color: #ccc;
        }
        .calendar table td.today{
            font-weight:700;
            background: #E6FFFF;
        }

        .calendar .nowDay{
            height: 25px;
            line-height: 25px;
            text-align: right;
            font-size: 12px;
        }
    </style>

    <script type="text/javascript">
        var pos = 0;
        function change() {
            var f = document.frm;
            f.action="calendar.jsp";
            f.submit();
        }

        function MouseClickEvent(obj) {
            if(pos)
                pos.style.background = "";
            obj.style.background = "rgb(255,129,129)";
            if (pos.className === "today")
                pos.style.background = "rgb(230,255,255)";
            pos = obj;

            // 선택한 날짜의 메모를 서버에서 가져와서 표시
            var selectedDate = obj.innerText;
            var selectedYear = document.getElementsByName("year")[0].value;
            var selectedMonth = document.getElementsByName("month")[0].value;

            var selectDate = selectedYear + selectedMonth + selectedDate;
            console.log(selectDate);

            // JSP 코드를 직접 실행하고 데이터를 렌더링
            var selectedMemoList = [

                <% for (Memo memo : memoList) {

                    //if (memo.getDate().equals(selectDate))%>
                { date: '<%= memo.getDate() %>', memo: '<%= memo.getMemo() %>' },
                <%
                } %>
            ];

            // 이전에 표시된 메모를 지움
            var memoListElement = document.getElementById("memoList");
            while (memoListElement.firstChild) {
                memoListElement.removeChild(memoListElement.firstChild);
            }

            // 새로운 메모를 추가
            var hasMemo = false;
            for (var i = 0; i < selectedMemoList.length; i++) {
                var memoItem = document.createElement("li");
                memoItem.textContent = selectedMemoList[i].memo;
                memoListElement.appendChild(memoItem);
                hasMemo = true;
            }

            // 만약 메모가 없을 경우
            if (!hasMemo) {
                var noMemoItem = document.createElement("li");
                noMemoItem.textContent = "";
                memoListElement.appendChild(noMemoItem);
            }
        }
    </script>

</head>
<body>

<div class="calendar">
    <div class="title">
        <form name="frm" method="post">
            <select name="year" class="selectField" onchange="change()">
                <% for(int i=year-5; i<=year+5; i++){ %>
                <option value="<%=i%>" <%=year==i?"selected='selected'":"" %>><%=i%>년</option>
                <%} %>
            </select>
            <select name="month" class="selectField" onchange="change()">
                <% for(int i=1; i<=12; i++){ %>
                <option value="<%=i%>" <%=month==i?"selected='selected'":"" %>><%=i%>월</option>
                <%} %>
            </select>
        </form>
    </div>

    <table>
        <thead>
        <tr>
            <td>일</td>
            <td>월</td>
            <td>화</td>
            <td>수</td>
            <td>목</td>
            <td>금</td>
            <td>토</td>
        </tr>
        </thead>
        <tbody>
        <%
            // 1일 앞 달
            Calendar preCal = (Calendar)cal.clone();
            preCal.add(Calendar.DATE, -(week-1));
            int preDate = preCal.get(Calendar.DATE);

            out.print("<tr>");
            // 1일 앞 부분
            for(int i=1; i<week; i++) {
                //out.print("<td> </td>");
                out.print("<td class='gray' onclick='MouseClickEvent(this)'>"+(preDate++)+"</td>");
            }

            // 1일부터 말일까지 출력
            int lastDay = cal.getActualMaximum(Calendar.DATE);
            String cls;
            for(int i=1; i<=lastDay; i++) {
                cls = year==ty && month==tm && i==td ? "today":"";

                out.print("<td class='"+cls+"'onclick='MouseClickEvent(this)'>"+i+"</td>");
                if(lastDay != i && (++week)%7 == 1) {
                    out.print("</tr><tr>");
                }
            }

            // 마지막 주 마지막 일자 다음 처리
            int n = 1;
            for(int i = (week-1)%7; i<6; i++) {
                // out.print("<td> </td>");
                out.print("<td class='gray' onclick='MouseClickEvent(this)'>"+(n++)+"</td>");
            }
            out.print("</tr>");
        %>
        </tbody>
    </table>

    <div class="nowDay">
        <a href="calendar.jsp">오늘날짜로</a>
    </div>

    <div class="schedule">
        <h2>메모</h2>
        <ul id="memoList">
            <!-- 메모 내용이 들어올 부분-->
            <!--
<%--            <c:forEach var="memo" items="${memoList}">--%>
                <c:set var="nowDate" value="<%= nowDate %>"></c:set>
<%--                <c:if test="${memo.memo eq nowDate}">--%>
<%--                    <li>${memo.memo}</li>--%>
<%--                </c:if>--%>
<%--            </c:forEach>--%>
            -->
        </ul>
    </div>

</div>
</body>
</html>