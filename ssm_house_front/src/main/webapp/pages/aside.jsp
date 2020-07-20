<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="bleft">
    <div class="blogo"><a href="${pageContext.request.contextPath}/pages/main.jsp"><img src="../img/1.jpg"></a></div>
    <div class="bnav">
        <div class="bfenlei"><div class="btubiao"><img src="../img/7.png"></div><a href="${pageContext.request.contextPath}/pages/search_house.jsp"><span>订房查询管理</span></a></div>
        <div class="bfenlei"><div class="btubiao"><img src="../img/6.png"></div><a href="${pageContext.request.contextPath}/order/findByMid?mid=${member.mid}&page=1&size=5"><span>消费历史查询</span></a></div>
        <div class="bfenlei"><div class="btubiao"><img src="../img/9.png"></div><a href="${pageContext.request.contextPath}/pages/member_management.jsp"><span>个人信息管理</span></a></div>
        <%--<div class="bfenlei"><div class="btubiao"><img src="../img/8.png"></div><a href="shezhi.html"><span></span></a></div>--%>
    </div>
</div>