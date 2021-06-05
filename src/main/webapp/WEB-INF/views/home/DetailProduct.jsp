<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../../common/taglib.jsp"%>

<body style="overflow: visible;">
	<main>
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
			<div class="col-xl-4 col-lg-4">
				<div class="row"> <h3>Điện thoại iPhone 12 Pro 128GB Xám</h3>
				<button class="send-btn" style="width: 20px; height: 10px;">Còn hàng</button>
				</div>
				
				<div class="row" style="background-color: #fafafa;">
					10.000
				</div>
			</div>


		</div>
	</main>


</body>