<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    .jinruht{
        position: absolute;
        left: -150px;
        top: 35px;
    }
</style>

<div class="bhead">
    <div class="dianming">晨住酒店管理平台（前台界面）</div>
    <div class="bhright">
        <div class="jinruht"><a href="http://localhost:8080/ssm_house_web/pages/admin_login.jsp">进入后台</a></div>
        <span>Hi,${member.userName}
            <a href="${pageContext.request.contextPath}/member/logout"> 退出</a>

        </span>
    </div>
</div>