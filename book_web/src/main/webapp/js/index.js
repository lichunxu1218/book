$(function () {
    var sid = window.sessionStorage.getItem("sid");
    // alert("sid->>>" + sid)
    if (sid == null) {
        sid = ""
    }
    //$(".search input").val() 内容无内容时，默认undefined
    var bname = $(".search input").val();

    if (bname == undefined || bname == null) {
        bname = "";
    }

    book_list(1)
})

//发送url请求
function book_list(page, sid, bname) {
    // alert("文本框内容" + bname)
    //查询图书信息， 可以根据图书名查询，商家id查询，商家id+图书名查询
    $.ajax({
        url: "http://localhost:8666/book/getAll",
        data: "page=" + page + "&sid=" + sid + "&bname=" + bname,
        type: "get",
        dataType: "json",
        success: function (obj) {
            // alert(obj.code)
            if (obj.code == 1) {
                //数据展示
                book(obj.data.list, sid, bname);
            }
        }

    });
}

//数据展示
function book(list, sid, bname) {

}