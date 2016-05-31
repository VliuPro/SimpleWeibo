package me.vliupro.smb.action;

import com.opensymphony.xwork2.ActionSupport;
import me.vliupro.smb.dao.WeiboDao;
import me.vliupro.smb.dao.WeiboDaoImpl;

/**
 * Created by vliupro on 16-5-30.
 */
public class IndexAction extends ActionSupport {

    WeiboDao wd = null;

    public IndexAction() {
        System.out.println("into indexaction");
        wd = new WeiboDaoImpl();
    }

    @Override
    public String execute() {
        System.out.println("Into IndexAction!");
        return SUCCESS;
    }
}
