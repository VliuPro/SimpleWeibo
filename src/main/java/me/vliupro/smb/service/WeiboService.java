package me.vliupro.smb.service;

import me.vliupro.smb.po.Weibo;
import me.vliupro.smb.utils.Page;

import java.util.List;

/**
 * Created by vliupro on 16-5-31.
 */
public interface WeiboService {

    boolean publish(Weibo weibo);

    boolean deleteById(int weiboId);

    Weibo getWeiboById(int weiboId);

    Page<Weibo> getWeibosByPage(int pageNum, int total);

    List<Weibo> getWeibosByUserId(int userId);
}
