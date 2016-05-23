package me.vliupro.smb.dao;

import me.vliupro.smb.po.User;

/**
 * Created by vliupro on 16-5-23.
 */
public interface UserDao {

    boolean addUser(User user);

    boolean isExistNickname(String nickname);

    boolean isExistEmail(String email);

    String getPasswdByEmail(String email);

}
