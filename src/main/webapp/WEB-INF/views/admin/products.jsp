<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../../common/taglib.jsp"%>
<div>
	<div style="text-align: right;">
		<button type="button" class="btn btn-primary add-user"
			data-toggle="modal" data-target="#addUser"
			style="margin-bottom: 2px;">Thêm</button>
	</div>
	<table class="table table-hover table-bordered table-striped"
		style="text-align: center; background-color: white;">
		<thead>
			<tr>

				<th scope="col">mã hàng</th>
				<th scope="col">tên hàng</th>
				<th scope="col">loại hàng</th>
				<th scope="col">hãng sản xuất</th>
				<th scope="col">đơn vị tính</th>
				<th scope="col">thời gian bảo hành</th>
				<th scope="col">số lượng tồn kho</th>
				<th scope="col">Mô tả</th>
				<th scope="col">giá</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${products}">
				<tr style="font-size: 13px; font-family: thin">
					<th scope="col">${product.productId}</th>
					<th scope="col">${product.name}</th>
					<th scope="col">${product.type}</th>
					<th scope="col">${product.manufacturer}</th>
					<th scope="col">${product.unit}</th>

					<th scope="col">${product.warrantyPeriod}</th>
					<th scope="col">${product.inventory}</th>
					<th scope="col">${product.described}</th>
					<th scope="col">${product.price}</th>

					<th>
						<div style="display: inline-flex;">
							<svg class="btn-hover" style="margin: 4px;"
								xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-pencil-fill"
								viewBox="0 0 16 16">
												  <path
									d="M12.854.146a.5.5 0 0 0-.707 0L10.5 1.793 14.207 5.5l1.647-1.646a.5.5 0 0 0 0-.708l-3-3zm.646 6.061L9.793 2.5 3.293 9H3.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.207l6.5-6.5zm-7.468 7.468A.5.5 0 0 1 6 13.5V13h-.5a.5.5 0 0 1-.5-.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.5-.5V10h-.5a.499.499 0 0 1-.175-.032l-.179.178a.5.5 0 0 0-.11.168l-2 5a.5.5 0 0 0 .65.65l5-2a.5.5 0 0 0 .168-.11l.178-.178z"></path>
												</svg>
							<svg class="btn-hover" style="margin: 4px;"
								xmlns="http://www.w3.org/2000/svg" width="16" height="16"
								fill="currentColor" class="bi bi-trash-fill" viewBox="0 0 16 16">
												  <path
									d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 1 0z" />
												</svg>
						</div>

					</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
