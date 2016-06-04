/**
 * Created by vliupro on 16-6-3.
 */

// 发送ajax请求之后，刷新a标签的点击状态以及点赞数目和点赞与否

$('.WB_handle_in ul li.thumb a.thumbing').bind('click', function () {
    var thumb = $(this);
    var wId = thumb.data('wid');
    // console.log('wid: ' + wId);
    $.ajax({
        url: '/thumb/thumbing',
        data: {'weiboId': wId},
        success: function (data) {
            // console.log(thumb);
            // console.log(data);
            if (data['status'] === 1) {
                thumb.attr('class', 'thumbed');
                thumb.removeAttr('href');
                thumb.unbind('click');
                thumb.children('.spa').children('span').html('已赞');
                thumb.children('.spa').children('em').html(data['thumb_num']);
            }
        }
    })
});
