<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p><security:authentication property="principal.username"></security:authentication></p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>
		<!-- search form -->
		<!--<form action="#" method="get" class="sidebar-form">
    <div class="input-group">
        <input type="text" name="q" class="form-control" placeholder="搜索...">
        <span class="input-group-btn">
        <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
        </button>
      </span>
    </div>
</form>-->
		<!-- /.search form -->


		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>

			<li id="admin-index"><a href="${pageContext.request.contextPath}/pages/admin_main.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<!-- 菜单 -->
			<security:authorize access="hasRole('MANAGER')">

				<li class="treeview">
					<a href="#">
						<i class="fa fa-folder"></i> <span>系统用户管理</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
					<ul class="treeview-menu">


						<li id="admin-invoice-print">
							<a href="${pageContext.request.contextPath}/user/findAll.do">
								<i class="fa fa-circle-o"></i> 用户管理
							</a>
						</li>

						<li id="admin-profile">
							<a href="${pageContext.request.contextPath}/role/findAll.do">
								<i class="fa fa-circle-o"></i> 角色管理
							</a>
						</li>

						<li id="admin-dataform">
							<a href="${pageContext.request.contextPath}/permission/findAll.do">
								<i class="fa fa-circle-o"></i> 资源权限管理
							</a>
						</li>

					</ul>
				</li>

			</security:authorize>



			<security:authorize access="hasRole('STAFF1')">

				<li class="treeview">
					<a href="#">
						<i class="fa fa-pie-chart"></i> <span>会员信息管理</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
					<ul class="treeview-menu">

						<li id="charts-chartjs">
							<a href="${pageContext.request.contextPath}/member/findAllByPage?page=1&size=5">
								<i class="fa fa-circle-o"></i> 会员信息查询
							</a>
						</li>

						<li id="charts-morris">
							<a href="${pageContext.request.contextPath}/pages/admin_add_member.jsp">
								<i class="fa fa-circle-o"></i> 会员信息添加
							</a>
						</li>

					</ul>
				</li>

				<li class="treeview">
					<a href="#">
						<i class="fa fa-laptop"></i> <span>前台收银管理</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
					<ul class="treeview-menu">

						<li id="elements-general">
							<a href="${pageContext.request.contextPath}/order/findAllByPage2?page=1&size=5">
								<i class="fa fa-circle-o"></i> 确认预定
							</a>
						</li>

						<li id="elements-icons">
							<a href="${pageContext.request.contextPath}/pages/cashier_CheckIn.jsp">
								<i class="fa fa-circle-o"></i> 入住办理
							</a>
						</li>

						<li id="elements-icons2">
							<a href="${pageContext.request.contextPath}/house/findNotVacant ">
								<i class="fa fa-circle-o"></i> 离店办理
							</a>
						</li>

					</ul>
				</li>

				<li class="treeview">
					<a href="#">
						<i class="fa fa-edit"></i> <span>订单信息管理</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
					<ul class="treeview-menu">

						<li id="form-general2">
							<a href="${pageContext.request.contextPath}/order/findAllByPage?page=1&size=5">
								<i class="fa fa-circle-o"></i> 订单信息查询
							</a>
						</li>

					</ul>
				</li>

			</security:authorize>

			<security:authorize access="hasRole('STAFF2')">
			<li class="treeview">
				<a href="#">
					<i class="fa fa-table"></i> <span>客房清洁打扫</span>
					<span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
				</a>
				<ul class="treeview-menu">

					<li id="tables-simple">
						<a href="${pageContext.request.contextPath}/house/findDirty">
							<i class="fa fa-circle-o"></i> 客房打扫
						</a>
					</li>


				</ul>
			</li>


			<li class="treeview">
				<a href="#">
					<i class="fa fa-book"></i> <span>客房信息管理</span>
					<span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
				</a>
				<ul class="treeview-menu">

					<li id="form-general">
						<a href="${pageContext.request.contextPath}/house/findAllByPage?page=1&size=5">
							<i class="fa fa-circle-o"></i> 客房信息查询
						</a>
					</li>

					<li id="form-general3">
						<a href="${pageContext.request.contextPath}/pages/houser_add_house.jsp">
							<i class="fa fa-circle-o"></i> 客房信息添加
						</a>
					</li>

				</ul>
			</li>
			</security:authorize>

		</ul>
	</section>
	<!-- /.sidebar -->
</aside>