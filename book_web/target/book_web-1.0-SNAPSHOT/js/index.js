$(function () {
    showbook(1)
})

//展示图书
function showbook(page) {
    var sid = window.sessionStorage.getItem("sid");
    alert("sid->>>" + sid)
    if (sid == null) {
        sid = ""
    }
    var bname =""
    bname = $(".search input").val();
    if(bname == undefined){
        bname ="";
    }
    alert("文本框内容" + bname)
    //查询图书信息， 可以根据图书名查询，商家id查询，商家id+图书名查询
    $.ajax({
        url: "http://localhost:8666/book/getAll",
        data: "page=" + page + "&sid=" + sid + "&bname=" + bname,
        type: "get",
        dataType: "json",
        success: function (obj) {
            alert(obj.code)
        }

    });
}