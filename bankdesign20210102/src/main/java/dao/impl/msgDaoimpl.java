package dao.impl;

import dao.msgDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import unit.card;
import unit.msg;

import java.util.List;

public class msgDaoimpl implements msgDao {
    public void addmsg(msg msg) throws Exception{
        System.out.println("进入了增加消息层");
        String sql="insert into msg values(?,?,?,?,?) ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,msg.getCardid1(),msg.getCardid2(),msg.getMoney(),msg.getTime(),msg.getMsgid());
    }

    public List<msg> findmsgList() throws Exception {
        System.out.println("进入搜索信息列表");
        String sql="select * from msg";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        List<msg> list=qr.query(sql, new BeanListHandler<msg>(msg.class));
        return list;
    }
}
