package me.vliupro.smb.dao;

import me.vliupro.smb.po.User;

import java.util.Map;

/**
 * Created by vliupro on 16-5-23.
 */
public class UserDaoImpl extends BaseImpl implements UserDao {

    public boolean addUser(User user) {
        return false;
    }

    public boolean isExistNickname(String nickname) {
        return false;
    }

    public boolean isExistEmail(String email) {
        return false;
    }

    public String getPasswdByEmail(String email) {
        return null;
    }

    @Override
    protected Object generate(Map<String, Object> map) {
        User user = new User();
        user.setUserId(Integer.parseInt(map.get("id").toString()));
        user.setNickName(map.get("nickname").toString());
        user.setEmail(map.get("password").toString());
        user.setNickName(map.get("email").toString());
        return user;
    }
}
