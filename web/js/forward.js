/**
 * Created by vliupro on 16-6-7.
 */

var weiboId = null;
$('.forward_a').on('click', function () {
//        console.log($(this).parent().siblings('li.thumb').find('a').data('wid'));
    weiboId = $(this).parent().siblings('li.thumb').find('a').data('wid');
    $('.overlay,.box-forward').fadeIn(200);
});

$('.overlay').on('click', function () {
    $('.overlay,.box-forward').fadeOut(200, function () {
        $(this).removeAttr('style');
    });
});

$('.box-close').on('click', function () {
    $('.overlay,.box-forward').fadeOut(200, function () {
        $(this).removeAttr('style');
    });
});

$('#forward-sub').on('click', function () {
    var content = $('.forward-content textarea').val();
    $.post("/forward",
        {
            'weiboId': weiboId,
            'remark': content
        },
        function (data) {
            window.location.reload(true);
        });
});