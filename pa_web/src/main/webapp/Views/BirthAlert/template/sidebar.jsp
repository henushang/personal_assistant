<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas" style="height:100%">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li><a href="admin-index.html"><span class="am-icon-home"></span> 首页</a></li>
        <li><a href="${domain_name}/birth_alert/birth_list/${cur_id}"><span class="am-icon-list"></span> 生日列表</a></li>
        <li><a href="${domain_name}/birth_alert/add"><span class="am-icon-plus-square-o"></span> 添加记录</a></li>
        <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
      </ul>

    </div>
  </div>
  <!-- sidebar end -->
