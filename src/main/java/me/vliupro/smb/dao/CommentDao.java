package me.vliupro.smb.dao;

import me.vliupro.smb.po.Comment;

import java.util.List;

/**
 * Created by vliupro on 16-5-23.
 */
public interface CommentDao {

    boolean addComment(Comment comment);

    boolean deleteComment(int commentId);

    List<Comment> getCommentsByWeiboId();
}
