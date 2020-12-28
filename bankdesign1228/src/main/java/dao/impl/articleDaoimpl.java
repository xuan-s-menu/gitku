package dao.impl;

import dao.articelDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import unit.admin;
import unit.article;
import unit.card;

import java.util.List;

public class articleDaoimpl implements articelDao {
    public void addarticle(String userid, String name, String liuyan, String s,String articleid) throws Exception {
        System.out.println("进入了增加留言层");
        String sql="insert into article values(?,?,?,?,?) ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,userid,name,liuyan,s,articleid);
    }

    public List<article> findarticleListbyadminid(String id) throws Exception {
        System.out.println("进入查找留言列表");
        String sql="select * from article where adminid = ?";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        List<article> list=qr.query(sql, new BeanListHandler<article>(article.class),id);
        return list;
    }

    public article findarticlebyid(String id) throws Exception {
        System.out.println("进入了查找留言层");
        String sql="select * from article where articleid = ? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        article article= qr.query(sql, new BeanHandler<article>(article.class),id);
        return article;
    }

    public void updatearticle(String articleid, String liuyan) throws Exception {
        System.out.println("进入了留言更改层");
        String sql="UPDATE article SET answer = ? WHERE articleid=? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,liuyan,articleid);
    }
}
