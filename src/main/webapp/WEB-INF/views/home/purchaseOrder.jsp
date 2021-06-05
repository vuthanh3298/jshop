<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../../common/taglib.jsp"%>

<body style="overflow: visible;">
	<main>
		<div class="row" style="margin-top: 10px;">

			<div class="col-xl-2 col-lg-2"></div>

			<div class="col-xl-8 col-lg-8">
				<h2 class="card-title" style="color: blue;">>Đơn mua</h2>
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
													<img style="height: 300px;"
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
											2
										</div>
										<div class=" col-xl-6 col-lg-6 col-md-6"
											style="text-align: right;">
											 <p> Trạng thái: <span  style=" color: red;">Đang giao</span></p>

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
				
			</div>


			<div class="col-xl-2 col-lg-2"></div>

		</div>
	</main>


</body>