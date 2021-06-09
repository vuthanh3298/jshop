$(document).ready(function () {
  $("#checkbox-all-cart-product").click(function () {
    const isChecked = this.checked;
    $(".checkbox-cart-product").each(function () {
      this.checked = isChecked;
    });
  });

  $("#btn-dat-mua").click(function (e) {
    e.preventDefault();
    let cartIdArr = [];
    $(".checkbox-cart-product").each(function () {
      if (this.checked) {
        cartIdArr.push(this.attributes.cartid.value);
      }
    });

    if (!cartIdArr.length) {
      confirm("Bạn chưa chọn sản phẩm nào");
      return;
    }

    let cartIds = cartIdArr.join("~");
    $("#cartIds").val(cartIds);

    $("#form-dat-mua").submit();
  });
});
