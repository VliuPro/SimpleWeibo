<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vliupro
  Date: 16-5-30
  Time: 下午2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
	<meta charset="utf-8">
    <title>我的首页 微博-随时随地发现新鲜事</title>
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/index.css" />" />
    <link rel="stylesheet" type="text/css" href="<s:url value="/css/myindex.css" />" />
    <script src="<s:url value="/js/myindex.js" />" type="text/javascript"></script>
</head>

<body>
    <div class="WB_myindex">
        <div class="WB_mymain">
            <div class="blog_top">
                <!--顶部导航栏-->
                <div class="top_inner clearfix">
                    <div class="top_logo">
                        <a href="<s:url value="/main/index.jsp" />"><img src="<s:url value="/images/logo2.png" />" /><em><h2 class="logo_t">微博</h2></em></a>
                    </div>
                    <!--顶部logo-->
                    <div class="search">
                        <input type="text" node-type="searchInput" class="search_input" placeholder="你想知道的这里都有……" />
                        <input type="button" value="搜索" title="搜索" id="ficon_search" class="ficon_search" onmouseover="color()" onmouseout="colorout()" onclick="" />
                    </div>
                    <!--搜索框-->
                    <div class="top_nav">
                        <ul class="nav_list">
                            <!--顶部右侧首页和个人-->
                            <li>
                                <a href="<s:url value="/main/index.jsp" />" title="首页">
                                    <img src="<s:url value="/images/home1.png" />" class="list_img" />
                                    <span class="nav_span1">首页</span>
                                </a>
                            </li>
                            <li>
                                <a href="<s:url value="/main/personal.jsp" />" title="" onMouseOver="On(0)" onMouseOut="Off(0)">
                                    <img src="<s:url value="/images/person1.png" />" class="list_img" id="list_img" name="img0" onmousemove="color()" />
                                    <span>用户名</span>
                                </a>
                            </li>
                            <li>|</li>
                            <li>
                                <a href="" onclick="">退出</a>
                            </li>
                        </ul>
                    </div>
                    <!--消息提醒和个人-->
                </div>
            </div>
            <!--顶部导航栏到此结束-->
            <div class="blog_main clearfix">
                <!--中部主体内容-->
                <div class="WB_mymain">
                    <div class="WB_frame_c clearfix">
                        <!--my主体左边全部内容-->
                        <!--信息发布框-->
                        <div class="content_publish">
                            <div class="content_publish_in clearfix">
                                <div class="title">
                                    <img src="<s:url value="/images/title_in.png" />" />
                                </div>
                                <div class="input">
                                    <textarea class="W_input_in" title="微博输入框"></textarea>
                                </div>
                                <div class="func_pub">
                                    <div class="kind">
                                    </div>
                                    <div class="func">
                                        <input type="button" value="发布" class="ficon_search" onclick="" />
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="content_feed">
                            <!--每一条微博的格式-->
                            <div class="WB_frame_content">
                                <div class="content_detail clearfix">
                                    <!--微博详情-->
                                    <div class="user_info">
                                        <!--用户信息-->
                                        <div class="userPic">
                                            <a href="" target="_blank" title=""><img src="<s:url value="/images/WB_frame_content/userPic.jpg" />" title="" /></a>
                                        </div>
                                        <div class="userName">
                                            <a href="" target="_blank" title="" class="name">幽默段子坊</a>
                                            <p>2016.05.22</p>
                                        </div>
                                    </div>
                                    <div class="WB_text">
                                        <!--微博文字内容-->
                                        当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌才是第三者,我错怪林心如了。。。。
                                    </div>
                                    <div class="WB_media">
                                        <!--微博图片-->
                                        <div class="mediabox">
                                            <a target="_blank" href="<s:url value="/images/WB_frame_content/media-pic.jpg" />">
                                                <img src="<s:url value="/images/WB_frame_content/media-pic.jpg" />" />
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <div class="WB_handle">
                                    <!---微博互动栏点赞评论等-->
                                    <div class="WB_handle_in">
                                        <ul>
                                            <li>
                                                <a href="javascript:void(0);" title="转发">
                                                    <span class="spa"><img src="<s:url value="/images/Share.png" />" /><span class="handtxt">转发</span><em>15</em></span>
                                                </a>
                                            </li>
                                            <li class="curr">
                                                <a href="javascript:void(0);" title="评论" onclick="change1()">
                                                    <span class="spa"><img src="<s:url value="/images/Dialog.png" />" /><span class="handtxt">评论</span><em>203</em></span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" title="赞">
                                                    <span class="spa"><img src="<s:url value="/images/up.png" />" /><span class="handtxt">赞</span><em>15</em></span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <!--点赞评论区域结束-->
                                <!--互动评论区域display:none--->
                                <div class="handle_comt clearfix" id="handle_comt_1" style="display:none">
                                    <div class="comt_list">
                                        <div class="comt_publish">
                                            <!---发布信息框-->
                                            <div class="WB_publish clearfix">
                                                <div class="p_input">
                                                    <textarea class="W_input" action-type="check" cols="" rows=""></textarea>
                                                </div>
                                                <div class="p_opt">
                                                    <input type="submit" class="p_opt_btn" value="评论" />
                                                </div>
                                            </div>
                                        </div>
                                        <!--发布框结束-->
                                        <div class="repeat_list">
                                            <!--评论内容外框架-->
                                            <div class="list_box">
                                                <!--评论内容内框架-->
                                                <div coment_id="" class="list_li clearfix">
                                                    <div class="WB_face">
                                                        <img src="<s:url value="/images/WB_frame_content/userPic2.jpg" />" />
                                                    </div>
                                                    <div class="list_con clearfix">
                                                        <span class="WB_username">hahahah </span>
                                                        <!--用户名-->
                                                        <br />
                                                        <p class="repeat_text">
                                                            当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌
                                                        </p>
                                                        <!--评论的内容-->
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="list_box">
                                                <!--评论内容内框架-->
                                                <div coment_id="" class="list_li clearfix">
                                                    <div class="WB_face">
                                                        <img src="<s:url value="/images/WB_frame_content/userPic2.jpg" />" />
                                                    </div>
                                                    <div class="list_con">
                                                        <span class="WB_username">hahahah </span>
                                                        <!--用户名-->
                                                        <br />
                                                        <p class="repeat_text">
                                                            当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌原在看看后两张，原来胡歌
                                                        </p>
                                                        <!--评论的内容-->
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--用户评论内容区结束-->
                                    </div>
                                </div>
                                <!--互动评论区结束-->
                            </div>
                            <!--单条微博结束-->
                            <!--每一条微博的格式-->
                            <div class="WB_frame_content">
                                <div class="content_detail clearfix">
                                    <!--微博详情-->
                                    <div class="user_info">
                                        <!--用户信息-->
                                        <div class="userPic">
                                            <a href="" target="_blank" title=""><img src="<s:url value="/images/WB_frame_content/userPic.jpg" />" title="" /></a>
                                        </div>
                                        <div class="userName">
                                            <a href="" target="_blank" title="" class="name">幽默段子坊</a>
                                            <p>2016.05.22</p>
                                        </div>
                                    </div>
                                    <div class="WB_text">
                                        <!--微博文字内容-->
                                        当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌才是第三者,我错怪林心如了。。。。
                                    </div>
                                    <div class="WB_media">
                                        <!--微博图片-->
                                        <div class="mediabox">
                                            <a target="_blank" href="<s:url value="/images/WB_frame_content/media-pic.jpg" />">
                                                <img src="<s:url value="/images/WB_frame_content/media-pic.jpg" />" />
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                <div class="WB_handle">
                                    <!---微博互动栏点赞评论等-->
                                    <div class="WB_handle_in">
                                        <ul>
                                            <li>
                                                <a href="javascript:void(0);" title="转发">
                                                    <span class="spa"><img src="<s:url value="/images/Share.png" />" /><span class="handtxt">转发</span><em>15</em></span>
                                                </a>
                                            </li>
                                            <li class="curr">
                                                <a href="javascript:void(0);" title="评论" onclick="change2()">
                                                    <span class="spa"><img src="<s:url value="/images/Dialog.png" />" /><span class="handtxt">评论</span><em>203</em></span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="javascript:void(0);" title="赞">
                                                    <span class="spa"><img src="<s:url value="/images/up.png" />" /><span class="handtxt">赞</span><em>15</em></span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <!--点赞评论区域结束-->
                                <!--互动评论区域display:none--->
                                <div class="handle_comt clearfix" id="handle_comt_2" style="display:none">
                                    <div class="comt_list">
                                        <div class="comt_publish">
                                            <!---发布信息框-->
                                            <div class="WB_publish clearfix">
                                                <div class="p_input">
                                                    <textarea class="W_input" action-type="check" cols="" rows=""></textarea>
                                                </div>
                                                <div class="p_opt">
                                                    <input type="submit" class="p_opt_btn" value="评论" />
                                                </div>
                                            </div>
                                        </div>
                                        <!--发布框结束-->
                                        <div class="repeat_list">
                                            <!--评论内容外框架-->
                                            <div class="list_box">
                                                <!--评论内容内框架-->
                                                <div coment_id="" class="list_li clearfix">
                                                    <div class="WB_face">
                                                        <img src="<s:url value="/images/WB_frame_content/userPic2.jpg" />" />
                                                    </div>
                                                    <div class="list_con clearfix">
                                                        <span class="WB_username">hahahah </span>
                                                        <!--用户名-->
                                                        <br />
                                                        <p class="repeat_text">
                                                            当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌
                                                        </p>
                                                        <!--评论的内容-->
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="list_box">
                                                <!--评论内容内框架-->
                                                <div coment_id="" class="list_li clearfix">
                                                    <div class="WB_face">
                                                        <img src="<s:url value="/images/WB_frame_content/userPic2.jpg" />" />
                                                    </div>
                                                    <div class="list_con">
                                                        <span class="WB_username">hahahah </span>
                                                        <!--用户名-->
                                                        <br />
                                                        <p class="repeat_text">
                                                            当时我们看国剧盛典眼中只看到胡霍二人的恩爱，现在看看后两张，原来胡歌原在看看后两张，原来胡歌
                                                        </p>
                                                        <!--评论的内容-->
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--用户评论内容区结束-->
                                    </div>
                                </div>
                                <!--互动评论区结束-->
                            </div>
                            <!--单条微博结束-->
                        </div>
                    </div>
                    <!--myindex主体左边结束-->
                    <!--myindex主体右边全部内容-->
                    <div class="WB_frame_d clearfix">
                        <div class="person_info">
                            <div class="cover">
                                <div class="head_pic">
                                    <a href="" title="">
                                        <img src="<s:url value="/images/WB_frame_content/userPic2.jpg" />" />
                                    </a>
                                </div>
                            </div>
                            <div class="WB_innerwrap">
                                <div class="log_userName">
                                    <a href="" title=""><strong>我是愤青Vliu</strong></a>
                                </div>
                                <div class="info_detail">
                                    <ul>
                                        <li class="info_txt1">
                                            <a href=""><strong>关注</strong><br />
                                                <span class="info_txt2">114</span></a>
                                        </li>
                                        <li class="info_txt1">
                                            <a href=""><strong>粉丝</strong><br />
                                                <span class="info_txt2">22</span></a>
                                        </li>
                                        <li>
                                            <a href=""><strong>微博</strong><br />
                                                <span class="info_txt2">185</span></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!--小资料卡-->
                        <div class="WB_frameb">
                            <!--第 2 个右侧浮窗-->
                            <div class="b_tuijian">
                                <div class="tuijian_title">
                                    <h4>微博推荐</h4>
                                </div>
                                <div class="tuijian_cont clearfix">
                                    <div class="tuijian_inner">
                                        <ul>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                            <li><a href="" title="完美特工明日上映" class="txt1">完美特工明日上映</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--第 2 个右侧浮窗结束-->
                    </div>
                    <!--右侧内容结束-->
                </div>
            </div>
            <!--中部主体内容到此结束-->
        </div>
        <!--内 结束-->
    </div>
    <!--外 结束-->
    <div id="backtop" style="display: block;">
        <a href="#top"></a>
    </div>
    <div id="b_foot"></div>
    <!---底部footer开始-->
    <div class="footer">
        <div class="footer_link clearfix">
            <dl class="list">
                <dt>合作&推荐 </dt>
                <dd>联系邮箱：bragg_chen@163.com</dd>
                <dd><a href="http://www.baidu.com/" target="_blank">百度搜索</a></dd>
            </dl>
            <dl class="list">
                <dt>微博帮助</dt>
                <dd><a href="http://www.baidu.com/" target="_blank">意见反馈</a></dd>
                <dd><a href="http://www.baidu.com/" target="_blank">常见问题</a></dd>
            </dl>
            <dd><a target="_blank" href="http://weibo.com/aj/static/jicp.html?_wv=6">京ICP证100780号</a> </dd>
            <dd><a href="http://www.miibeian.gov.cn" target="__blank">京ICP备12002058号</a></dd>
        </div>
        <div class="footer_link2">
            <span>Copyright © 2009-2016 WEIBO 常熟理工学院软件132班J2EE</span>
            <a target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11000002000019"><img src="<s:url value="/images/gongan.jpg" />" />京公网安备11000002000019号</a>
        </div>
    </div>
    <!---底部信息栏结束-->
</body>

</html>
