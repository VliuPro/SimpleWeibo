package me.vliupro.smb.po;

/**
 * Created by vliupro on 16-5-22.
 */
public class User {

    private int userId; // 主键ID
    private String nickName; //昵称
    private String password; //密码
    private String email; //邮箱

    public User(){

    }

    public User(String nickName, String password, String email) {
        this.nickName = nickName;
        this.password = password;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
