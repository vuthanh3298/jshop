<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../taglib.jsp"%>
<div id="main-image" class="slider-area">
	<!-- Mobile Menu -->
	<div class="slider-active" style="z-index: 1;">
		<div class="single-slider  d-flex align-items-center"
			style="height: 250px; background-repeat: no-repeat; background-position: center center; background-size: cover"
			data-background="<c:url value="/resources/img/6.jpg"/>">
			<div class="container">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12">

						<div class="hero__caption">
							<div data-animation="fadeInLeft" data-delay=".6s">


								<div class="form-wrapper"
									style="background: rgba(255, 248, 153, 0.424); border: 2px solid #cc0000; border-radius: 10px; padding: 15px; margin: 20px;">
									<form action="<c:url value='/search'/>" method="POST">
										<div class="row">
											<div class="col-lg-2 col-md-2">
												<div class="select-itms">
													<select name="manufacturer" id="manufacturer"
														style="display: none;">
														<option value="-1">Hãng</option>
														<option value="all">Tất cả</option>
														<c:forEach var="manufacturer" items="${manufacturers}">
															<option value="${manufacturer.id}">${manufacturer.name}</option>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="col-lg-2 col-md-2">
												<div class="select-itms">
													<select name="minPrice" id="minPrice"
														style="display: none;">
														<option value="-1">Giá thấp nhất</option>
														<option value="1000000">0</option>
														<option value="1000000">1 Triệu</option>
														<option value="3000000">3 Triệu</option>
														<option value="5000000">5 Triệu</option>
														<option value="10000000">10 Triệu</option>
														<option value="30000000">30 Triệu</option>
														<option value="50000000">50 Triệu</option>
													</select>
												</div>
											</div>

											<div class="col-lg-2 col-md-2">
												<div class="select-itms">
													<select name="maxPrice" id="maxPrice"
														style="display: none;">
														<option value="-1">Giá cao nhất</option>
														<option value="1000000">1 Triệu</option>
														<option value="3000000">3 Triệu</option>
														<option value="5000000">5 Triệu</option>
														<option value="10000000">10 Triệu</option>
														<option value="30000000">30 Triệu</option>
														<option value="50000000">50 Triệu</option>
														<option value="-1">Không giới hạn</option>
													</select>
												</div>
											</div>
											<div class="col-lg-4 col-md-4 mb-4">
												<div class="form-box">
													<input type="text" name="condition" placeholder="Từ khoá">
												</div>
											</div>

											<div class="col-lg-2 col-md-2 mb-4">
												<button type="submit" class="send-btn">Tìm kiếm!</button>
											</div>

										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
