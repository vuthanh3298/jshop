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
			<div class="row">
				<c:forEach var="i" begin="1" end="4">
					<div class="col-xl-3 col-lg-3 col-md-6">
						<a class="small" href="<c:url value='/detail'/>">
							<div class="single-profile mb-30"
								style="background-color: white; border-radius: 10px 10px 10px 10px;">
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

		</div>
	</div>


	<!-- Team-profile End-->
	<script type="text/javascript">
		// <![CDATA[
		$(function() {
			$(".title").each(function(i) {
				len = $(this).text().length;
				if (len > 80) {
					$(this).text($(this).text().substr(0, 60) + '...');
				}
			});
		});
	</script>

	<script src="/js/web/TimKiem.js"></script>
</main>