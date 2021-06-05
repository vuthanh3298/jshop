<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../../common/taglib.jsp"%>
<main>
	<style>
#main-image>div>div {
	overflow: visible;
}

#main-image ul {
	height: 250px;
	overflow: auto !important;
}
</style>


	<!-- slider Area End-->
	<!-- Team-profile Start -->
	<div class="team-profile team-padding"
		style="padding-top: 50px; padding-bottom: 50px;">
		<div class="container">

			<h3 style="color: blue;">Sản phẩm nổi bật</h3>


			<!-- Dự án nổi bật -->
			<div class="row">
				<div class="col-xl-12 col-lg-12 col-md-12">
					<div class="single-cases-img  size mb-30">
						<div class="h1-testimonial-active">
							<!-- Single Testimonial -->
							<c:forEach var="productsHotListItem" items="${productsHot}">
								<div class="single-testimonial">
									<div class="single-profile-front">
										<div class="profile-img">
											<div class="row">
												<c:forEach var="productHot" items="${productsHotListItem}">
													<div class="col-xl-3 col-lg-3 col-md-6">
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
																	<div class="row profile-caption ">
																		<div class="col-xl-5 col-lg-5 col-md-5"
																			style="margin-left: 5px; margin-right: 5px;">
																			<h6 class="title" style="color: black;">${productHot.name}</h6>
																			<p style="color: blue; font-size: 12px;">Giá:
																				${productHot.price}</p>

																		</div>
																		<div class=" col-xl-6 col-lg-6 col-md-6"
																			style="text-align: right;">
																			<svg style="color: #ff656a; width: 50px; height: 50px;" xmlns="http://www.w3.org/2000/svg" width="16"
																				height="16" fill="currentColor"
																				class="bi bi-cart-plus-fill" viewBox="0 0 16 16">
																				 <path d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1H.5zM6 14a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm7 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zM9 5.5V7h1.5a.5.5 0 0 1 0 1H9v1.5a.5.5 0 0 1-1 0V8H6.5a.5.5 0 0 1 0-1H8V5.5a.5.5 0 0 1 1 0z" />
																			</svg>
																			<!-- <button type="submit" class="send-btn">Mua</button> -->
																		</div>
																	</div>

																</div>
															</div>

														</a>
													</div>
												</c:forEach>
											</div>
										</div>
									</div>
								</div>


							</c:forEach>
							<!--  -->
						</div>
					</div>
				</div>
				<a href="<c:url value='/product-hot'/>"
					class="genric-btn success-border circle" style="margin-left: 50%;">Xem
					thêm</a>

			</div>
			<h3 style="color: blue;">Sản phẩm mới nhất</h3>
			<div class="row">
				<c:forEach var="i" begin="1" end="4">
					<div class="col-xl-3 col-lg-3 col-md-6">
						<a class="small" href="<c:url value='/detail'/>">
							<div class="single-profile mb-30"
								style="background-color: white; border-radius: 0px 0px 10px 10px; border: 1px solid #BDBDBD;">
								<!-- Front -->
								<div class="single-profile-front" style="height: 350px;">
									<div class="profile-img">
										<img style="height: 250px;"
											src="<c:url value="/resources/img/1.jpg"/>" alt=""
											style="border-radius: 10px 10px 10px 10px;">

									</div>
									<div class="profile-caption"
										style="margin-left: 5px; margin-right: 5px;">
										<h6 class="title" style="color: black;">IPHONE 10</h6>
										<p style="color: blue; font-size: 12px;">Giá: 100000</p>
									</div>
								</div>
							</div>

						</a>
					</div>
				</c:forEach>
				<a href="<c:url value='/product-new'/>"
					class="genric-btn success-border circle" style="margin-left: 50%;">Xem
					thêm</a>
			</div>

			<h3 style="color: blue;">Hãng điện thoại</h3>
		</div>
	</div>


	<!-- Completed Cases Start -->
	<div class="completed-cases">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xl-8 col-lg-8 col-md-col-md-7">
					<div class="completed-active owl-carousel owl-loaded owl-drag">


						<div class="owl-stage-outer">
							<div class="owl-stage"
								style="transform: translate3d(-1329px, 0px, 0px); transition: all 2s ease 0s; width: 2659px;">
								<div class="owl-item cloned"
									style="width: 317.333px; margin-right: 15px;">
									<div class="single-cases-img"></div>
								</div>
								<c:forEach var="i" begin="1" end="1">

									<div class="owl-item cloned"
										style="width: 317.333px; margin-right: 15px;">
										<div class="single-cases-img">

											<img src="<c:url value="/resources/img/Iphone.jpg" />" alt=""
												style="height: 300px; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- img hover caption -->
											<div class="single-cases-cap single-cases-cap2"
												style="width: auto; height: auto; background-color: rgba(255, 255, 255, 0.4); margin-button: 2px;">
												<h4>
													<a href="<c:url value='/manufacturer'/>">Apple</a>
												</h4>
											</div>
										</div>
									</div>
									<div class="owl-item cloned"
										style="width: 317.333px; margin-right: 15px;">
										<div class="single-cases-img">
											<img src="<c:url value="/resources/img/xiaomi.jpg"/>" alt=""
												style="height: 300px; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- img hover caption -->
											<div class="single-cases-cap single-cases-cap2"
												style="width: auto; height: auto; background-color: rgba(255, 255, 255, 0.4); margin-button: 2px;">
												<h4>
													<a href="<c:url value='/product?product-id=1'/>">Xiaomi</a>
												</h4>
											</div>
										</div>
									</div>

									<div class="owl-item cloned"
										style="width: 317.333px; margin-right: 15px;">
										<div class="single-cases-img">
											<img src="<c:url value="/resources/img/samsung.jpg"/>" alt=""
												style="height: 300px; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- img hover caption -->
											<div class="single-cases-cap single-cases-cap2"
												style="width: auto; height: auto; background-color: rgba(255, 255, 255, 0.4); margin-button: 2px;">
												<h4>
													<a href="<c:url value='/product?product-id=1'/>">Samsung</a>
												</h4>
											</div>
										</div>
									</div>
									<div class="owl-item cloned"
										style="width: 317.333px; margin-right: 15px;">
										<div class="single-cases-img">
											<img src="<c:url value="/resources/img/2.jpg"/>" alt=""
												style="height: 300px; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- img hover caption -->
											<div class="single-cases-cap single-cases-cap2"
												style="width: auto; height: auto; background-color: rgba(255, 255, 255, 0.4); margin-button: 2px;">
												<h4>
													<a href="<c:url value='/product?product-id=1'/>">OPPO</a>
												</h4>
											</div>
										</div>
									</div>
									<div class="owl-item cloned"
										style="width: 317.333px; margin-right: 15px;">
										<div class="single-cases-img">
											<img src="<c:url value="/resources/img/3.png"/>" alt=""
												style="height: 300px; border-radius: 10px 10px 10px 10px; border: 1px solid #BDBDBD;">
											<!-- img hover caption -->
											<div class="single-cases-cap single-cases-cap2"
												style="width: auto; height: 20%; background-color: rgba(255, 255, 255, 0.4); margin-top: 2px;">
												<h4>
													<a href="<c:url value='/product?product-id=1'/>">Nokia</a>
												</h4>
											</div>
										</div>
									</div>
								</c:forEach>

							</div>
						</div>
						<div class="owl-nav disabled">
							<div class="owl-prev">prev</div>
							<div class="owl-next">next</div>
						</div>
						<div class="owl-dots disabled"></div>
					</div>

				</div>
			</div>
		</div>
	</div>
</main>