<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../../common/taglib.jsp"%>

<body style="overflow: visible;">
	<main>
	<div style="margin-left: 100px">
	
	<h2 class="card-title" style="color: blue;" > >Chi tiết sản phẩm </h2>
	</div>
		<div class="row">
			<div class="col-xl-6 col-lg-6">
				<div class="row">
					<div class="col-xl-1 col-lg-1"></div>
					<div class="offset-xl-1 offset-lg-1 col-xl-8 col-lg-8">
						<div class="h1-testimonial-active">
							<c:forEach var="i" begin="1" end="4">
								<div class="single-testimonial pt-65">
									<div class="single-profile-front">
										<div class="profile-img">

											<img src="<c:url value="/resources/img/1.jpg"/>" alt=""
												style="width: 100%; height: 400px;; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
										</div>
										<div class="profile-caption"></div>
									</div>
								</div>

							</c:forEach>
							<%-- <c:forEach var="url" items="${urlImg}">
                                <!-- Single Testimonial -->
                                <div class="single-testimonial pt-65">
                                    <div class="single-profile-front">
                                        <div class="profile-img">
                                            <img src="${url}" alt="" style="width: 100%; height: 600px;">
                                        </div>
                                        <div class="profile-caption"></div>
                                    </div>
                                </div>
                            </c:forEach> --%>

						</div>
					</div>

				</div>
			</div>
			<div class="col-xl-4 col-lg-4" style="margin-top: 100px;">
				<div class="row" style="margin-bottom: 5px;">
					<h3 style="color: blue;">${product.name}</h3> 
					<button class="boxed-btn" style="size: 8px; margin-left: 25px;">Còn hàng</button>
				</div>

				<div class="row" style="background-color: #fafafa;">
					<h5 style="color: red; margin-right: 50px;">
						<fmt:formatNumber value = "${product.price}" type = "currency" currencyCode="VND" maxFractionDigits="0"/>
					</h5>
					Giá niêm yết:
					<h5 style="color: gray; margin-left: 10px;"> <del> <fmt:formatNumber value = "${oldPrice}" type = "currency" currencyCode="VND" maxFractionDigits="0"/> </del></h5>
				</div>
				<div class="row"
					style="background-color: #fafafa; margin-top: 10px;">
					<p>${product.described}</p>
				</div>
				<form action="<c:url value='/cart/'/>" method="post">
					<input name="productId" value="${product.productId}" hidden="true">
					<div class="row" style="margin-top: 10px;">
						<label class="col-sm-3 col-form-label">Số lượng</label>
						<div class="col-sm-3">
							<input type="number" value="1" min="1" class="form-control" id="amount"
								name="amount">
						</div>
						<div class=" col-xl-6 col-lg-6 col-md-6" style="text-align: right;">
						
						
							<sec:authorize access="isAnonymous()">
								<a href="<c:url value='/midleware-purchase/${product.productId}'/>">
									<button type="button" class="send-btn" style="height: 40px;">Mua Ngay</button>
								</a>
							</sec:authorize>
	
							<sec:authorize access="isAuthenticated()">
								<button type="submit" class="send-btn" style="height: 40px;">Mua Ngay</button>
							</sec:authorize>
						
						</div>
					</div>
				</form>
			</div>


		</div>
	</main>


</body>