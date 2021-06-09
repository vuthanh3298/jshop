<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../../common/taglib.jsp"%>
<div class="card-body">
	<div class="main-card mb-3 card">
		<div class="card-header">
			<div class="btn-actions-pane-right">
				<div class="nav">
					<a data-toggle="tab" href="#tab-eg4-0"
						class="border-0 btn-pill btn-wide btn-transition btn btn-outline-danger show active">Doanh
						thu theo tháng</a> <a data-toggle="tab" href="#tab-eg4-1"
						class="border-0 btn-pill btn-wide btn-transition btn btn-outline-danger show">Doanh
						thu theo quý</a> <a data-toggle="tab" href="#tab-eg4-2"
						class="mr-1 ml-1 btn-pill btn-wide border-0 btn-transition btn btn-outline-danger show">Doanh
						thu theo năm</a> <a data-toggle="tab" href="#tab-eg4-3"
						class="border-0 btn-pill btn-wide btn-transition btn btn-outline-danger show ">Sản
						phẩm tồn kho</a> <a data-toggle="tab" href="#tab-eg4-4"
						class="border-0 btn-pill btn-wide btn-transition btn btn-outline-danger show ">Sản
						phẩm bán chạy</a>
				</div>
			</div>
		</div>
		<div class="card-body">
			<div class="tab-content">
				<div class="tab-pane show active" id="tab-eg4-0" role="tabpanel">
					<div class="row" style="width: 100%;">
						<h2 style="color: blue;">Biểu đồ doanh thu theo tháng của năm</h2>
					</div>
					${year} và ${year -1}
					<canvas id="lineChart"></canvas>
				</div>
				<div class="tab-pane show " id="tab-eg4-1" role="tabpanel">
					<div class="row" style="width: 100%;">
						<h2 style="color: blue;">Doanh thu theo quý</h2>
					</div>
					<select class="form-control" name="yearPieChart" id="yearPieChart"
						style="margin-bottom: 0px; width: 300px;">
						<option value="${year}">${year}</option>
						<option value="${year-1}">${year-1}</option>
						<option value="${year-2}">${year-2}</option>
					</select>
					<canvas id="pieChart"></canvas>
				</div>
				<div class="tab-pane show " id="tab-eg4-2" role="tabpanel">
					<div class="row" style="width: 100%;">
						<h2 style="color: blue;">Doanh thu theo năm</h2>
					</div>
					<canvas id="barChart"></canvas>
				</div>
				<div class="tab-pane show " id="tab-eg4-3" role="tabpanel">
					<div class="row" style="width: 100%;">
						<h2 style="color: blue;">Sản phẩm tồn kho</h2>
					</div>
					<div class="scroll-area-md" style="height: 700px;">
						<div class="card-body">
							<ul class="list-group">
								<c:forEach var="i" begin="1" end="10">
									<%-- <c:forEach var="product" items="${products}"> --%>
									<li class="list-group-item-action list-group-item">
										<div class="single-profile-front row">
											<div class="profile-img col-lg-2">
												<img src="<c:url value="/resources/img/1.jpg"/>" alt=""
													style="border-radius: 10px 10px 10px 10px; width: 150px; height: 100px;">
											</div>
											<div class="col-lg-8">
												<a href="/admin/chi-tiet-bat-dong-san-admin?id=${bds.id}">
													<div class="profile-caption"
														style="margin-left: 5px; margin-right: 5px; text-align: left;">
														<h6 style="color: black;">Điện thoại iPhone 12 Pro
															128GB Xám</h6>
														<h6 style="color: blue;">Giá: 19.990.000 ₫- Số lượng:
															9</h6>
													</div>
												</a>
											</div>
											<div class="col-lg-2"></div>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="tab-pane show " id="tab-eg4-4" role="tabpanel">
					<div class="row" style="width: 100%;">
						<h2 style="color: blue;">Sản phẩm bán chạy</h2>
					</div>
					<div class="scroll-area-md" style="height: 700px;">
						<div class="card-body">
							<ul class="list-group">
								<c:forEach var="i" begin="1" end="10">
									<%-- <c:forEach var="product" items="${products}"> --%>
									<li class="list-group-item-action list-group-item">
										<div class="single-profile-front row">
											<div class="profile-img col-lg-2">
												<img src="<c:url value="/resources/img/1.jpg"/>" alt=""
													style="border-radius: 10px 10px 10px 10px; width: 150px; height: 100px;">
											</div>
											<div class="col-lg-8">
												<a href="/admin/chi-tiet-bat-dong-san-admin?id=${bds.id}">
													<div class="profile-caption"
														style="margin-left: 5px; margin-right: 5px; text-align: left;">
														<h6 style="color: black;">Điện thoại iPhone 12 Pro
															128GB Xám</h6>
														<h6 style="color: blue;">Giá: 19.990.000 ₫- Số lượng:
															9</h6>
													</div>
												</a>
											</div>
											<div class="col-lg-2"></div>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
</div>
