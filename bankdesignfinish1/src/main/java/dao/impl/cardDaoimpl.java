package dao.impl;

import dao.cardDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import unit.card;
import unit.user;

import java.util.List;

public class cardDaoimpl implements cardDao {
    @Override
    public List<card> findcardbyuserid(String id) throws Exception {
        System.out.println("进入搜索卡片列表");
        String sql="select * from card where userid = ?";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        List<card> list=qr.query(sql, new BeanListHandler<card>(card.class),id);
        return list;
    }

    @Override
    public void addcard(card card) throws Exception {
        System.out.println("进入了增加卡片层");
        String sql="insert into card values(?,?,?,?) ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,card.getCardid(),card.getCardname(),card.getCardmoney(),card.getUserid());
    }

    @Override
    public void removecard(card card) throws Exception {
        System.out.println("进入了删除卡片层");
        String sql="delete from card where  cardname  = ?";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,card.getCardid());
    }

    @Override
    public void moneymove(String id, double money) throws Exception {
        System.out.println("进入了钱数增加层");
        String sql="UPDATE card SET cardmoney = ? WHERE cardname=? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,money,id);
    }

    @Override
    public void moneyin(String id2, double money) throws Exception {
        System.out.println("进入了钱数减少层");
        String sql="UPDATE card SET cardmoney = ? WHERE cardname=? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,money,id2);
    }

    @Override
    public card findcardbycardname(String id) throws Exception {
        System.out.println("进入了查找卡片-通过卡名层");
        String sql="select * from card where  cardname = ? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        card card=qr.query(sql, new BeanHandler<card>(card.class),id);
        return card;
    }

    public List<card> findcardList() throws Exception {
        System.out.println("进入搜索卡片列表(无用户)");
        String sql="select * from card";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        List<card> list=qr.query(sql, new BeanListHandler<card>(card.class));
        return list;
    }

    public void deletecard(String id) throws Exception {
        System.out.println("进入了删除卡片层");
        String sql="delete from card where  cardid  = ?";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,id);
    }
}
