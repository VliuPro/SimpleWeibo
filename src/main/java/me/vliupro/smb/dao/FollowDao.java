package me.vliupro.smb.dao;

import me.vliupro.smb.po.Follow;

import java.util.List;

/**
 * Created by vliupro on 16-5-23.
 */
public interface FollowDao {

    boolean addFollow(Follow follow);

    boolean deleteFollow(int followed);

    boolean deleteFollowByUser(int followerId, int followedId);

    List<Integer> getFollowsByFollower(int followerId);

    List<Integer> getFollowsByFollowed(int followedId);

}
