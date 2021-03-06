<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<jsp:include page="../../templ/base.jsp" />
<link rel="icon" type="image/png" href="${base_static}/amaze-ui/assets/i/favicon.png">
<link rel="apple-touch-icon-precomposed" href="${base_static}/amaze-ui/assets/i/app-icon72x72@2x.png">
<%-- <link rel="stylesheet" href="${base_static}/datetimepicker/css/bootstrap.min.css" />
<link rel="stylesheet" href="${base_static}/datetimepicker/css/bootstrap-datetimepicker.min.css" />
<link rel="stylesheet" href="${base_static}/datetimepicker/css/bootstrap-responsive.min.css" /> --%>
<link rel="stylesheet" href="${base_static}/amaze-ui/assets/css/amazeui.min.css" />
<link rel="stylesheet" href="${base_static}/amaze-ui/assets/css/admin.css">
	
<header class="am-topbar admin-header">
	<div class="am-topbar-brand">
		<strong>Birth Alert</strong> <small>❤</small>
	</div>

	<button
		class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
		data-am-collapse="{target: '#topbar-collapse'}">
		<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
	</button>

	<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

		<ul
			class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
			<li class="am-dropdown" data-am-dropdown><a
				class="am-dropdown-toggle" data-am-dropdown-toggle
				href="javascript:;"> <span class="am-icon-users"></span> 管理员 <span
					class="am-icon-caret-down"></span>
			</a>
				<ul class="am-dropdown-content">
					<li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
					<li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
					<li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
				</ul></li>
			<li class="am-hide-sm-only"><a href="javascript:;"
				id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span
					class="admin-fullText">开启全屏</span></a></li>
		</ul>
	</div>
</header>