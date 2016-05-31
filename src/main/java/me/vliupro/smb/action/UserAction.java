package me.vliupro.smb.action;

import com.opensymphony.xwork2.ActionSupport;
import me.vliupro.smb.dao.UserDao;
import me.vliupro.smb.dao.UserDaoImpl;
import me.vliupro.smb.po.User;
import me.vliupro.smb.service.UserService;
import me.vliupro.smb.service.UserServiceImpl;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.ActionError;

import java.util.Map;

/**
 * Created by vliupro on 16-5-24.
 */
public class UserAction extends ActionSupport {

    private UserService us;

    public UserAction() {
        us = new UserServiceImpl();
    }

    private String username;
    private String password;
    private String email;
    private String remember;

    /**
     * 登陆
     * @return
     */
    public String login(){
        boolean isRemember = false;
        if (this.getRemember() != null) {
            isRemember = this.remember.equals("on");
        }

        if (email != null) {
            if (User.encryption(password).equals(us.getPasswdByEmail(email))) {
                //取出user信息存入session
                ServletActionContext.getRequest().getSession().setAttribute("user", us.getUserByEmail(email).toMap());
                if(isRemember) {
                    ServletActionContext.getRequest().getSession().setMaxInactiveInterval( 60 * 60 * 24 * 7 );//一个星期
                } else {
                    ServletActionContext.getRequest().getSession().setMaxInactiveInterval( 60 * 60 * 24 );
                }
                return SUCCESS;
            } else {
                addActionError("Password Error!");
            }
        } else {
            addActionError("email is null");
        }
        return ERROR;
    }

    /**
     * 注册
     * @return
     */
    public String register(){
        if (us.checkNickName(username) || us.checkEmail(email)) {
            addActionError("username or email is exist!");
            return ERROR;
        } else {
            User user = new User();
            user.setEmail(email);
            user.setNickName(username);
            user.setPassword(User.encryption(password));
            if (us.addUser(user)) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        }
    }

    /**
     * 登出
     * @return
     */
    public String logout(){
        ServletActionContext.getRequest().getSession().removeAttribute("user");
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }
}
