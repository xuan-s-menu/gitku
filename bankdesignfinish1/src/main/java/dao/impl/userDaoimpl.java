package dao.impl;

import dao.userDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import unit.admin;
import unit.card;
import unit.user;

import java.util.List;

public class userDaoimpl implements userDao {
    @Override
    public void adduser(user user) throws Exception {
        System.out.println("进入了增加用户层");
        String sql="insert into user values(?,?,?,?) ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,user.getUserid(),user.getUsername(),user.getUserpassword(),user.getUserphone());
    }

    @Override
    public user finduserbyId(String id) throws Exception {
        System.out.println("进入了用户登录层");
        String sql="select * from user where username = ? ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        user user= qr.query(sql, new BeanHandler<user>(user.class),id);
        return user;
    }

    public List<user> finduserList() throws Exception {
        System.out.println("进入搜索用户列表");
        String sql="select * from user";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        List<user> list=qr.query(sql, new BeanListHandler<user>(user.class));
        return list;
    }

    public void deleteruser(String id) throws Exception {
        System.out.println("进入了删除用户层");
        String sql="delete from user where  userid  = ?";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,id);
    }
}
