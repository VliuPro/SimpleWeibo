package me.vliupro.smb.dao;

import me.vliupro.smb.po.Weibo;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by vliupro on 16-5-23.
 */
public class WeiboDaoImpl extends BaseImpl implements WeiboDao {

    public boolean addWeibo(Weibo weibo) {
        return false;
    }

    public boolean deleteWeibo(int weiboId) {
        return false;
    }

    public Weibo getWeiboById(int weiboId) {
        return null;
    }

    public List<Weibo> getWeibosLimited(int begin, int total) {
        return null;
    }

    public List<Weibo> getWeibosByUserId(int userId) {
        return null;
    }

    public List<Weibo> getWeibosByListUserIds(List<Integer> userIds) {
        return null;
    }

    @Override
    protected Object generate(Map<String, Object> map) {
        Weibo weibo = new Weibo();
        weibo.setWeiboId(Integer.parseInt(map.get("id").toString()));
        weibo.setUserId(Integer.parseInt(map.get("user_id").toString()));
        weibo.setwContent(map.get("w_content").toString());
        weibo.setwCtime((new java.util.Date(((Timestamp) map.get("w_ctime")).getTime())));
        weibo.setOriginal(Integer.parseInt(map.get("isOriginal").toString()) == 1);
        weibo.setRemark(map.get("remark").toString());
        return weibo;
    }
}
