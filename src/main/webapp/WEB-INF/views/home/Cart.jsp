<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../../common/taglib.jsp"%>

<body style="overflow: visible;">
	<main>
		<div class="row" style="margin-top: 10px;">

			<div class="col-xl-2 col-lg-2"></div>

			<div class="col-xl-8 col-lg-8">
				<input id="checkbox-all-cart-product" type="checkbox" style="position: absolute; top: 10px; left: -10px;"/>
				<h2 class="card-title" style="color: blue;">>Giỏ hàng</h2>
				<ul>
					<c:forEach var="product" items="${ products }">
						<li>

							<div class="row">
								<div class="col-xl-4 col-lg-4" >
									<input class="checkbox-cart-product" cartId="${product.cartId}" type="checkbox" style="position: absolute; top: 10px; left: -10px;"/>
									<a class="small" href="<c:url value='/detail'/>" style="display: inline-block;">
										<div class="single-profile mb-30"
											style="background-color: white; border-radius: 0px 0px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- Front -->
											<div class="single-profile-front" style="height: 350px;">
												<div class="profile-img">
													<img style="height: 250px;"
														src="<c:url value="/resources/img/1.jpg"/>" alt=""
														style="border-radius: 10px;">

												</div>

											</div>
										</div>
									</a>
								</div>
								<div class="col-xl-8 col-lg-8">

									<div class="row" style="margin-bottom: 5px;">
										<h3 style="color: blue;">${product.name}</h3>
										<button class="boxed-btn" style="size: 8px; margin-left: 10px;">Còn hàng</button>
									</div>

									<div class="row" style="background-color: #fafafa;">
										<h5 style="color: red; margin-right: 50px;"><fmt:formatNumber value = "${product.price}" type = "currency" currencyCode="VND" maxFractionDigits="0"/></h5>
									</div>
									<div class="row"
										style="background-color: #fafafa; margin-top: 10px;">
										<p>${product.described}</p>
									</div>
									<div class="row" style="margin-top: 10px;">
										<label class="col-sm-3 col-form-label">Số lượng</label>
										<div class="col-sm-3">
											<input type="number" min="1" class="form-control" id="amount" value="${product.amount}"
												name="amount">
										</div>
										<div class=" col-xl-6 col-lg-6 col-md-6"
											style="text-align: right;">
											<form action="<c:url value='/cart/delete/${product.productId}'/>" method="post">
												<button type="submit" class="send-btn" 
													style="height: 40px; background: gray;">Xóa khỏi giỏ hàng
												</button>
											</form>
											

										</div>
									</div>
									<div style="margin-top: 10px; text-align: right;">
										<h5 style="color: blue;">Tổng : <fmt:formatNumber value = "${product.prices}" type = "currency" currencyCode="VND" maxFractionDigits="0"/></h5>
									</div>


								</div>
							</div>


						</li>
						<hr>
					</c:forEach>
					
					
				</ul>
				<div style="margin-top: 10px; text-align: right;">
					<h2 style="color: red;">Tổng : <fmt:formatNumber value = "${sumPrices}" type = "currency" currencyCode="VND" maxFractionDigits="0"/></h2>
				</div>
				<hr>
				<div>
					<form id="form-dat-mua" action="<c:url value='/order'/>" method="post">
						<input id="cartIds" name="cartIds" hidden="true" />
						<div style="text-align: center;">
							<h2>Thông tin mua hàng</h2>
						</div>
	
						<div class="form-group row">
							<label class="col-sm-3 col-form-label">Tên người nhận
								hàng:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id=""name"" name="name">
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-3 col-form-label">Số điện thoại người
								nhận:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="phone" name="phone">
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-3 col-form-label">Địa chỉ nhận hàng:</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" id="address" name="address">
							</div>
						</div>
						
						<div class="form-group row">
							<label class="col-sm-3 col-form-label">Phương thức thanh
								toán:</label>
							<div class="col-sm-9">
								<select class="form-control" name="paymentMethod" id="paymentMethod"
									style="margin-bottom: 0px; float: right;">
									<!--  position: absolute; float: 0 -->
									<option value="1">Chuyển khoản</option>
									<option value="2">Thanh toán khi nhận hàng</option>
	
								</select>
							</div>
						</div>
						<div style="text-align: right;">
							<a class="small" href="<c:url value='/purchase-order'/>">
	
								<button id="btn-dat-mua" type="submit" class="send-btn"
									style="height: 40px; text-transform: uppercase;">ĐẶT MUA</button>
							</a>
						</div>
					</form>
					
				</div>
			</div>


			<div class="col-xl-2 col-lg-2"></div>

		</div>
	</main>


</body>