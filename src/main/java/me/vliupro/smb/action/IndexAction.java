package me.vliupro.smb.action;

import com.opensymphony.xwork2.ActionSupport;
import me.vliupro.smb.po.User;
import me.vliupro.smb.po.Weibo;
import me.vliupro.smb.service.*;
import me.vliupro.smb.utils.Page;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vliupro on 16-5-30.
 */
public class IndexAction extends ActionSupport {

    WeiboService ws = null;
    UserService us = null;
    FollowService fs = null;

    String begin;
    String total;

    public IndexAction() {
        ws = new WeiboServiceImpl();
        us = new UserServiceImpl();
        fs = new FollowServiceImpl();
    }

    public String noLoginIndex() {
        if (begin == null || total == null) {
            begin = "1";
            total = "10";
        }
        Map<Integer, Object> usersMap = new HashMap<Integer, Object>();
        Page<Weibo> page = ws.getWeibosByPage(Integer.parseInt(begin), Integer.parseInt(total));
        List<Weibo> weibos = page.getItems();
        for (Weibo weibo : weibos) {
            usersMap.put(weibo.getUserId(), us.getUserById(weibo.getUserId()));
            if (weibo.getForwardId() != -1) {
                usersMap.put(weibo.getForwardId(), us.getUserById(weibo.getForwardId()));
            }
        }
        ServletActionContext.getRequest().setAttribute("page", page);
        ServletActionContext.getRequest().setAttribute("idMap", usersMap);
        return SUCCESS;
    }

    public String loginIndex() {
        if (begin == null || total == null) {
            begin = "1";
            total = "10";
        }
        User user = new User();
        //取出session中的user信息存入User对象
        user.mapToUser((Map<String, Object>) ServletActionContext.getRequest().getSession().getAttribute("user"));
        //取出myindex所需要的内容
        List<Integer> users = new ArrayList<>();
        users.add(user.getUserId());
        //由userId获取自己所关注人的ID+上自己的ID放入UserIdList，
        List<Integer> follows = fs.getFollowsByFollowerId(user.getUserId());
        users.addAll(follows);
        //然后根据UserIdList取出Weibo（根据时间排序，每次取total个）
        //以上的微博存入Page
        Page<Weibo> page = ws.getWeibosByListUserIds(users, Integer.parseInt(begin), Integer.parseInt(total));
        //根据Page里面的items中每个weibo的userId获取username后，以userId为键，username为值，存入HashMap，放入request
        Map<Integer, Object> usersMap = new HashMap<>();
        for (Weibo weibo : page.getItems()) {
            usersMap.put(weibo.getUserId(), us.getUserById(weibo.getUserId()));
            if (weibo.getForwardId() != -1) {
                usersMap.put(weibo.getForwardId(), us.getUserById(weibo.getForwardId()));
            }
        }
        //取出自己的关注的人数、关注自己的人数、已发的微博数
        Map<String, Integer> infoMap = new HashMap<>();
        infoMap.put("numFollowing", fs.getFollowerTotal(user.getUserId()));
        infoMap.put("numFollow", fs.getFollowedTotal(user.getUserId()));
        infoMap.put("numWeibo", ws.getWeibosByUserId(user.getUserId()).size());
        //Page放入request, 各个map放入request
        ServletActionContext.getRequest().setAttribute("page", page);
        ServletActionContext.getRequest().setAttribute("idMap", usersMap);
        ServletActionContext.getRequest().setAttribute("infoMap", infoMap);
        return SUCCESS;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
