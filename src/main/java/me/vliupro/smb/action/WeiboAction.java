package me.vliupro.smb.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import me.vliupro.smb.dao.WeiboDao;
import me.vliupro.smb.dao.WeiboDaoImpl;
import me.vliupro.smb.po.Weibo;
import me.vliupro.smb.service.WeiboService;
import me.vliupro.smb.service.WeiboServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by vliupro on 16-5-24.
 */
public class WeiboAction extends ActionSupport {

    private WeiboService ws;

    public WeiboAction() {
        ws = new WeiboServiceImpl();
    }

    public String content;

    public String publish() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Map<String, Object> userMap = (Map<String, Object>) session.getAttribute("user");
        //判断session中是否存在user对象，存在就允许发微博
        if (userMap != null) {
            Weibo weibo = new Weibo();
            weibo.setwContent(content);
            weibo.setUserId(Integer.parseInt(userMap.get("id").toString()));
            weibo.setwCtime(new java.util.Date());
            weibo.setOriginal(true);
            weibo.setRemark("");
            if (ws.publish(weibo)) {
                ServletActionContext.getRequest().setAttribute("pub_weibo", weibo);
                List<Weibo> weibos = ws.getWeibosByUserId(Integer.parseInt(userMap.get("id").toString()));
                ServletActionContext.getRequest().setAttribute("weibos", weibos);
                return SUCCESS;
            } else {
                return ERROR;
            }
        } else {
            return ERROR;
        }
    }
}
