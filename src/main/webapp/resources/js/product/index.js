function formatDate(date) {
  var d = new Date(date),
    month = "" + (d.getMonth() + 1),
    day = "" + d.getDate(),
    year = d.getFullYear();

  if (month.length < 2) month = "0" + month;
  if (day.length < 2) day = "0" + day;

  return [year, month, day].join("-");
}

$(document).ready(function () {
  $(".btn-update-product").click(function () {
    const id = $(this).attr("data");
    $.ajax({
      url: `/api/product/${id}`,
      type: "GET",
      contentType: "application/json",
      dataType: "json",
      success: function (result) {
        if (result !== null) {
          $("#productId").val(result.productId);
          $("#name").val(result.name);
          $("#type").val(result.type);
          $("#manufacturer").val(result.manufacturer);
          $("#position").val(result.position);//don vi tinh
          $("#warrantyPeriod").val(result.warrantyPeriod);
          $("#described").val(result.described);
          $("#price").val(result.price);

         
        }
      },
    });
  });

  $(".btn-delete-product").click(function () {
    if (!confirm("Bạn có chắc chắn muốn xoá? ")) {
      return;
    }
    const this2 = $(this);
    const id = $(this).attr("data");
    $.ajax({
      url: `/api/product/${id}`,
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
