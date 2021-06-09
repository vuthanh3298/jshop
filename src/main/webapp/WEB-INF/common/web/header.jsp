<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@include file="../taglib.jsp"%>
<header>
  <!-- Header Start -->
  <div class="header-area">
    <div class="main-header">
      <div class="header-top top-bg d-none d-lg-block">
        <div class="container-fluid">
          <div class="col-xl-12">
            <div class="row d-flex justify-content-between align-items-center">
              <div class="header-info-left">
                <ul>
                  <li> <a href="/"> <strong>QUẢN LÝ BÁN ĐIỆN THOẠI</strong> </a> </li>
                  <li style="color: #ffd400;">Hotline: 0123456789</li>
                </ul>
              </div>

              <div class="header-info-right">
             
                <ul class="header-social">
                  <sec:authorize access="isAnonymous()">
                    <li><a href="/signin"> Đăng nhập</a></li>
                    <li><a href="/signup"> Đăng ký</a></li>
                  </sec:authorize>

				  <sec:authorize access="hasAnyAuthority('ADMIN')">
                    
                    <li><a href="/admin/users">Trang admin</a></li>
				  	
                  </sec:authorize>
                  
                  <sec:authorize access="isAuthenticated()">
                    <li>
                      	<a href="#">
							<sec:authentication property="principal.username" />
						</a>
                    </li>
                    <li>
                      	<a href="/logout">
							Đăng xuất
						</a>
                    </li>
                    <li>
                    	<a href="/cart">
	                    	<svg style="color: #ff656a; width: 25px; height: 25px;"
								xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-cart-plus-fill"
								viewBox="0 0 16 16">
															 <path
									d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1H.5zM6 14a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm7 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zM9 5.5V7h1.5a.5.5 0 0 1 0 1H9v1.5a.5.5 0 0 1-1 0V8H6.5a.5.5 0 0 1 0-1H8V5.5a.5.5 0 0 1 1 0z" />
							</svg>
						</a>
                    </li>
                  </sec:authorize>

                  
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Header End -->
</header>
