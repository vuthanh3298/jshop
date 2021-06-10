
function convertTime(time) {
	const m = new Date(time);
	const dateString =
	    m.getUTCFullYear() + "-" +
	    ("0" + (m.getUTCMonth()+1)).slice(-2) + "-" +
	    ("0" + m.getUTCDate()).slice(-2) + " " +
	    ("0" + m.getUTCHours()).slice(-2) + ":" +
	    ("0" + m.getUTCMinutes()).slice(-2) + ":" +
	    ("0" + m.getUTCSeconds()).slice(-2);

	return dateString;
}

$(document).ready(function () {
  $(".btn-update-book").click(function () {
    const id = $(this).attr("data");
    const arrId = id.split("~");
    const time = arrId[2];
    $.ajax({
      url: `/api/book/${id}`,
      type: "GET",
      contentType: "application/json",
      dataType: "json",
      success: function (result) {
        if (result !== null) {
          
          $("#time").val(time);
          $("#productId").val(result.productId);
          $("#userId").val(result.userId);
          $("#name").val(result.name);
          $("#amount").val(result.amount);
          $("#address").val(result.address);//don vi tinh
          $("#paymentMethods").val(result.paymentMethods);
          $("#note").val(result.note);
		 
         
        }
      },
    });
  });

  $(".btn-delete-book").click(function () {
    if (!confirm("Bạn có chắc chắn muốn xoá? ")) {
      return;
    }
    const this2 = $(this);
    const id = $(this).attr("data");
    $.ajax({
      url: `/api/book/${id}`,
      type: "DELETE",
      dataType: "json",
      success: function (result) {
        if (result) {
          this2.closest("tr").remove();
        }
      },
    });
  });
});
