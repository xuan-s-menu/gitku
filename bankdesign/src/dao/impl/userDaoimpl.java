package dao.impl;

import dao.userDao;
import org.apache.commons.dbutils.QueryRunner;
import unit.user;

public class userDaoimpl implements userDao {
    @Override
    public void adduser(user user) throws Exception {
        System.out.println("进入了增加用户层");
        String sql="insert into user values(?,?,?,?,?) ";
        QueryRunner qr= util.BaseUtils.getQueryRunner();
        qr.update(sql,user.getUserid(),user.getUsername(),user.getUserpassword(),user.getUserphone(),user.getCardid());
    }
}
