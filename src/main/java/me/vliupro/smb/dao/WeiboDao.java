package me.vliupro.smb.dao;

import me.vliupro.smb.po.Weibo;

import java.util.List;

/**
 * Created by vliupro on 16-5-23.
 */
public interface WeiboDao {

    boolean addWeibo(Weibo weibo);

    boolean deleteWeibo(int weiboId);

    Weibo getWeiboById(int weiboId);

    List<Weibo> getWeibosLimited(int begin, int total);

    List<Weibo> getWeibosByUserId(int userId);

    List<Weibo> getWeibosByListUserIds(List<Integer> userIds);
}
