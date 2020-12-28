package service;

import dao.articelDao;
import dao.impl.articleDaoimpl;
import unit.article;

import java.util.List;

public class articeleservice {
    articelDao articleDao=new articleDaoimpl();
    public void addarticle(String userid, String name, String liuyan, String s,String articleid)throws Exception {
        articleDao.addarticle(userid,name,liuyan,s,articleid);
    }

    public List<article> findarticleListbyadminid(String id)throws Exception {
        return articleDao.findarticleListbyadminid(id);
    }

    public article findarticlebyid(String id) throws Exception{
        return articleDao.findarticlebyid(id);
    }

    public void updatearticle(String articleid, String liuyan)throws  Exception {
        articleDao.updatearticle(articleid,liuyan);
    }
}
