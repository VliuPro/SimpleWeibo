package me.vliupro.smb.dao;

import me.vliupro.smb.po.Follow;

import java.util.List;
import java.util.Map;

/**
 * Created by vliupro on 16-5-23.
 */
public class FollowDaoImpl extends BaseImpl implements FollowDao {

    public boolean addFollow(Follow follow) {
        return false;
    }

    public boolean deleteFollow(int followed) {
        return false;
    }

    public boolean deleteFollowByUser(int followerId, int followedId) {
        return false;
    }

    public List<Integer> getFollowsByFollower(int followerId) {
        return null;
    }

    public List<Integer> getFollowsByFollowed(int followedId) {
        return null;
    }

    @Override
    protected Object generate(Map<String, Object> map) {
        Follow follow = new Follow();
        follow.setFollowId(Integer.parseInt(map.get("id").toString()));
        follow.setFollowerId(Integer.parseInt(map.get("follower_id").toString()));
        follow.setFollowedId(Integer.parseInt(map.get("followed_id").toString()));
        return follow;
    }
}
