package me.vliupro.smb.dao;

import me.vliupro.smb.po.User;

import java.util.Map;

/**
 * Created by vliupro on 16-5-23.
 */
public class UserDaoImpl extends BaseImpl implements UserDao {

    public boolean addUser(User user) {
        String sql = "insert db_user (nickname, password, email) values(?,?,?)";
        int count = this.db.update(sql, user.getNickName(), user.getPassword(), user.getEmail());
        return count > 0;
    }

    public boolean isExistNickname(String nickname) {
        String sql = "select nickname from db_user where nickname=?";
        Map<String, Object> map = this.db.query(sql, nickname);
        return map.get("nickname") != null;
    }

    public boolean isExistEmail(String email) {
        String sql = "select email from db_user where email=?";
        Map<String, Object> map = this.db.query(sql, email);
        return map.get("email") != null;
    }

    public String getPasswdByEmail(String email) {
        String sql = "select password from db_user where email=?";
        String passwd = this.db.query(sql, email).get("password").toString();
        return passwd;
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
