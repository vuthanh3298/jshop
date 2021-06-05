<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../../common/taglib.jsp"%>

<body style="overflow: visible;">
	<main>
		<div class="row" style="margin-top: 10px;">

			<div class="col-xl-2 col-lg-2"></div>

			<div class="col-xl-8 col-lg-8">
				<h2 class="card-title" style="color: blue;">>Giỏ hàng</h2>
				<ul>
					<c:forEach var="i" begin="1" end="4">
						<li>

							<div class="row">
								<div class="col-xl-4 col-lg-4">
									<a class="small" href="<c:url value='/detail'/>">
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
										<h3 style="color: blue;">Điện thoại iPhone 12 Pro 128GB
											Xám</h3>
										<button class="boxed-btn" style="size: 8px;">Còn hàng</button>
									</div>

									<div class="row" style="background-color: #fafafa;">
										<h5 style="color: red; margin-right: 50px;">19.990.000 ₫</h5>
										Giá niêm yết :
										<h5 style="color: gray;">32.990.000 ₫</h5>
									</div>
									<div class="row"
										style="background-color: #fafafa; margin-top: 10px;">
										<p>Bên cạnh biên bản Galaxy Note 20 thường, Samsung còn
											cho ra mắt Note 20 Ultra 5G cho khả năng kết nối dữ liệu cao
											cùng thiết kế nguyên khối sang trọng, bắt mắt. Đây sẽ là sự
											lựa chọn hoàn hảo dành cho bạn để sử dụng mà không bị lỗi
											thời sau thời gian dài ra mắt.</p>
									</div>
									<div class="row" style="margin-top: 10px;">
										<label class="col-sm-3 col-form-label">Số lượng</label>
										<div class="col-sm-3">
											<input type="number" min="1" class="form-control" id="amount"
												name="amount">
										</div>
										<div class=" col-xl-6 col-lg-6 col-md-6"
											style="text-align: right;">
											<button type="submit" class="send-btn"
												style="height: 40px; background: gray;">Xóa khỏi
												giỏ hàng</button>

										</div>
									</div>
									<div style="margin-top: 10px; text-align: right;">
										<h5 style="color: blue;">Tổng : 4.000.000 vnd</h5>
									</div>


								</div>
							</div>


						</li>
					</c:forEach>
				</ul>
				<div style="margin-top: 10px; text-align: right;">
					<h2 style="color: red;">Tổng : 4.000.000 vnd</h2>
				</div>
				<hr>
				<div>
					<div style="text-align: center;">
						<h2>Thông tin mua hàng</h2>
					</div>

					<div class="form-group row">
						<label class="col-sm-3 col-form-label">Tên người nhận
							hàng:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="userId" name="userId">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 col-form-label">Số điện thoại người
							nhận:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="userId" name="userId">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 col-form-label">Địa chỉ nhận hàng:</label>
						<div class="col-sm-9">
							<input type="text" class="form-control" id="userId" name="userId">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-sm-3 col-form-label">Phương thức thanh
							toán:</label>
						<div class="col-sm-9">
							<select class="form-control" name="roleId" id="roleId"
								style="margin-bottom: 0px; float: right;">
								<!--  position: absolute; float: 0 -->
								<option value="1">Chuyển khoản</option>
								<option value="2">Thanh toán khi nhận hàng</option>

							</select>
						</div>
					</div>
					<div style="text-align: right;">
						<a class="small" href="<c:url value='/purchase-order'/>">

							<button type="submit" class="send-btn"
								style="height: 40px; text-transform: uppercase;">ĐẶT
								MUA</button>
						</a>
					</div>
				</div>
			</div>


			<div class="col-xl-2 col-lg-2"></div>

		</div>
	</main>


</body>