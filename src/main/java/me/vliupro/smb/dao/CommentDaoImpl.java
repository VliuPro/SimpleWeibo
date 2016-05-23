package me.vliupro.smb.dao;

import me.vliupro.smb.po.Comment;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by vliupro on 16-5-23.
 */
public class CommentDaoImpl extends BaseImpl implements CommentDao {

    public boolean addComment(Comment comment) {
        return false;
    }

    public boolean deleteComment(int commentId) {
        return false;
    }

    public List<Comment> getCommentsByWeiboId() {
        return null;
    }

    @Override
    protected Object generate(Map<String, Object> map) {
        Comment comment = new Comment();
        comment.setCommentId(Integer.parseInt(map.get("id").toString()));
        comment.setcContent(map.get("c_content").toString());
        comment.setUserId(Integer.parseInt(map.get("user_id").toString()));
        comment.setWeiboId(Integer.parseInt(map.get("weibo_id").toString()));
        comment.setcCtime(new java.util.Date(((Timestamp) map.get("w_ctime")).getTime()));
        return comment;
    }
}
