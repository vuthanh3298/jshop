<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../../common/taglib.jsp"%>


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign in</title>
</head>

<body>
	<div class="container">
		<%@include file="../../common/taglib.jsp"%>
		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-xl-10 col-lg-12 col-md-9">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-6 d-none d-lg-block" style="">
								<img alt="" src="<c:url value="/resources/img/1.jpg"/>" style="width: 100%; height: 80%;">
							</div>
							<div class="col-lg-6">
								<div class="p-5">
									<c:if test="${not empty message}">
										<div class="alert alert-warning">${message}</div>
									</c:if>
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
									</div>
									<form action='<c:url value="/j_spring_security_login"/>' method="POST">
										<div class="form-group">
											<input type="email" class="form-control form-control-user"
												aria-describedby="emailHelp"
												placeholder="Enter Email Address..." name="email">
										</div>
										<div class="form-group">
											<input type="password" class="form-control form-control-user"
												placeholder="Password" name="password">
										</div>
										<div class="form-group">
											<div class="custom-control custom-checkbox small">
												<input type="checkbox" class="custom-control-input"
													id="customCheck"> <label
													class="custom-control-label" for="customCheck">Remember Me</label>
											</div>
										</div>
										<button class="btn btn-primary btn-user btn-block"
											type="submit">Login</button>
										<hr>
										
									</form>
									<hr>
									<div class="text-center">
										<a class="small" href="<c:url value='/forgot-password'/>">Forgot
											Password?</a>
									</div>
									<div class="text-center">
										<a class="small" href="<c:url value='/signup'/>">Create an Account!</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>

		</div>

	</div>
</body>

</html>