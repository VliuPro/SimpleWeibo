package me.vliupro.smb.service;

import me.vliupro.smb.po.Weibo;
import me.vliupro.smb.utils.Page;

import java.util.List;

/**
 * Created by vliupro on 16-5-31.
 */
public interface WeiboService {

    /**
     * 发表微博
     * @param weibo
     * @return
     */
    boolean publish(Weibo weibo);

    /**
     * 删除微博
     * @param weiboId
     * @return
     */
    boolean deleteById(int weiboId);

    /**
     * 根据weiboId获取微博
     * @param weiboId
     * @return
     */
    Weibo getWeiboById(int weiboId);

    /**
     * 获取最新微博，分页
     * @param pageNum
     * @param total
     * @return
     */
    Page<Weibo> getWeibosByPage(int pageNum, int total);

    /**
     *
     * @param userId
     * @return
     */
    List<Weibo> getWeibosByUserId(int userId);
}
