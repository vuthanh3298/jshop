<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@include file="../taglib.jsp"%>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
     <div class="app-sidebar sidebar-shadow "style="margin-top: none;">
                <div class="app-header__logo">
                    <div class="logo-src"></div>
                    <div class="header__pane ml-auto">
                        <div>
                            <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                                    <span class="hamburger-box">
                                        <span class="hamburger-inner"></span>
                                    </span>
                                </button>
                        </div>
                    </div>
                </div>
                <div class="app-header__mobile-menu">
                    <div>
                        <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                                <span class="hamburger-box">
                                    <span class="hamburger-inner"></span>
                                </span>
                            </button>
                    </div>
                </div>
                <div class="app-header__menu">
                    <span>
                            <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                                <span class="btn-icon-wrapper">
                                </span>
                    </button>
                    </span>
                </div>
                <div class="scrollbar-sidebar">
                    <div class="app-sidebar__inner">
                        <ul class="vertical-nav-menu">
                            <li class="app-sidebar__heading">
									Mobile shop
							</li>
                            <li>
                                <a class="mm-active" href='<c:url value="/"/>'>
			                     Trang chủ</a>
                            </li>
                            <li class="app-sidebar__heading">Chức năng admin</li>
                            <li>
                                <a href='<c:url value="/admin/users"/>'>
                                    </i> Quản lý người dùng
                                </a>
                            </li>
                             <li>
                                <a href='<c:url value="/admin/products"/>'>
                                    </i> Quản lý sản phẩm
                                </a>
                            </li>
                            <li>
                                <a href='<c:url value="/admin/books"/>'>
                                    </i> Đơn hàng
                                </a>
                            </li>
                           
                        </ul>
                    </div>
                </div>
            </div>
        
    