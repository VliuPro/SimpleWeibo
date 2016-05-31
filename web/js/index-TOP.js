/*返回顶部*/
$(document).ready(function() {
    $("#backtop").hide();
    $(function() {
        $(window).scroll(function() {
            if ($(window).scrollTop() > 100) {
                $("#backtop").fadeIn(500);
            } else {
                $("#backtop").fadeOut(500);
            }
        });
        $("#backtop").click(function() {
            $('body,html').animate({ scrollTop: 0 }, 100);
            return false;
        });
    });
});

function move() {
    document.getElementById("handle_comt").style.display = "";

}



/* 点击评论弹出评论框*/
function change2() {
    document.getElementById("handle_comt").style.display = "";
}
