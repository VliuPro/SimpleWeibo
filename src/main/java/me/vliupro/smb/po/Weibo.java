package me.vliupro.smb.po;

import java.util.Date;

/**
 * Created by vliupro on 16-5-22.
 */
public class Weibo {

    private int weiboId; //主键ID
    private String wContent; //微博主体内容
    private int userId; //发表微博用户
    private Date wCtime; //发表微博时间
    private boolean isOriginal; //是否原创
    private String remark = ""; //转发评论

    public Weibo() {

    }

    public Weibo(String wContent, int userId, boolean isOriginal, String remark) {
        this.wContent = wContent;
        this.userId = userId;
        this.wCtime = new Date();
        this.isOriginal = isOriginal;
        this.remark = remark;
    }

    public int getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(int weiboId) {
        this.weiboId = weiboId;
    }

    public String getwContent() {
        return wContent;
    }

    public void setwContent(String wContent) {
        this.wContent = wContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getwCtime() {
        return wCtime;
    }

    public void setwCtime(Date wCtime) {
        this.wCtime = wCtime;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    public void setOriginal(boolean original) {
        isOriginal = original;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}