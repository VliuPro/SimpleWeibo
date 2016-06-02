package me.vliupro.smb.service;

import me.vliupro.smb.dao.WeiboDao;
import me.vliupro.smb.dao.WeiboDaoImpl;
import me.vliupro.smb.po.Weibo;
import me.vliupro.smb.utils.Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vliupro on 16-5-31.
 */
public class WeiboServiceImpl implements WeiboService {

    private WeiboDao wd = new WeiboDaoImpl();

    @Override
    public boolean publish(Weibo weibo) {
        return wd.addWeibo(weibo);
    }

    @Override
    public boolean deleteById(int weiboId) {
        return wd.deleteWeibo(weiboId);
    }

    @Override
    public Weibo getWeiboById(int weiboId) {
        return wd.getWeiboById(weiboId);
    }

    @Override
    public Page<Weibo> getWeibosByPage(int pageNum, int total) {
        Page<Weibo> weiboPage = new Page<>();
        weiboPage.setCurrentPage(pageNum);
        weiboPage.setEveryPage(total);
        weiboPage.setTotalCount(wd.getTotalNum());
        weiboPage.setTotalPage(weiboPage.getTotalCount() % total == 0 ?
                weiboPage.getTotalCount() / total : weiboPage.getTotalCount() / total + 1);
        weiboPage.setHasNextPage(weiboPage.getCurrentPage() < weiboPage.getTotalPage());
        weiboPage.setHasPrePage(weiboPage.getCurrentPage() > 1);
        weiboPage.setItems(wd.getWeibosLimited((pageNum - 1) * total, total));
        return weiboPage;
    }

    @Override
    public List<Weibo> getWeibosByUserId(int userId) {
        return wd.getWeibosByUserId(userId);
    }

    @Override
    public Page<Weibo> getWeibosByListUserIds(List<Integer> userIds, int pageNum, int total) {
        Page<Weibo> weiboPage = new Page<>();
        List<Weibo> weibos = new ArrayList<>();
        weiboPage.setCurrentPage(pageNum);
        weiboPage.setEveryPage(total);
        for (int userId : userIds) {
            weibos.addAll(this.getWeibosByUserId(userId));
        }
        //倒序排序
        Collections.sort(weibos);
        weiboPage.setTotalCount(weibos.size());
        weiboPage.setTotalPage(weiboPage.getTotalCount() % total == 0 ?
                weiboPage.getTotalCount() / total : weiboPage.getTotalCount() / total + 1);
        weiboPage.setHasNextPage(weiboPage.getCurrentPage() < weiboPage.getTotalPage());
        weiboPage.setHasPrePage(weiboPage.getCurrentPage() > 1);
        //如果当前页在1～end-1之间，
        if (weiboPage.getCurrentPage() < weiboPage.getTotalPage() && weiboPage.getCurrentPage() >= 1) {
            weiboPage.setItems(weibos.subList((pageNum - 1) * total, (pageNum) * total));
        } else {
            weiboPage.setItems(weibos.subList((pageNum - 1) * total, weiboPage.getTotalCount()));
        }
        return weiboPage;
    }
}
